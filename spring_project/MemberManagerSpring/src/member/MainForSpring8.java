package member;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainForSpring8 {
	
	
	// 조립기 생성 : 객체들을 보관
	// Spring Container
	private static ApplicationContext ctx = 
			new GenericXmlApplicationContext("classpath:appCtx8.xml");
	
	/*
	 * private static MemberRegisterService registerService =
	 * 
	 * assembler.getRegistService();
	 */

	public static void main(String[] args) throws IOException {
		
		MemberDao  dao1 = ctx.getBean("memberDao", MemberDao.class);
		MemberDao  dao2 = ctx.getBean("memberDao", MemberDao.class);
		
		System.out.println("dao1==dao2    ==>  " + (dao1==dao2) ); // true
		System.out.println("______________________________________");
		
		MemberRegisterService rservice1 = 
				ctx.getBean("registService", MemberRegisterService.class);
		MemberRegisterService rservice2 = 
				ctx.getBean("registService", MemberRegisterService.class);

		System.out.println("rservice1==rservice2    ==>  " + (rservice1==rservice2) ); // false
		System.out.println("______________________________________");
			
		ChangePasswordService cservice1 = 
				ctx.getBean("changePwService", ChangePasswordService.class); 
		ChangePasswordService cservice2 = 
				ctx.getBean("changePwService", ChangePasswordService.class);

		System.out.println("cservice1==cservice2    ==>  " + (cservice1==cservice2) ); // true
		System.out.println("______________________________________");
		
		
		

	}
	

	
	
	
	
	
}
