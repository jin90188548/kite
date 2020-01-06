package member;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainForSpring5 {
	
	
	// 조립기 생성 : 객체들을 보관
	// Spring Container
	private static ApplicationContext ctx = 
			new GenericXmlApplicationContext("classpath:appCtx6.xml");
	
	/*
	 * private static MemberRegisterService registerService =
	 * 
	 * assembler.getRegistService();
	 */

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("명령어를 입력해주세요.");
			
			String command = reader.readLine();
			
			if(command.equalsIgnoreCase("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			// new ryuyj@nate.com 1111 1111 ryuyj
			if(command.startsWith("new ")) {
				processNewCommand(command.split(" "));
			}
			
			if(command.startsWith("change ")) {
				processChangeCommand(command.split(" "));
				
			}
			
		}
		
		
		

	}
	

	
	private static void processNewCommand(String[] args) {
		
		if(args.length != 5) {
			printHelp();
			return;
		}
		
		//MemberRegisterService service = assembler.getRegistService();
		
		MemberRegisterService service = 
				ctx.getBean("registService", MemberRegisterService.class);
		
		RegisterRequest request = new RegisterRequest();
		request.setEmail(args[1]);
		request.setName(args[2]);
		request.setPassword(args[3]);
		request.setConfirmPassword(args[4]);
		if(!request.isPasswordEqualToConfirmPassword()) {
			System.out.println("암호 확인이 일치하지 않습니다.");
			return;
		}
		
		try {
			service.regist(request);
			System.out.println("등록되었습니다.");
		} catch (AleadyExistingMemberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("이미 존재하는 이메일입니다.");
		}
		
		
	}



	private static void processChangeCommand(String[] args) {
		
		if(args.length != 4) {
			printHelp();
			return;
		}
		
		//ChangePasswordService service = assembler.getPwService();
		ChangePasswordService service = 
				ctx.getBean("changePwService", ChangePasswordService.class); 
				
				
		try {
			service.changePassword(args[1], args[2], args[3]);
			System.out.println("암호가 변경되었습니다.");
		} catch (MemberNotfoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("존재하지 않는 이메일 입니다.");
		} catch (IdPasswordNotMatchingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("이메일과 암호가 일치하지 않습니다.");
		}
		
	}

	
	private static void printHelp() {
		System.out.println("");
		System.out.println("잘못된 명령 입니다. 아래 명령 사용법을 확인하세요.");
		System.out.println("new 이메일 사용자이름 암호 암호확인");
		System.out.println("change 이메일 현재암호 새로운암호");
		
	}
	
	
	
	
	
	
	
	
	
}
