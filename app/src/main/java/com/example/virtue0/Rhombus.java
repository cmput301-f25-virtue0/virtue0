package com.example.virtue0;

public class Rhombus extends Shape{
    private double angle;

    public double getAngle() { return this.angle; }
    public void setAngle(double newAngle) { this.angle = newAngle; }

    public int GetBottomLength() {
        return this.getX() - ((int) this.getY() / ((int) Math.tan(this.angle)));
    }
}
