package com.yeeun.web.member;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
	private Map<String, Object> map;
	public MemberServiceImpl() {
		map = new HashMap<>();
	}
	@Override
	public int count() {
		return map.size();
	}


	@Override
	public Member login(Member member) {
		Member returnUser = null;
		if(map.containsKey(member.getUserid())) {
			Member m = detail(member.getUserid());
			if(member.getPasswd().equals(m.getPasswd())) {
				return m;
			}
		}
		return returnUser;
	}

	@Override
	public Member detail(String userid) {
		Member t = (Member)map.get(userid);
		return (Member) map.get(userid);
	}

	@Override
	public boolean update(Member member) {
		map.replace(member.getUserid(), member);
		return true;
	}

	@Override
	public boolean remove(String userid) {
		map.remove(userid);
		return true;
	}
	@Override
	public void add(Member member) {
		map.put(member.getUserid(), member);
	}

}
