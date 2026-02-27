package com.java.board.boundedContext.member.service;

import com.java.board.boundedContext.member.repository.MemberRepository;
import com.java.board.container.Container;

public class MemberService {
    private MemberRepository memberRepository;

    public MemberService() {
        memberRepository = Container.memberRepository;
    }

    public void join(String username, String password, String name) {
        memberRepository.join(username, password, name);
    }
}