package com.company.lesson24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String s = null;
        if (s != null)
            System.out.println(s.toString());
    }
}
