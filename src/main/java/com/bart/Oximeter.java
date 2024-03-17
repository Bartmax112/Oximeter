package com.bart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import io.micronaut.runtime.Micronaut;


public class Oximeter {

    public static void main(String[] args) {
        Micronaut.run(Oximeter.class, args);
    }
}