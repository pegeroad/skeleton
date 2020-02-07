package com.petrik.practice.skeleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

//@ExtendWith(MockitoExtension.class)
@Disabled
class MainTest {

    @Test
    public void helloWorldTest() {

        Assertions.assertEquals(7, 4 + 3);
    }
}
