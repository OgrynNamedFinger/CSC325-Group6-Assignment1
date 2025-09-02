package main;

import main.ZooManager; // Added to prevent class errors regarding zooManager

// Entry point for the Zoo program.
public class Main {
    public static void main(String[] args) {
        ZooManager manager = new ZooManager(); // creates manager, accesses the run method.
        manager.run();
    }
}

