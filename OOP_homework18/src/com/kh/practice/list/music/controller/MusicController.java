package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	List<Music> list = new ArrayList<Music>();
	{
		list.add(new Music("����� �׸��� �����", "�յ���Ű��"));
		list.add(new Music("���� �͵��� ���� ��", "��ź�ҳ��"));
		list.add(new Music("�ҿ���", "��ź�ҳ��"));
		list.add(new Music("�����ϴ� ���ε��� ����", "�ܳ���"));
		list.add(new Music("Hip", "������"));
		list.add(new Music("����� �׸��� �����", "god"));
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
		// �����ؾ��ϴ� �κ��� �ִ�
		// ���� �̸��� �뷡�� �ް� �Ǹ� ù��° �뷡�� ������ �Ǳ� ������
		// Music �ϳ��� ��ü�θ� �޴� ���� �ƴ϶�
		// List�� ����ؼ� �� ���� ���� ���� �����ؼ� �Ѱܾ� �ϴ� ������� ������ �ؾ��� �� ����.
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				return list.get(i);
			}
		}
		return null;
	}

	public Music removeMusic(String title) {
		// ����ڿ��� ������ ���� �̸��� ���� �ް� MusicController�� removeMusic����
		// ���� �ѱ��. removeMusic()�� ��ȯ ���� ���� ��ȯ ���� ������ �� ������ ���� �����ϴ�.��
		// ��ȯ ���� ������ ��000(�� ��, ���� ��)�� ���� �߽��ϴ١� �ܼ� â�� ���
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				return list.remove(i);
			}
		}
		return null;
	}

	public Music setMusic(String title, Music music) {
		// ����ڿ��� ������ ���� �Է� �Ͽ� MusicController�� setMusic���� �˻� �� �� �ְ�
		// ���� �ѱ�� ������ �� ��� ���� ���� �޾� setMusic���� ���� �ѱ��.
		// �˻� ��� ���� ������ �������� ���� �����ϴ�.��, �˻� ��� ���� �ְ�
		// ���� ������ ��000(�� ��, ���� ��)�� ���� ���� �Ǿ����ϴ�.�� �ܼ� â�� ���
		Music sm = searchMusic(title);
		return list.set(list.indexOf(sm), music);
	}

	public int ascTitle() {
		// ��� ��������
		// MusicController�� ascTitle()�� ���� ���� ���� �� ������ ������, ���� �� ������ ���С�
		Collections.sort(list, new AscTitle());
		return 1;
	}

	public int descSinger() {
		// ������ ��������
		// musicController�� descSinger()�� ���� ���� ���� �� ������ ������, ���� �� ������ ���С�
		Collections.sort(list);
		return 1;
	}
}
