package com.kh.test240206_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LotteryController {
	HashSet<Lottery> lottery = new HashSet<>();
	HashSet<Lottery> win = new HashSet<>();
//	HashSet<Lottery> hash = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
//		if(lottery.isEmpty()) { // lottery가 비어있을 경우 무조건 처음엔 값을 추가
//			lottery.add(l);
//		} else {
//			for(Lottery lot : lottery) { // 중복된 값이 있을 경우 추가하지 않고 메소드 종료
//				if(lot.hashCode() == l.hashCode()) {
//					return true;
//				}
//			}
//		}
//		lottery.add(l); // return 값은 boolean: 추가 성공하면 true/ 실패하면 false
//		return false;

		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
//		int orgSize = lottery.size();
//		System.out.println(orgSize);
//		lottery.remove(l);
//		if(orgSize != lottery.size()) {
//			System.out.println("삭제햇을 경우");
//			System.out.println(orgSize);
//			System.out.println(lottery.size());
//			return false;
//		} else {
//			System.out.println("삭제못햇을 경우");
//			System.out.println(orgSize);
//			System.out.println(lottery.size());
//			return true;
//		}
		boolean isDelete = lottery.remove(l);
		if(isDelete && lottery != null) {
			win.remove(l);
		}
		
		return isDelete;
	}
	
	public HashSet<Lottery> winObject() {
		if(lottery.size() < 4) {
			return null;
		}
		
		List<Lottery> list = new ArrayList(lottery); 

		while(win.size() < 4) {
			int rand = (int)(Math.random() * list.size());
			win.add(list.get(rand));
		}
		
		return win;
	}
	
	public TreeSet<Lottery> sortedWinObject() {
		TreeSet<Lottery> sortedWinSet = new TreeSet<>(new SortedLottery());
		sortedWinSet.addAll(win);
		
		return sortedWinSet;
		//sort할때 람다식 이용하는게 편함
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
	
//	public void tmp() {
//		hash.add(new Lottery("이원기","010-2222-3333"));
//
//		System.out.println(hash.size());	
//		
//	}
	
}
