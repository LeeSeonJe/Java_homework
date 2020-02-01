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
	// 마트에서 농산물 저장용 HashMap 객체 생성(hMap)
	List<Farm> list = new ArrayList<Farm>();
	// 고객이 구매한 농산물 저장용 ArrayList 객체 생성(list)
	{
		hMap.put(new Fruit("과일", "배"), 30);
		hMap.put(new Nut("견과", "땅콩"), 50);
		hMap.put(new Fruit("과일", "귤"), 500);
		hMap.put(new Fruit("과일", "사과"), 20);
		hMap.put(new Vegetable("채소", "양배추"), 10);
		hMap.put(new Nut("견과", "호두"), 4);
	}

	public boolean addNewKind(Farm f, int amount) {
		// 전달 받은 f가 hMap 안에 key로 존재하지 않을 때
		// f와 amount를 각각 키와 값으로 저장 후 true 반환, 존재할 경우 false 반환.
		if (hMap.containsKey(f)) {
			return false;
		}
		hMap.put(f, amount);
		return true;
	}

	public boolean removeKind(Farm f) {
		// 전달 받은 f가 hMap 안에 key로 존재할 때 hMap에 f 삭제 후 true 반환
		// 존재하지 않을 경우 false 반환
		if (hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
		}
		return false;
	}

	public boolean changeAmount(Farm f, int amount) {
		// 전달 받은 f가 hMap 안에 key로 존재할 때 f와 amount 저장 후 true 반환
		// 존재하지 않을 경우 false 반환
		if (hMap.containsKey(f)) {
			hMap.put(f, amount);
			return true;
		}
		return false;
	}

	public HashMap<Farm, Integer> printFarm() {
		// 농산물 데이터가 들어가있는 컬렉션 반환
		return (HashMap<Farm, Integer>) hMap;
	}

	public boolean buyFarm(Farm f) {
		// 전달 받은 f가 hMap 안에 존재하면서 그 f의 수량이 0개 이상일 때
		// list에 f 추가, 그리고 hMap에 f의 수량 1 감소 후 true 반환
		// 존재하지 않으면 false 반환
		if (hMap.containsKey(f) && hMap.get(f) > 0) {
			hMap.put(f, hMap.get(f) - 1);
			return list.add(f);
		}
		return false;
	}

	public boolean removeFarm(Farm f) {
		// 전달 받은 f가 list에 존재할 때 list에 f 삭제, 그리고 hMap에 f 수량 1 증가
		// 위 경우일 때 true 반환, 아니면 false 반환
		if (list.contains(f)) {
			hMap.put(f, hMap.get(f) + 1);
			return list.remove(f);
		}
		return false;
	}

	public ArrayList<Farm> printBuyFarm() {
		// 농산물 구매 데이터가 들어가있는 컬렉션 반환
		return (ArrayList<Farm>) list;
	}
}
