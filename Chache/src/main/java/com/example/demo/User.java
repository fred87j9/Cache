package com.example.demo;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class User {

    public String getDataSlow() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        String generatedString = RandomStringUtils.randomAlphabetic(1000);

        return generatedString;
    }
}
