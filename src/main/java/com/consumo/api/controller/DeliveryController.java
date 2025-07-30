package com.consumo.api.controller;

import com.consumo.api.dto.FoodDTO;
import com.consumo.api.dto.RestaurantDTO;
import com.consumo.api.dto.UserDTO;
import com.consumo.api.service.DeliveryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/my-delivery-api")
public class DeliveryController {
    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping("/users")
    public List<UserDTO> fetchAllUsers() {
        return deliveryService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public UserDTO fetchUserById(@PathVariable Long id) {
        return deliveryService.getUserById(id);
    }

    @GetMapping("/restaurants")
    public List<RestaurantDTO> fetchAllRestaurants() {
        return deliveryService.getAllRestaurants();
    }

    @GetMapping("/restaurants/{id}")
    public RestaurantDTO fetchRestaurantById(@PathVariable Long id) {
        return deliveryService.getRestaurantById(id);
    }

    @GetMapping("/foods")
    public List<FoodDTO> fetchAllFoods() {
        return deliveryService.getAllFoods();
    }

    @GetMapping("/foods/{id}")
    public FoodDTO fetchFoodById(@PathVariable Long id) {
        return deliveryService.getFoodById(id);
    }
}

