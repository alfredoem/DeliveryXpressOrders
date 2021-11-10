/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.deliveryxpress.domain;

import java.util.ArrayList;
import java.util.List;
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
public class PiezaTest {
    
    public PiezaTest() {
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
    public void testCalcularEtiquetaTamaño() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Refrigeradora Panasonic NR-BB53GV3", 3499, 50, 180, 60, 57, 1));

        Pieza pieza = new Pieza(51, 181, 61, 57, items);
        pieza.calcularEtiquetaTamaño();
        String restultadoEsperado = "XL";
        assertEquals(restultadoEsperado, pieza.getEtiquetaTamaño());
    }

    @Test
    public void testPiezaCantidadItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Refrigeradora Panasonic NR-BB53GV3", 3499, 50, 180, 60, 57, 1));
        items.add(new Item("TV LG OLED 55C1", 3999, 20, 60, 120, 15, 2));
        items.add(new Item("Cocina Elextrolux 76GS", 1450, 45, 60, 69, 57, 1));

        Pieza pieza = new Pieza(51, 181, 61, 57, items);
        Integer restultadoEsperado = 4;
        assertEquals(restultadoEsperado, pieza.getCantidadItems());

    }
    
}
