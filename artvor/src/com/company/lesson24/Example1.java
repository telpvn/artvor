package com.company.lesson24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// throws throw try catch finally

public class Example1 {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.toString());
        try {
            m();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void m() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
    }
}
