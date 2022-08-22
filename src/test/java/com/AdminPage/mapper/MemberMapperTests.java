package com.AdminPage.mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.AdminPage.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {
	@Autowired
	private MemberMapper membermapper;			//MemberMapper.java 인터페이스 의존성 주입
	
	/* 회원가입 쿼리 테스트 */
	@Test
	public void memberJoin() throws Exception{
		MemberVO member = new MemberVO();
		
		member.setAdId("test1");			//회원 id
		member.setAdPw("test1");			//회원 비밀번호
		member.setAdName("test1");		//회원 이름
		member.setAdMail("test1");		//회원 메일
		member.setAdAddr1("test1");		//회원 우편번호
		
		membermapper.memberJoin(member);			//쿼리 메서드 실행
		
	}
	
	/* 로그인 쿼리 mapper 메서드 테스트 */
//    @Test
//    public void memberLogin() throws Exception{
//        
//        MemberVO member = new MemberVO();    // MemberVO 변수 선언 및 초기화
//        
//        /* 올바른 아이디 비번 입력경우 */
//        member.setAdId("test");
//        member.setAdPw("test");
//        
////        /* 올바른 않은 아이디 비번 입력경우 */
////        member.setAdId("test1123");
////        member.setAdPw("test1321321");
//        
//        membermapper.memberLogin(member);
//        System.out.println("결과 값 : " + membermapper.memberLogin(member));
//        
//    }
}
