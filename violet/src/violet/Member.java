package violet;

import java.io.Serializable;

public class Member implements Serializable {
	//회원아이디,비밀번호,이메일에
	
	private String member_id;
	private String member_pw;
	private String member_email;
	
	public Member(String id, String pw, String email) {
		member_id = id;
		member_pw = pw;
		member_email = email;
	}
	
	public String returnId() {
		return member_id;
	}
	
	public String returnPw() {
		return member_pw;
	}
	
	public String returnEmail() {
		return member_email;
	}

}
