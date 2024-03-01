package com.kh.test240201;

import java.util.Scanner;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		int select = 0;
		while(true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			// 잘못 입력했을 경우 "잘못 입력하셨습니다. 다시 입력해주세요." 출력 후 반복

			select = sc.nextInt();
			sc.nextLine();
			switch(select) {
			case 1:
				this.fileSave();
				break;
			case 2:
				this.fileOpen();
				break;
			case 3:
				this.fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
		}
		
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		String line = "";
		
		// “ex끝it”를 입력할 때까지 사용자가 입력하게 하고 그 값들을 StringBuilder에 저장
		
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			line = sc.next();
			if(line.equals("ex끝it")) {
				break;
			} else {
				sb.append(line).append("\n");
			}
		}
			
		// 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면
		String fileName;
		char select;
		while(true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");	
			fileName = sc.nextLine();
			if(fc.checkName(fileName)) { // 파일명이 존재한다면
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				select = sc.nextLine().toLowerCase().charAt(0);
				boolean isTrue = (select == 'y');
				
				if(isTrue) { // y를 입력시 덮어쓰기
					fc.fileSave(fileName, sb);
					break;
				} 
			} else {
				fc.fileSave(fileName, sb);
				break;
			}
			
		}
		
		// “이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)”가 출력됨
		
		// y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 StringBuilder 넘김
		
		// n를 입력하면 “저장할 파일 명을 입력해주세요 ~”가 다시 나오게끔 반복
		
		// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면
		
		// 파일 명과 내용을 fc에 fileSave 메소드로 넘김
		
		
	}
	
	public void fileOpen() {
		
		System.out.print("열 파일 명 : ");
		String file = sc.nextLine();
		
		if(fc.checkName(file)) {
			StringBuilder sb = fc.fileOpen(file);
			System.out.println(sb);
		} else {
			System.out.println("없는 파일입니다.");
			return;
		}
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
		// 반환 값이 true일 경우 fc의 fileOpen() 메소드의 매개변수로 넘겨 반환 값 출력
		// 반환 값이 false일 경우 “없는 파일입니다.” 출력 후 mainMenu()로 돌아감
		
	}
	
	public void fileEdit() {
		System.out.print("수정할 파일명 : ");
		String file = sc.nextLine();
		
		if(fc.checkName(file)) {
			StringBuilder sb = new StringBuilder();
			String line = "";
			
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				line = sc.nextLine();
				if(line.equals("ex끝it")) {
					break;
				} else {
					sb.append(line).append("\n");
				}
			}
			fc.fileEdit(file, sb);
			
		} else {
			System.out.println("없는 파일입니다.");
		}
	}
	
}
