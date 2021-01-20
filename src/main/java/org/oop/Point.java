package org.oop;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private static int getDifference(int coordinate1, int coordinate2) {
        return coordinate1 - coordinate2;
    }

    public double distanceBetween(Point to) {
        double xDistance = getDifference(to.x, this.x);
        double yDistance = getDifference(to.y, this.y);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double directionOf(Point to) {
        double xDistance = getDifference(to.x, this.x);
        double yDistance = getDifference(to.y, this.y);
        return Math.atan2(yDistance, xDistance);
    }
}
