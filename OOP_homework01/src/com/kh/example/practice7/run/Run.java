package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee ee = new Employee();
		ee.setEmpNo(100);
		ee.setEmpName("ȫ�浿");
		ee.setDept("������");
		ee.setJob("����");
		ee.setAge(25);
		ee.setGender('��');
		ee.setSalary(2500000);
		ee.setBonusPoint(0.05);
		ee.setPhone("010-1234-5678");
		ee.setAddress("����� ������");
		
//		ee = new Employee(100, "ȫ�浿", dept, job, age, gender, salary, bonusPoint, phone, address)

		System.out.println(ee.getEmpNo() + " " + ee.getEmpName() + " " + ee.getDept() + " " + ee.getJob() + " "
				+ ee.getAge() + " " + ee.getGender() + " " + ee.getSalary() + " " + ee.getBonusPoint() + " "
				+ ee.getPhone() + " " + ee.getAddress() + " ");
	}
}
