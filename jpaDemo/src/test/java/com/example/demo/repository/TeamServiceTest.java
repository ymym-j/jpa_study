package com.example.demo.repository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Team;
import com.example.demo.service.TeamService;

@SpringBootTest
@RunWith(SpringRunner.class)
class TeamServiceTest {

	@Autowired
	private TeamService teamService;
	
	@Test
	public void create() {
		Team team = new Team();
		team.setName("Team A");
		teamService.create(team);
	}
}
