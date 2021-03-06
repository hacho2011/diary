package kr.co.mlec.login;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.mlec.vo.MemberVO;


@Repository
public class LoginDAO implements LoginDAOInter{

	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Override
	public int joinMember(MemberVO member) {
		return sqlSession.insert("kr.co.mlec.login.joinMember", member);
	}
	
	/**
	 * 회원조회
	 */
	@Override
	public MemberVO loginMember(MemberVO member) {
		return sqlSession.selectOne("kr.co.mlec.login.loginMember", member);
	}

	@Override
	public MemberVO duplCheck(Map<String, Object> parameters) {
		return sqlSession.selectOne("kr.co.mlec.login.duplCheck", parameters);
	}

	@Override
	public void createAuthKey(String user_email, String user_authCode) {
		MemberVO member = new MemberVO();
		member.setEmail(user_email);
		member.setAuth_key(user_authCode);

		sqlSession.update("kr.co.mlec.login.createAuthKey", member);
	}

	@Override
	public MemberVO keyConfirm(String email, String key) {
		MemberVO member = new MemberVO();
		member.setEmail(email);
		member.setAuth_key(key);
		return sqlSession.selectOne("kr.co.mlec.login.keyConfirm", member);
	}

	@Override
	public void authUpdate(String email) {
		sqlSession.update("kr.co.mlec.login.authUpdate", email);
	}

	@Override
	public void changePassword(MemberVO member) {
		sqlSession.update("kr.co.mlec.login.changePassword", member);
	}

	@Override
	public boolean emailCheck(MemberVO member) {
		int cnt = sqlSession.selectOne("kr.co.mlec.login.emailCheck", member);
		if(cnt == 1)
			return true;
		else
			return false;
	}


}
