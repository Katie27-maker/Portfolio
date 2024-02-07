package com.lec.spring.service;

// Service layer
// - Business logic, Transaction 담당
// - Controller 와 Data 레이어의 분리

import com.lec.spring.domain.Post;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
// 인터페이스는 안에 있는 메소드를 구현해야 한다 // 구현해야 사용할 수 있다
// 구현하는 방법은 해당 인터페이스를 다른 class가 implement(구현)해야 한다.
// 메소드만 정의 되어있음 아직 구현이 되어 있지 않다.
public interface BoardService {
    // 글 작성
    // 입력: subject, user, content
    int write(Post post);

    // 특정 id 의 글 조회
    // 트랜잭션 처리
    // 1. 조회수 증가 (UPDATE)
    // 2. 글 읽어오기 (SELECT)
    @Transactional
    Post detail(Long id);

    // 글 목록 조회
    List<Post> list();

    // 특정 id 의 글 읽어오기 (SELECT)
    // 조회수 증가 없음
    Post selectById(Long id);

    // 특정 id 글 수정하기 (제목, 내용) (UPDATE)
    int update(Post post);

    // 특정 id 글 삭제하기 (DELETE)
    int deleteById(Long id);
}  // end Service












