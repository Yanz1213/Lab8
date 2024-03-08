package com.example.lab8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomListTest {
    private CustomList list;

    @BeforeEach
    void setUp() {
        list = new CustomList(null, new ArrayList<>());
        list.addCity(new City("Edmonton", "AB"));
        list.addCity(new City("Vancouver", "BC"));
    }

    @Test
    void testHasCity() {
        assertTrue(list.hasCity("Edmonton"));
        assertFalse(list.hasCity("New York"));
    }

    @Test
    void testDeleteCity() {
        assertTrue(list.hasCity("Vancouver"));
        list.deleteCity("Vancouver");
        assertFalse(list.hasCity("Vancouver"));
    }

    @Test
    void testCountCities() {
        assertEquals(2, list.getCount());
        list.addCity(new City("Calgary", "AB"));
        assertEquals(3, list.getCount());
    }
}
