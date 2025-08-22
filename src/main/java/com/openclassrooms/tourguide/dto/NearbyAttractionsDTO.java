package com.openclassrooms.tourguide.dto;

public record NearbyAttractionsDTO(
        String attractionName,
        double attractionLongitude,
        double attractionLatitude,
        double userLongitude,
        double userLatitude,
        double attractionDistance,
        int rewardPoints
) {
}
