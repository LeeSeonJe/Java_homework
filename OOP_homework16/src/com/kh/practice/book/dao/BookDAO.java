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
//			FileOutputStream의 오버로딩 생성자인 boolean 값이 들어있는 생성자를 사용할 경우
//			처음 생성된 객체에 이어 붙이게 되므로 
//			java.io.StreamCorruptedException: invalid type code: AC
//			에러가 발생한다. 첫번째 저장같은경우는 객체하나로 딱 맞게 저장이 되는데
//			true를 주어 계속해서 배열이 아닌 그냥 객체로 저장을 하게되면 원래 있던 객체 뒤에 붙이게 되므로 객체 + 객체 + 객체 이런식으로 되기 때문에
//			저장은 되나 제대로 읽어오지 못한다.
//			해결책으로는 스트림을 새로 생성하여 해결하는 방법이 있으며 배열로 저장해서 각각의 객체를 저장해야지 같은 배열로 불러올 수 있는 것 같다

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
