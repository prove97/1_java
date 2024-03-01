package com.kh.test240207_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//View : 화면을 담당하는 역할. 즉, 사용자에게 보여지는 시각적인 요소(출력문, 입력문)
public class FarmMenu {
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	public void mainMenu() {
		int select = 0;
		System.out.println("========== KH 마트 ==========");
		while(true) {
			System.out.println();
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");

			}
		}
		
	}
	
	public void adminMenu() {
		int select = 0;
		while(true) {
			System.out.println();
			System.out.println("******* 직원 메뉴 *******");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1:
				addNewKind();
				break;
			case 2:
				removeKind();
				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printFarm();
				break;
			case 9:
				System.out.println("메인으로 이동");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");

			}
		}
	}
	public void customerMenu() {
		System.out.println("현재 KH마트 농산물 수량");
		printFarm();
		int select = 0;
		while(true) {
			System.out.println();
			System.out.println("******* 직원 메뉴 *******");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1:
				buyFarm();
				break;
			case 2:
				removeFarm();
				break;
			case 3:
				printBuyFarm();
				break;
			case 9:
				System.out.println("메인으로 이동");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
		
	}
	public void addNewKind() {
		Farm f;
		boolean isAdd = false;
		while(true) {
			System.out.println();
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			if(select < 1 || select > 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("수량: ");
			int amount = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1:
				f = new Fruit("과일", name);
				isAdd = fc.addNewKind(f, amount);
				break;
			case 2:
				f = new Vegetable("채소", name);
				isAdd = fc.addNewKind(f, amount);
				break;
			case 3:
				f = new Nut("견과", name);
				isAdd = fc.addNewKind(f, amount);
				break;
			}
			
			if(isAdd == true) {
				System.out.println("새 농산물이 추가되었습니다.");
				return;
			} 
			System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
		} 
		
	}
	
	public void removeKind() {
		Farm f;
		boolean isRemove = false;
		while(true) {
			System.out.println();
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("삭제할 종류 번호 : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			if(select < 1 || select > 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			switch(select) {
			case 1:
				f = new Fruit("과일", name);
				isRemove = fc.removeKind(f);
				break;
			case 2:
				f = new Vegetable("채소", name);
				isRemove = fc.removeKind(f);
				break;
			case 3:
				f = new Nut("견과", name);
				isRemove = fc.removeKind(f);
				break;
			}
			
			if(isRemove == true) {
				System.out.println("농산물 삭제에 성공하였습니다.");
				return;
			} 
			System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
		} 
	}
	
	public void changeAmount() {
		Farm f;
		boolean isChange = false;
		while(true) {
			System.out.println();
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("수정할 종류 번호 : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			if(select < 1 || select > 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("수정할 수량 : ");
			int amount = sc.nextInt();
			
			switch(select) {
			case 1:
				f = new Fruit("과일", name);
				isChange = fc.changeAmount(f, amount);
				break;
			case 2:
				f = new Vegetable("채소", name);
				isChange = fc.changeAmount(f, amount);
				break;
			case 3:
				f = new Nut("견과", name);
				isChange = fc.changeAmount(f, amount);
				break;
			}
			
			if(isChange == true) {
				System.out.println("농산물 수량이 수정되었습니다.");
				return;
			} 
			System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
		} 
		
	}
	public void printFarm() {
		System.out.println();

		HashMap<Farm, Integer> farmMap = fc.printFarm();
		
		if(farmMap.isEmpty()) {
			System.out.println("***현재 재고가 없습니다***");
			return;
		}
		
//		Set keySet = farmMap.keySet();
//		System.out.println(keySet);
		
//		Iterator<Farm> itKey = keySet.iterator();
//		String name = "";
//		int amount;
//		Farm key;
//		while(itKey.hasNext()) {
//			key = itKey.next(); 
//			if(key.getKind().equals("과일")) {
//				name = ((Fruit)key).getName();
//			} else if(key.getKind().equals("채소")) {
//				name = ((Vegetable)key).getName();
//			} else if(key.getKind().equals("견과")) {
//				name = ((Nut)key).getName();
//			} 
//			amount = farmMap.get(key);
//			System.out.println(key.getKind() + ": " + name + "(" + amount + "개)");
//		}
		
		String name = "";
		for(Farm f : farmMap.keySet()) {
			if(f instanceof Fruit) {
				name = ((Fruit)f).getName();
			} else if(f instanceof Vegetable) {
				name = ((Vegetable)f).getName();
			} else if(f instanceof Nut) {
				name = ((Nut)f).getName();
			} 
			System.out.printf(" %s : %s(%d개)\n", f.getKind(), name, farmMap.get(f));
		}
	}
	
	public void buyFarm() {
		Farm f;
		boolean isBuy = false;
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("구매 종류 번호 : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			if(select < 1 || select > 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.print("구매할 것 : ");
			String name = sc.nextLine();
			
			switch(select) {
			case 1:
				f = new Fruit("과일", name);
				isBuy = fc.buyFarm(f);
				break;
			case 2:
				f = new Vegetable("채소", name);
				isBuy = fc.buyFarm(f);
				break;
			case 3:
				f = new Nut("견과", name);
				isBuy = fc.buyFarm(f);
				break;
			}
			
			if(isBuy == true) {
				System.out.println("구매에 성공하였습니다.");
				this.printFarm();
				return;
			} 
			System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
			return;
		} 
	}
	
	public void removeFarm() {
		Farm f;
		boolean isRemove = false;
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("취소 종류 번호 : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			if(select < 1 || select > 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.print("구매 취소할 것 : ");
			String name = sc.nextLine();
			
			switch(select) {
			case 1:
				f = new Fruit("과일", name);
				isRemove = fc.removeFarm(f);
				break;
			case 2:
				f = new Vegetable("채소", name);
				isRemove = fc.removeFarm(f);
				break;
			case 3:
				f = new Nut("견과", name);
				isRemove = fc.removeFarm(f);
				break;
			}
			
			if(isRemove == true) {
				System.out.println("구매 취소에 성공하였습니다.");
				this.printFarm();
				return;
			} 
			System.out.println("구매매 목록에 존재하지 않습니다. 다시 입력해주세요.");
			return;
		} 
	}
	
	public void printBuyFarm() {
		ArrayList<Farm> list = fc.printBuyFarm(); 
		if(list.isEmpty()) {
			System.out.println("구입한 목록이 없습니다");
			return;
		}
		
		Iterator<Farm> itList = list.iterator();
		String name = "";
		Farm buyFarm;
		while(itList.hasNext()) {
			buyFarm = itList.next();
			if(buyFarm instanceof Fruit) {
				name = ((Fruit)buyFarm).getName();
			} else if(buyFarm instanceof Vegetable) {
				name = ((Vegetable)buyFarm).getName();
			} else if(buyFarm instanceof Nut) {
				name = ((Nut)buyFarm).getName();
			} 
			
			System.out.printf("%s : %s\n", buyFarm.getKind(), name);
		}
	}
}
