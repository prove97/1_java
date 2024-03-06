package com.kh.Service;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.common.JDBCTemplate;
import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

public class MemberService {
	//1) JDBC driver 등록
	//2) Connection 객체 생성
	//3) Connection 객체 처리(반환)
	
	public int insertMember(Member m) {
		Connection conn = JDBCTemplate.getConnection(); //static 메소드이기 때문에 객체 생성 X
		int result = new MemberDAO().insertMember(conn, m);
		
		if(result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);

		return result;
	}
	
	public ArrayList<Member> selectList() {
		Connection conn = JDBCTemplate.getConnection();
		ArrayList<Member> list = new MemberDAO().selectList(conn);
		JDBCTemplate.close(conn);

		return list;
	}
	
	public int updateMember(Member m) {
		Connection conn = JDBCTemplate.getConnection(); //static 메소드이기 때문에 객체 생성 X
		int result = new MemberDAO().updateMember(conn, m);
		
		if(result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}
	
	public int deleteMember(String userID) {
		Connection conn = JDBCTemplate.getConnection(); //static 메소드이기 때문에 객체 생성 X
		int result = new MemberDAO().deleteMember(conn, userID);
		
		if(result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}
	
	public Member selectByUserID(String userID) {
		Connection conn = JDBCTemplate.getConnection();
		Member m = new MemberDAO().selectByUserID(conn, userID);
		JDBCTemplate.close(conn);
		
		return m;
	}
	
	
	public ArrayList<Member> selectByUserName(String keyword){
		Connection conn = JDBCTemplate.getConnection();
		ArrayList<Member> list = new MemberDAO().selectByUserName(conn, keyword);
		JDBCTemplate.close(conn);
		
		return list;
	}
	
	
}
