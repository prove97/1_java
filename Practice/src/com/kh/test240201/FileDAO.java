package com.kh.test240201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file) {
		// File 객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌
		File f = new File(file);
		
		// 해당 파일이 있는지 없는지에 대한 boolean 값을 반환
		return f.exists();
	}
	
	public void fileSave(String file, String s) {
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 만들어주고
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			// String에 써서 저장
			bw.write(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println();
			e.printStackTrace();
		}
		
	}
	
	/*
	 * StringBuilder : 효율적으로 문자열을 처리하기 위한 클래스로 다양한 기능의 메소드를 제공한다.
	 * append(), insert(), delete(), replace() ...
	 */
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
//		String str = "";
		
		// 매개변수로 들어온 file로 파일을 찾아 StringBuilder에 값들 저장하여 반환
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String value;
			// 끝가지 가져오면 null을 반환한다.
			while((value = br.readLine()) != null) {
				sb.append(value);
				sb.append("\n");
//				str += (value + "\n");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb;

	}
	
	public void fileEdit(String file, String s) {
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 찾고
		// String에 써서 저장하되 이어서 저장될 수 있도록 함
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file, true))){
			br.write(s);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println();
			e.printStackTrace();
		}
		
	}
}
