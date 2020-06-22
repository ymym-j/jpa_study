package com.example.demo.repository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Member;
import com.example.demo.entity.Team;
import com.example.demo.service.MemberService;

@SpringBootTest
@RunWith(SpringRunner.class)
class MemberServiceTest {

	@Autowired
	private MemberService memberService;
	@Autowired
	private MemberRepository memberre;
	
	@Autowired
	private TeamRepository teamRepository;
	
	@Test
	public void create() {
		Member member = new Member();
		
		Team team = new Team();
		team.setName("TeamA");
//		teamRepository.save(team);
		
		member.setUserName("TeamA_001");
		member.setTeam(team);
		memberService.create(member);
	}
	
	@Test
	public void create2() {
		Member member = new Member();
		
		member.setUserName("TeamA_002");
		member.setTeam(teamRepository.getOne((long) 1));
		memberService.create(member);
	}
	
    @Test
    public void read(){
    	System.out.println("All List : " + memberService.getList(1));
    }
    
    @Test
    public void update(){
    	memberService.update(1L, "TeamA_U001");
    }

    @Test
    public void delete(){
    	memberService.delete(2L);
    }
}
