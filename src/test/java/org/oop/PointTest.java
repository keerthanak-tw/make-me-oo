package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PointTest {
    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);
        double expectedDistance = 0;

        double actualDistance = origin.distanceBetween(origin);

        Assertions.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);
        double expectedDistanceToPoint1 = 1;
        double expectedDistanceToPoint2 = 1;

        double distanceToPoint1 = origin.distanceBetween(point1);
        double distanceToPoint2 = origin.distanceBetween(point2);

        Assertions.assertEquals(expectedDistanceToPoint1, distanceToPoint1);
        Assertions.assertEquals(expectedDistanceToPoint2, distanceToPoint2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);
        double expectedDistance = 2;

        double actualDistance = point1.distanceBetween(point2);

        Assertions.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);
        Point origin = new Point(0, 0);
        double expectedDirectionOfPoint1 = 0;
        double expectedDirectionOfPoint2 = 0;

        double actualDirectionOfPoint1 = origin.directionOf(point1);
        double actualDirectionOfPoint2 = origin.directionOf(point2);

        Assertions.assertEquals(expectedDirectionOfPoint1, actualDirectionOfPoint1);
        Assertions.assertEquals(expectedDirectionOfPoint2, actualDirectionOfPoint2);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);
        double expectedDirectionOfPoint1 = Math.PI;
        double expectedDirectionOfPoint2 = Math.PI;

        double actualDirectionOfPoint1 = origin.directionOf(point1);
        double actualDirectionOfPoint2 = origin.directionOf(point2);

        Assertions.assertEquals(expectedDirectionOfPoint1, actualDirectionOfPoint1);
        Assertions.assertEquals(expectedDirectionOfPoint2, actualDirectionOfPoint2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);
        double expectedDirectionOfPoint1 = Math.PI / 2;
        double expectedDirectionOfPoint2 = Math.PI / 2;

        double actualDirectionOfPoint1 = origin.directionOf(point1);
        double actualDirectionOfPoint2 = origin.directionOf(point2);

        Assertions.assertEquals(expectedDirectionOfPoint1, actualDirectionOfPoint1);
        Assertions.assertEquals(expectedDirectionOfPoint2, actualDirectionOfPoint2);
    }
}
