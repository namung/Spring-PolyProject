package com.AdminPage.model;

public class MemberVO {
	//회원 id
		private String adId;
		
		//회원 비밀번호
		private String adPw;
		
		//회원 이름
		private String adName;
		
		//회원 이메일
		private String adMail;
		
		//회원 우편번호
		private String adAddr1;
		
		//등록일자
		private int regDate;

		public String getAdId() {
			return adId;
		}

		public void setAdId(String adId) {
			this.adId = adId;
		}

		public String getAdPw() {
			return adPw;
		}

		public void setAdPw(String adPw) {
			this.adPw = adPw;
		}

		public String getAdName() {
			return adName;
		}

		public void setAdName(String adName) {
			this.adName = adName;
		}

		public String getAdMail() {
			return adMail;
		}

		public void setAdMail(String adMail) {
			this.adMail = adMail;
		}

		public String getAdAddr1() {
			return adAddr1;
		}

		public void setAdAddr1(String adAddr1) {
			this.adAddr1 = adAddr1;
		}

		public int getRegDate() {
			return regDate;
		}

		public void setRegDate(int regDate) {
			this.regDate = regDate;
		}

		@Override
		public String toString() {
			return "MemberVO [adId=" + adId + ", adPw=" + adPw + ", adName=" + adName + ", adMail=" + adMail
					+ ", adAddr1=" + adAddr1 + ", regDate=" + regDate + "]";
		}
		
		
}
