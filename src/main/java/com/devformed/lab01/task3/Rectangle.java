package com.devformed.lab01.task3;

import com.devformed.lab01.task2.Shape;

/**
 * @author Anton Gorokh
 */
public final class Rectangle extends Shape {

	private final double length;
	private final double width;

	public Rectangle(double length, double width) {
		super("Rectangle");
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getPerimeter() {
		return (length + width) * 2;
	}
}
