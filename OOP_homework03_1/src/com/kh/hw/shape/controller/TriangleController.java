package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	private static final int TRIANGEL = 3;
	Shape s = new Shape(TRIANGEL, 0.0, 0.0);

	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		return height * width / 2;
	}

	public void paintColor(String Color) {
		s.setColor(Color);
	}

	public String print() {
		return s.information();
	}
}
