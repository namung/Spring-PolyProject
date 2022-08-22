package com.AdminPage.service;

import com.AdminPage.model.MemberVO;

public interface MemberService {
	
	
	
	//회원가입
	public void memberJoin(MemberVO member) throws Exception;

	/*로그인*/
	public MemberVO memberLogin(MemberVO member) throws Exception;
}
