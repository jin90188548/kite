package com.kite.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.demo.domain.OpMember;

public interface MemberMapper {
	
	@Select("select * from opmember order by idx")
	public List<OpMember> getMemberList();
	public OpMember selectMemberById(@RequestParam("uId") String uid);

}
