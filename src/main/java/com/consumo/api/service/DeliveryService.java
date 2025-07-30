package com.consumo.api.service;

import com.consumo.api.dto.FoodDTO;
import com.consumo.api.dto.RestaurantDTO;
import com.consumo.api.dto.UserDTO;
import com.consumo.api.dto.RestaurantDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class DeliveryService {

    private final RestTemplate restTemplate;

    @Value("${api.delivery.base-url}")
    private String apiBaseUrl;

    public DeliveryService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<UserDTO> getAllUsers() {
        String url = apiBaseUrl + "/users";
        UserDTO[] users = restTemplate.getForObject(url, UserDTO[].class);
        return Arrays.asList(users);
    }

    public UserDTO getUserById(Long id) {
        String url = apiBaseUrl + "/users/" + id;
        return restTemplate.getForObject(url, UserDTO.class);
    }

    public List<RestaurantDTO> getAllRestaurants() {
        String url = apiBaseUrl + "/restaurants";
        RestaurantDTO[] restaurants = restTemplate.getForObject(url, RestaurantDTO[].class);
        return Arrays.asList(restaurants);
    }

    public RestaurantDTO getRestaurantById(Long id) {
        String url = apiBaseUrl + "/restaurants/" + id;
        return restTemplate.getForObject(url, RestaurantDTO.class);
    }

    public List<FoodDTO> getAllFoods() {
        String url = apiBaseUrl + "/foods";
        FoodDTO[] foods = restTemplate.getForObject(url, FoodDTO[].class);
        return Arrays.asList(foods);
    }

    public FoodDTO getFoodById(Long id) {
        String url = apiBaseUrl + "/foods/" + id;
        return restTemplate.getForObject(url, FoodDTO.class);
    }
}