/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.unitest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ishish
 */
public class JavaUnitTest {

//    @Test
//    public void firstTestMethod() {
//        assertTrue(true);
//    }
    @BeforeAll
    static void setupAll() {
        System.out.println("setupAll");
    }

    @BeforeEach
    void setup() {
        System.out.println("setup");
    }

    @Test
    void unTest() {
        System.out.println("un Test");
        assertTrue(true);
    }

    @Test
    void unAutreTest() {
        System.out.println("un autre test");
        assertTrue(true);
    }

    @AfterEach
    void teardown() {
        System.out.println("teardown");
    }

    @AfterAll
    static void teardownAll() {
        System.out.println("teardownAll");
    }

}
