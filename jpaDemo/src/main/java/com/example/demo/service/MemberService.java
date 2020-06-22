package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.SynchronousQueue;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	public void create(Member data) {
		memberRepository.save(data);
	}
	
	public List<Member> getAllList(){
		return memberRepository.findAll() ;
	}
	
	public Optional<Member> getList(long id) {
		return memberRepository.findById(1L);
	}
	
	public void update(long id, String name) {
		Optional<Member> user = memberRepository.findById(id);
        user.ifPresent((selectMember) ->{
        	selectMember.setUserName(name);
        	memberRepository.save(selectMember);
        });
	}
	
	public void delete(long id) {
		Optional<Member> user = memberRepository.findById(id);
		 
        user.ifPresent((selectMember) ->{
        	memberRepository.delete(selectMember);
        });
    }
}
