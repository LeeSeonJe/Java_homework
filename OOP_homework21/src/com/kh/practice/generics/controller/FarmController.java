package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmController {
	Map<Farm, Integer> hMap = new HashMap<Farm, Integer>();
	// ��Ʈ���� ��깰 ����� HashMap ��ü ����(hMap)
	List<Farm> list = new ArrayList<Farm>();
	// ���� ������ ��깰 ����� ArrayList ��ü ����(list)
	{
		hMap.put(new Fruit("����", "��"), 30);
		hMap.put(new Nut("�߰�", "����"), 50);
		hMap.put(new Fruit("����", "��"), 500);
		hMap.put(new Fruit("����", "���"), 20);
		hMap.put(new Vegetable("ä��", "�����"), 10);
		hMap.put(new Nut("�߰�", "ȣ��"), 4);
	}

	public boolean addNewKind(Farm f, int amount) {
		// ���� ���� f�� hMap �ȿ� key�� �������� ���� ��
		// f�� amount�� ���� Ű�� ������ ���� �� true ��ȯ, ������ ��� false ��ȯ.
		if (hMap.containsKey(f)) {
			return false;
		}
		hMap.put(f, amount);
		return true;
	}

	public boolean removeKind(Farm f) {
		// ���� ���� f�� hMap �ȿ� key�� ������ �� hMap�� f ���� �� true ��ȯ
		// �������� ���� ��� false ��ȯ
		if (hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
		}
		return false;
	}

	public boolean changeAmount(Farm f, int amount) {
		// ���� ���� f�� hMap �ȿ� key�� ������ �� f�� amount ���� �� true ��ȯ
		// �������� ���� ��� false ��ȯ
		if (hMap.containsKey(f)) {
			hMap.put(f, amount);
			return true;
		}
		return false;
	}

	public HashMap<Farm, Integer> printFarm() {
		// ��깰 �����Ͱ� ���ִ� �÷��� ��ȯ
		return (HashMap<Farm, Integer>) hMap;
	}

	public boolean buyFarm(Farm f) {
		// ���� ���� f�� hMap �ȿ� �����ϸ鼭 �� f�� ������ 0�� �̻��� ��
		// list�� f �߰�, �׸��� hMap�� f�� ���� 1 ���� �� true ��ȯ
		// �������� ������ false ��ȯ
		if (hMap.containsKey(f) && hMap.get(f) > 0) {
			hMap.put(f, hMap.get(f) - 1);
			return list.add(f);
		}
		return false;
	}

	public boolean removeFarm(Farm f) {
		// ���� ���� f�� list�� ������ �� list�� f ����, �׸��� hMap�� f ���� 1 ����
		// �� ����� �� true ��ȯ, �ƴϸ� false ��ȯ
		if (list.contains(f)) {
			hMap.put(f, hMap.get(f) + 1);
			return list.remove(f);
		}
		return false;
	}

	public ArrayList<Farm> printBuyFarm() {
		// ��깰 ���� �����Ͱ� ���ִ� �÷��� ��ȯ
		return (ArrayList<Farm>) list;
	}
}
