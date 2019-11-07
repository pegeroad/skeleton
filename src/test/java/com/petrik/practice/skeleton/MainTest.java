package com.petrik.practice.skeleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
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
