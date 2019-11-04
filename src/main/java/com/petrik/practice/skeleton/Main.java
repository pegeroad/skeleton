package com.petrik.practice.skeleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOG = LogManager.getLogger();

    String helloWorld() {
        return "Hello world!";
    }

    public static void main(String[] args) {

        LOG.info("Hello World from Logger.");

    }

}
