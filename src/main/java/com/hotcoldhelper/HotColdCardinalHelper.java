/*
 * Copyright (c) 2025, Lalochazia
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.hotcoldhelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.coords.WorldPoint;

@Slf4j
public class HotColdCardinalHelper {

    public static Map<String, Integer> calculateCardinalInfoGain(List<WorldPoint> possibleLocations, WorldPoint currentLocation) {
        if (possibleLocations == null || possibleLocations.isEmpty() || currentLocation == null) {
            return new HashMap<>();
        }

        Map<String, Integer> infoGain = new HashMap<>();
        int step = 2;
        Map<String, WorldPoint> cardinalPoints = new HashMap<>();
        cardinalPoints.put("North", new WorldPoint(currentLocation.getX(), currentLocation.getY() + step, currentLocation.getPlane()));
        cardinalPoints.put("East", new WorldPoint(currentLocation.getX() + step, currentLocation.getY(), currentLocation.getPlane()));
        cardinalPoints.put("South", new WorldPoint(currentLocation.getX(), currentLocation.getY() - step, currentLocation.getPlane()));
        cardinalPoints.put("West", new WorldPoint(currentLocation.getX() - step, currentLocation.getY(), currentLocation.getPlane()));

        for (Map.Entry<String, WorldPoint> entry : cardinalPoints.entrySet()) {
            String direction = entry.getKey();
            WorldPoint newPoint = entry.getValue();

            int signalQualityScore = calculateSignalQualityScore(possibleLocations, currentLocation, newPoint);
            infoGain.put(direction, signalQualityScore);
        }
        return infoGain;
    }

    private static int calculateSignalQualityScore(List<WorldPoint> possibleLocations,
                                                   WorldPoint currentLocation,
                                                   WorldPoint newPoint) {
        int totalLocations = possibleLocations.size();
        if (totalLocations <= 1) return 0;

        Map<String, Integer> signalCounts = new HashMap<>();
        signalCounts.put("warmer", 0);
        signalCounts.put("colder", 0);
        signalCounts.put("same", 0);

        for (WorldPoint location : possibleLocations) {
            int currentDistance = calculateDistance(currentLocation, location);
            int newDistance = calculateDistance(newPoint, location);

            if (newDistance < currentDistance) {
                signalCounts.put("warmer", signalCounts.get("warmer") + 1);
            } else if (newDistance > currentDistance) {
                signalCounts.put("colder", signalCounts.get("colder") + 1);
            } else {
                signalCounts.put("same", signalCounts.get("same") + 1);
            }
        }
        int uniqueSignalTypes = (int) signalCounts.values().stream().filter(count -> count > 0).count();
        int balanceScore = 0;
        for (int count : signalCounts.values()) {
            if (count > 0) {
                balanceScore += count * (totalLocations - count);
            }
        }
        return (uniqueSignalTypes * 1000) + (balanceScore / 100);
    }

    private static int calculateDistance(WorldPoint p1, WorldPoint p2) {
        return Math.max(Math.abs(p1.getX() - p2.getX()), Math.abs(p1.getY() - p2.getY()));
    }

    public static class BestCardinalResult {
        private final String direction;
        private final int score;

        public BestCardinalResult(String direction, int score) {
            this.direction = direction;
            this.score = score;
        }

        public String getDirection() {
            return direction;
        }

        public int getScore() {
            return score;
        }
    }

    public static BestCardinalResult findBestCardinalDirection(Map<String, Integer> cardinalInfoGain) {
        if (cardinalInfoGain == null || cardinalInfoGain.isEmpty()) {
            return new BestCardinalResult("None", 0);
        }
        String bestDirection = "None";
        int highestScore = 0;
        for (Map.Entry<String, Integer> entry : cardinalInfoGain.entrySet()) {
            if (entry.getValue() > highestScore) {
                highestScore = entry.getValue();
                bestDirection = entry.getKey();
            }
        }
        return new BestCardinalResult(bestDirection, highestScore);
    }
}