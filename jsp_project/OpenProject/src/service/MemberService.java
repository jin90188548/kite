package service;

import javax.servlet.http.HttpServletRequest;

public interface MemberService {

	// 요구사항에 대한 처리
	// 핵심처리, 결과 데이터를 request 속성에 저장
	// view 페이지 지정
	
	String process(HttpServletRequest request);
	
	
	
	
	
}
