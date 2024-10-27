package com.devformed.lab01.task3;

import com.devformed.lab01.task2.Shape;

/**
 * @author Anton Gorokh
 */
public final class ShapeDescriber {

	public static void describe(Shape shape) {
		shape.print();
		System.out.println("Area: " + shape.getArea());
		System.out.println("Perimeter: " + shape.getPerimeter());
	}
}
