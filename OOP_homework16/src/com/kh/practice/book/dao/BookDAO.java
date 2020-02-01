package com.kh.practice.book.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.vo.Book;
import com.kh.practice.book.view.BookMenu;

public class BookDAO {

	public void fileSave(Book[] b) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));) {
			for (int i = 0; i <= BookMenu.count; i++) {
				oos.writeObject(b[i]);
			}
//		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt", true));) {
//				oos.writeObject(b);
//			}

//			FileOutputStream(File file, boolean append)
//			Creates a file output stream to write to the file represented by the specified File object.
//			FileOutputStream�� �����ε� �������� boolean ���� ����ִ� �����ڸ� ����� ���
//			ó�� ������ ��ü�� �̾� ���̰� �ǹǷ� 
//			java.io.StreamCorruptedException: invalid type code: AC
//			������ �߻��Ѵ�. ù��° ���尰������ ��ü�ϳ��� �� �°� ������ �Ǵµ�
//			true�� �־� ����ؼ� �迭�� �ƴ� �׳� ��ü�� ������ �ϰԵǸ� ���� �ִ� ��ü �ڿ� ���̰� �ǹǷ� ��ü + ��ü + ��ü �̷������� �Ǳ� ������
//			������ �ǳ� ����� �о���� ���Ѵ�.
//			�ذ�å���δ� ��Ʈ���� ���� �����Ͽ� �ذ��ϴ� ����� ������ �迭�� �����ؼ� ������ ��ü�� �����ؾ��� ���� �迭�� �ҷ��� �� �ִ� �� ����

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Book[] fileRead() {
		Book[] bArr = new Book[10];
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));) {
			for (int i = 0; i < bArr.length; i++) {
				bArr[i] = (Book) ois.readObject();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bArr;
	}
}
