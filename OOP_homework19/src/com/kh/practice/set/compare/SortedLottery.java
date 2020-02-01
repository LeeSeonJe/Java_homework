package com.kh.practice.set.compare;

import java.util.Comparator;

import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator<Lottery> {

	@Override
	public int compare(Lottery o1, Lottery o2) {
		String standarName = o1.getName();
		String objectName = o2.getName();
		String standarPhone = o1.getPhone();
		String objectPhone = o2.getPhone();

		if (standarName.compareTo(objectName) == 0) {
			return standarPhone.compareTo(objectPhone);
		} else {
			return standarName.compareTo(objectName);
		}
	}

}
