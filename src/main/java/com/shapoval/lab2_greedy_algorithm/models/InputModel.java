package com.shapoval.lab2_greedy_algorithm.models;

public class InputModel {
    private String name;
    private int[] p;
    private int v;
    private int a;
    private double c;

    public InputModel(String name, int[] p, int v, int a, double c) {
        this.name = name;
        this.p = p;
        this.v = v;
        this.a = a;
        this.c = c;
    }

    public InputModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getP() {
        return p;
    }

    public void setP(int[] p) {
        this.p = p;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
