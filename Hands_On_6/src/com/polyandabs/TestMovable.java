package com.polyandabs;

interface Movable {

    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {

    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y += ySpeed;
    }

    public void moveDown() {
        y -= ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }

    public String toString() {
        return "(" + x + "," + y + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }
}

class MovableCircle implements Movable {

    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return "Center: " + center + ", Radius: " + radius;
    }
}

public class TestMovable {

    public static void main(String[] args) {

        MovablePoint p = new MovablePoint(2, 3, 1, 1);
        System.out.println("Point: " + p);

        p.moveUp();
        p.moveRight();

        System.out.println("After Move: " + p);

        MovableCircle c = new MovableCircle(5, 5, 2, 2, 10);
        System.out.println("Circle: " + c);

        c.moveLeft();
        c.moveDown();

        System.out.println("After Move: " + c);
    }
}