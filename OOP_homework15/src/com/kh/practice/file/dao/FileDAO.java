package com.kh.practice.file.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		try (FileReader fr = new FileReader(file);) {
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	public void fileSave(String file, String s) {
		try (FileWriter fw = new FileWriter(file);) {
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file));) {
			String value = null;
			while ((value = br.readLine()) != null) {
				sb.append(value + "\n");
			}
		} catch (IOException e) {
			System.out.println("없는 파일입니다.");
		}
		return sb;
	}

	public void fileEdit(String file, String s) {
		fileSave(file, s);
	}
}
