<ins>**Problems in Shivam's solution**</ins>

The requirement of Shivam is to write a program that does two things,
- Find distance between two points
- Find direction (angle) between two points in Radians

The code that was in package org.oop consisted of two classes named Point and DistanceAndDirectionCalculator. We could see that the class 'Point' had only properties and no method of it's own and the 'DistanceAndDirectionCalculator' class had only methods and no property. Also, the Point properties were accessed by DistanceAndDirectionCalculator using getters and there were unused setters.

When we analyse from the perspective of OOP concepts, the use of getters and setters break the "Abstraction". Any user who use the DistanceAndDirectionCalculator can modify the properties of Point using set(). Also, two classes were created to store the properties and methods and the use of class doesn't make it object oriented (OO). It was a procedural code in which the methods and properties were wrapped up in different classes.

***Solution for the problems***

The problem can be solved by including the distance and direction methods in point class. The names can be renammed to distanceBetween and directionOf so that the intention is clear (distance between points and direction of the points). The properties and methods are wrapped up in a class thereby preserving encapsulation. Usage of getters can also be avoided which will preserve the abstraction.

<ins>Analysing both solution using the four principles of Kent Beck</ins>
1. Both solutions passes the test.
2. Both solutions reveals intention.
3. There is no duplication in both solutions.
4. Solution proposed in this project have fewer elements.

Even though Shivam's solution satisfy three conditions, it has to be noted that the solution is procedural, does not provide abstraction and encapsulation. The solution proposed in this project is more OO and satisfies Kent Beck's principles.
