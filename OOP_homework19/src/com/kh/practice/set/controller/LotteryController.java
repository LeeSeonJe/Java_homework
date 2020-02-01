package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.practice.set.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	Set<Lottery> lottery = new HashSet<Lottery>();
	Set<Lottery> win = new HashSet<Lottery>();
	{
		lottery.add(new Lottery("박신우", "01011111111"));
		lottery.add(new Lottery("이선제", "01022222222"));
		lottery.add(new Lottery("황이건", "01033333333"));
		lottery.add(new Lottery("최규혁", "01044444444"));
		lottery.add(new Lottery("정무지개", "01055555555"));
		lottery.add(new Lottery("이선제", "01066666666"));
	}

	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}

	public boolean deleteObject(Lottery l) {
		win.remove(l);
		return lottery.remove(l);
	}

	public HashSet<Lottery> winObject() {
		List<Lottery> ll = new ArrayList<Lottery>();
		ll.addAll(lottery);
		int[] n = new int[4];
		if (ll.size() > 3) {
			for (int i = 0; i < 4; i++) {
				int num = (int) (Math.random() * (ll.size()));
				n[i] = num;
				for (int j = 0; j < i; j++) {
					if (num == n[j]) {
						i--;
						break;
					} else {
						n[i] = num;
					}
				}
			}
		} else {
			return null;
		}

		for (int i = 0; i < 4; i++) {
			if (win.size() < 4) {
				win.add(ll.get(n[i]));
			}
		}
		return (HashSet<Lottery>) win;
	}

	public TreeSet<Lottery> sortedWinObject() {
		Set<Lottery> sl = new TreeSet<Lottery>(new SortedLottery());
		sl.addAll(win);
		Iterator<Lottery> it = sl.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		return (TreeSet<Lottery>) sl;
	}

	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
}
