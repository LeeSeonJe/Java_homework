package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music> {
	@Override
	public int compare(Music o1, Music o2) {
		String standarSinger = o1.getSinger();
		String objectSinger = o2.getSinger();
		String standarTitle = o1.getTitle();
		String objectTitle = o2.getTitle();

		if (standarTitle.compareTo(objectTitle) == 0) {
			return standarSinger.compareTo(objectSinger);
		} else {
			return standarTitle.compareTo(objectTitle);
		}
	}
}
