package com.kh.A_file;

import java.io.File;
import java.io.IOException;

public class Run {
	/*
	 * 간단하게 파일(File)을 만들어보자
	 * java.io.File 클래스를 가지고
	 *  
	 */
	
	public static void main(String[] args) {
		
		// 1. 경로지정을 딱히 하지 않고 파일을 생성
		File f1 = new File("test.text"); // 파일 객체를 하나 만든상태(실제 파일 x)
		try {
			f1.createNewFile(); // 메소드까지 실행을 해야지 파일이 생성됨
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 2. 존재하는 폴더에 파일 생성 => 해당경로까지 지정
		File f2 = new File("d:\\test.text");  
		try {
			f2.createNewFile(); // 존재하지 않는 경로로 제시 => IOException발생
//			File f3 = new File("D:\\tmp\\test.txt");
//			f3.createNewFile();
			
			// 3. 폴더 먼저 만들고 파일까지 만들어지게 하는 방법
			File tmpFolder = new File("D:\\tmp");
			tmpFolder.mkdir();
			tmpFolder.createNewFile();
			File f3 = new File("D:\\tmp\\test.txt");
			f3.createNewFile();
			
			System.out.println(f1.exists()); // 파일의 존재유무 확인
			System.out.println(new File("tt.txt").exists()); 
			
			
			System.out.println(f1.isFile()); // 파일인지 확인하는 메소드 : text파일 -> true
			System.out.println(tmpFolder.isFile()); // 폴더 -> false
			
			//============================================================
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대 경로 : " + file.getAbsolutePath());
			System.out.println("파일용량 : " + file.length());
			System.out.println("상위폴더 : " + file.getParent());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		
		
	}

}
