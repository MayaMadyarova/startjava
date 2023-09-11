package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String name;
    private float weight;
    private float height;
    private int numberPilots;
    private String origin;
    private String status;

    public Jaeger() {}

    public Jaeger(String name, float weight, float height,
            int numberPilots, String origin, String status) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.numberPilots = numberPilots;
        this.origin = origin;
        this.status = status;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getNumberPilots() {
        return numberPilots;
    }

    public void setNumberPilots(int numberPilots) {
        this.numberPilots = numberPilots;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean drift() {
        System.out.println("You have entered the drift");
        return true;
    }

    public void move() {
        System.out.println("moving");
    }

    public void scanKaiju() {
        System.out.println("scanning");
    }
}