package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원 저장소에 저장
    Optional<Member> findById(long id);
    Optional<Member> findByName(String name);
    List<Member> findAll(); // 지금까지 저장된 모든 회원의 대한 정보를 받아옴.
}
