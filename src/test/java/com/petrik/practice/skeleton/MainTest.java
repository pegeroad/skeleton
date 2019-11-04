package com.petrik.practice.skeleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

    private Main client;

    @BeforeEach
    public void setUp() {
        client = new Main();
    }

    @Test
    public void helloWorldTest() {
        Assertions.assertEquals("Hello world!", client.helloWorld());
    }
}
