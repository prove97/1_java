package com.kh.test240207;

import java.util.HashMap;
import java.util.TreeMap;

public class MemberController {
	private HashMap<String, Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		if(!map.containsKey(id)) { // 이미 값이 존재
			map.put(id, m);
			return true;
		}
		return false;
	}
	
	public String logIn(String id, String password) {
		Member m = map.get(id);
		if(id != null) {
			if(m.getPassword().equals(password)) { // 입력한 비밀번호가 일치할시
				return m.getName();
			} else return null;
		} else return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		Member m = map.get(id);
		if(m != null && m.getPassword().equals(oldPw)) {
			map.replace(id, new Member(newPw, m.getName()));
			return true;
		}
		return false;
	}
	
	public void chageName(String id, String newName) {
		Member m = map.get(id);
		if(map.containsKey(id)) {
			map.replace(id, new Member(m.getPassword(), newName));
		}
	}
	
	public TreeMap<String, String> sameName(String name) {
		TreeMap<String, String> tm = new TreeMap<>(); // <이름, 아이디>
		
		//if... // 이름과 일치한다면 TreeMap에 넣음
		for(String id : map.keySet()) {
			Member m = map.get(id);
			if(m.getName().equals(name)) {
				tm.put(id, name);
			}
		}
		
		return tm;
	}
	
}
