package com.example.virtue0;

public class Octagon extends Shape{
    private int side0;
    private int side1;
    private int side2;
    private int side3;
    private int side4;
    private int side5;
    private int side6;
    private int side7;

    public Octagon(int side0, int side1, int side2, int side3, int side4, int side5, int side6, int side7) {
        this.side0 = side0;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.side5 = side5;
        this.side6 = side6;
        this.side7 = side7;
    }

    public Octagon() {
        this.side0 = 0;
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
        this.side4 = 0;
        this.side5 = 0;
        this.side6 = 0;
        this.side7 = 0;
    }

    public int getSide0() {
        return side0;
    }

    public void setSide0(int side0) {
        this.side0 = side0;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public int getSide4() {
        return side4;
    }

    public void setSide4(int side4) {
        this.side4 = side4;
    }

    public int getSide5() {
        return side5;
    }

    public void setSide5(int side5) {
        this.side5 = side5;
    }

    public int getSide6() {
        return side6;
    }

    public void setSide6(int side6) {
        this.side6 = side6;
    }

    public int getSide7() {
        return side7;
    }

    public void setSide7(int side7) {
        this.side7 = side7;
    }
}
