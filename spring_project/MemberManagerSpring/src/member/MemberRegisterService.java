package member;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component(value = "registService")
@Service(value = "registService")
public class MemberRegisterService {
	
	private MemberDao memberDao;
	
	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
//	public MemberRegisterService(MemberDao memberDao) {
//		this.memberDao = memberDao;
//	}
	
	public void regist(RegisterRequest request) throws AleadyExistingMemberException {
		
		Member member = memberDao.selectByEmail(request.getEmail());
		
		if(member != null) {
			throw new AleadyExistingMemberException();
		}
		
		Member newMember = new Member(
				request.getEmail(), 
				request.getPassword(), 
				request.getName(), 
				new Date());
		
		memberDao.insert(newMember);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
