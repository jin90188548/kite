package member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component(value = "changePwService")
@Service(value = "changePwService")
public class ChangePasswordService { // changePasswordService
	
	//private MemberDao memberDao = new MemberDao();
	
	@Autowired
	private MemberDao memberDao;

//	public void setMemberDao(MemberDao memberDao) {
//		this.memberDao = memberDao;
//	}
	
	
//	public ChangePasswordService(MemberDao dao) {
//		memberDao = dao;
//	}
	



	public void changePassword(
			String email, 
			String oldPassword, 
			String newPassword) throws MemberNotfoundException, IdPasswordNotMatchingException {
		
		Member member = memberDao.selectByEmail(email);
		
		if(member == null) {
			throw new MemberNotfoundException();
		}
		member.changePassword(oldPassword, newPassword);
		
		memberDao.update(member);
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
