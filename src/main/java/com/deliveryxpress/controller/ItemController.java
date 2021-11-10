/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deliveryxpress.controller;

import com.deliveryxpress.domain.Item;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alfre
 */
@RestController
public class ItemController {
    
    @GetMapping("/items")
    List<Item> saludar() {
        
        List<Item> items = new ArrayList();
        items.add(new Item("Regrigeradora Panasonic", 3499, 70, 180, 70, 70, 1));
        
        return items;
    }
    
}
