package com.driver;

public class Cartoon {
	private String name;
    private int power;

    public Cartoon(String name, int power) {
      // your code goes here
    }

    public String getName() {
    	// your code goes here
        return name;
    }

    public int getPower() {
    	// your code goes here
        return power;
    }

    public void setPower(int power) {
    	// your code goes here
        this.power = power;
    }

    @Override
    public String toString() {
    	// your code goes here
        return name + " (Power: " + power + ")";
    }
}
