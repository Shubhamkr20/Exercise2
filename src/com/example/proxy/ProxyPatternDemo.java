package com.example.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display(); // Loading and displaying
        image.display(); // Just displaying
    }
}
