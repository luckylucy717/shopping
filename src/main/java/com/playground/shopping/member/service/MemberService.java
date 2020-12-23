package com.playground.shopping.member.service;

import com.playground.shopping.member.entity.Member;
import com.playground.shopping.member.entity.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public List<Member> getMemberList(){
        return memberRepository.findAll();
    }
}