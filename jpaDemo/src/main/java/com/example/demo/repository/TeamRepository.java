package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long>{


}
