package com.federicogualdi.easypeasyinterview.shape;

public class Point {
    private Integer x;
    private Integer y;

    public double computeDistance(Point b) {
        return Math.sqrt(Math.pow(b.getX() - this.getX(), 2) + Math.pow(b.getY() - this.getY(), 2));
    }

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
