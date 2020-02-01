package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	private static final int SQUARE = 4;
	Shape s = new Shape(SQUARE, 0.0, 0.0);

	public double calcPerimeter(double height, double width) {
		s.setWidth(width);
		s.setHeight(height);
		return height * 2 + width * 2;
	}

	public double calcArea(double height, double width) {
		s.setWidth(width);
		s.setHeight(height);
		return height * width;
	}

	public void paintColor(String color) {
		s.setColor(color);
	}

	public String print() {
		return s.information();
	}
}
