package com.kh.practice.map.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	Map<String, Member> map = new HashMap<String, Member>();
	{
		map.put("qqqq", new Member("1111", "�ڽſ�"));
		map.put("wwww", new Member("2222", "�̼���"));
		map.put("eeee", new Member("3333", "Ȳ�̰�"));
		map.put("rrrr", new Member("3333", "�ֱ���"));
		map.put("aaaa", new Member("3333", "�ڽſ�"));
	}

	public boolean joinMembership(String id, Member m) {
		if (map.containsKey(id)) {
			return false;
		}
		map.put(id, m);
		return true;
	}

	public String login(String id, String password) {
		if (map.containsKey(id)) {
			if (map.get(id).getPassword().equals(password)) {
				return map.get(id).getName();
			}
		}
		return null;
	}

	public String changhPassword(String id, String oldPw, String newPw) {
		if (login(id, oldPw) != null) {
			joinMembership(id, new Member(newPw, map.get(id).getName()));
			return "��й�ȣ ���濡 �����߽��ϴ�.";
		} else {
			return "��й�ȣ ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���.";
		}
	}

	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}

	public TreeMap<String, Member> sameName(String name) {
		TreeMap<String, Member> tMap = new TreeMap<String, Member>();
//		Set<String> set = map.keySet();
//		Iterator<String> it = set.iterator();
//		while (it.hasNext()) { // �������� �ִ��� Ȯ��
//			String key = it.next(); // Ű���� �����
//			if (map.get(key).getName().equals(name)) {
//				tMap.put(key, map.get(key));
//				System.out.println(map.get(key).getName() + " - " + key);
//			}
//		}
		
		Set<String> set = map.keySet();
		List<String> list = new ArrayList<String>();
		list.addAll(set);
		for (int i = 0; i < set.size(); i++) {
			if (map.get(list.get(i)).getName().equals(name)) {
				tMap.put(list.get(i), map.get(list.get(i)));
			}
		}
		return tMap;
	}
}
