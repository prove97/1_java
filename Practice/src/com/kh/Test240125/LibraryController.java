package com.kh.Test240125;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5];

	public LibraryController() {
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return this.mem;
	}
	
	public Book[] selectAll() {
		return this.bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] targetBList = new Book[5];
		int count = 0;
		for(int i = 0; i < bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				targetBList[count++] = bList[i];
			}
		}
		return targetBList;
	}
	
	public int rentBook(int index) {
		int result  = 0;
		// Book -> 상속관계중에 AniBook이 존재하는지?
		// Book, AniBook, CookBook
		if(bList[index] instanceof AniBook) {//만화책일 경우
			AniBook aniBook = (AniBook)bList[index];
			if(aniBook.getAccessAge() > mem.getAge()) { //나이 제한에 걸릴 경우
				result = 1;
			} 
		} else if(bList[index] instanceof CookBook){ //요리책일 경우
			CookBook cookBook = (CookBook)bList[index];
			if(cookBook.isCoupon()) {//요리책을 참조해서 쿠폰이 있을 때
				this.mem.setCouponCount(mem.getCouponCount()+1);
				result = 2;
			}
		}
		return result;
	}
	
	
}
