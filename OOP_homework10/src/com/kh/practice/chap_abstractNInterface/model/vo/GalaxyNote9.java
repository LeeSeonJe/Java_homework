package com.kh.practice.chap_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {

	public GalaxyNote9() {
		super.setMaker("�Ｚ");
	}

	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "�������, ��� ���� ����";
	}

	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "��ȣ�� ������ ��ȭ��ư�� ����";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "���� ��ư�� ����";
	}

	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "1200�� ��� ī�޶�";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "������, ������ ����";
	}

	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String printlnformtion() {
		// TODO Auto-generated method stub
		return "������ ��Ʈ9�� " + super.getMaker() + "���� ����� ���� ������ ������ ����.\n" + makeCall() + "\n" + takeCall() + "\n"
				+ picture() + "\n" + charge() + "\n" + touch() + "\n" + "������� �� ž�� ���� : " + bluetoothPen();
	}

}