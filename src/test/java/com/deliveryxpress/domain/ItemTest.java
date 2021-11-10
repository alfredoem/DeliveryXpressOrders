/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.deliveryxpress.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alfre
 */
public class ItemTest {
    
    public ItemTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testCalcularPesoVolumetrico() {

        Item item = new Item("Cocina Elextrolux 76GS", 1450, 45, 60, 69, 57, 1);
        double restultadoEsperado = 47.196;
        assertEquals(restultadoEsperado, item.getPesoVolumetrico() * item.getCantidad());

    }

    @Test
    public void testCalcularPesoMayor() {

        Item item = new Item("Escoba HUDE Nylon", 18.99, 0.5, 8, 25, 120, 1);
        double restultadoEsperado = 4.8;
        assertEquals(restultadoEsperado, item.getPesoMayor());

    }
    
}
