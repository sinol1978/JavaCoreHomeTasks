package lesson09.task05getcirclesquare;

import java.util.Objects;

public class Circle {
    private double radius;
    public static final double PI = 3.1415926;
    private double square;
    private double circuit;

    public Circle(double radius) {
        this.radius = radius;
        this.square = radius * radius * PI;
        this.circuit = radius * PI * 2;
    }

    public double getSquare() {
        return square;
    }

    public double getDistance() {
        return circuit;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", square=" + square +
                ", circuit=" + circuit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Double.compare(circle.PI, PI) == 0 &&
                Double.compare(circle.square, square) == 0 &&
                Double.compare(circle.circuit, circuit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, PI, square, circuit);
    }
}
