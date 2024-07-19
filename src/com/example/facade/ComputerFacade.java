package com.example.facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
    }

    public void start() {
        cpu.start();
        memory.load();
        System.out.println("Computer started.");
    }
}
