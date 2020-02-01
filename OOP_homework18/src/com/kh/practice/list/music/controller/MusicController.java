package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	List<Music> list = new ArrayList<Music>();
	{
		list.add(new Music("사랑해 그리고 기억해", "먼데이키즈"));
		list.add(new Music("작은 것들을 위한 시", "방탄소년단"));
		list.add(new Music("소우주", "방탄소년단"));
		list.add(new Music("주저하는 연인들을 위해", "잔나비"));
		list.add(new Music("Hip", "마마무"));
		list.add(new Music("사랑해 그리고 기억해", "god"));
	}

	public int addList(Music music) {
		if (list.indexOf(music) == -1) {
			list.add(music);
			return -1;
		}
		return list.indexOf(music);
	}

	public int addAtZero(Music music) {
		if (list.indexOf(music) == -1) {
			list.add(0, music);
			return -1;
		}
		return list.indexOf(music);
	}

	public List<Music> printAll() {
		return list;
	}

	public Music searchMusic(String title) {
		// 수정해야하는 부분이 있다
		// 같은 이름에 노래를 받게 되면 첫번째 노래만 저장이 되기 때문에
		// Music 하나의 객체로만 받는 것이 아니라
		// List를 사용해서 곡 명이 같은 것을 저장해서 넘겨야 하는 방법으로 수정을 해야할 것 같다.
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				return list.get(i);
			}
		}
		return null;
	}

	public Music removeMusic(String title) {
		// 사용자에게 삭제할 곡의 이름을 직접 받고 MusicController에 removeMusic으로
		// 값을 넘긴다. removeMusic()의 반환 값에 따라 반환 값이 없으면 “ 삭제할 곡이 없습니다.”
		// 반환 값이 있으면 “000(곡 명, 가수 명)을 삭제 했습니다” 콘솔 창에 출력
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				return list.remove(i);
			}
		}
		return null;
	}

	public Music setMusic(String title, Music music) {
		// 사용자에게 수정할 곡을 입력 하여 MusicController에 setMusic으로 검색 할 수 있게
		// 값을 넘기며 수정할 곡 명과 가수 명을 받아 setMusic으로 값을 넘긴다.
		// 검색 결과 값이 없으면 “수정할 곡이 없습니다.”, 검색 결과 값이 있고
		// 수정 했으면 “000(곡 명, 가수 명)의 값이 변경 되었습니다.” 콘솔 창에 출력
		Music sm = searchMusic(title);
		return list.set(list.indexOf(sm), music);
	}

	public int ascTitle() {
		// 곡명 오름차순
		// MusicController에 ascTitle()의 값에 따라 성공 시 “정렬 성공”, 실패 시 “정렬 실패”
		Collections.sort(list, new AscTitle());
		return 1;
	}

	public int descSinger() {
		// 가수명 내림차순
		// musicController에 descSinger()의 값에 따라 성공 시 “정렬 성공”, 실패 시 “정렬 실패”
		Collections.sort(list);
		return 1;
	}
}
