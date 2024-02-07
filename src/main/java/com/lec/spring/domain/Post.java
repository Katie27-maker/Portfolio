package com.lec.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

// Model 객체
/**
 * DTO 객체
 *  : Data Transfer Object 라고도 함.
 *
 *  객체 -> DB
 *  DB -> 객체
 *  reg param -> 객체
 *  ..
 *
 */

// 웹개발시...
// 가능한, 다음 3가지는 이름을 일치시켜주는게 좋습니다.
// 클래스 필드명 = DB 필드명 = form의 name명

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {
    private Long id;    // 아이디를 자동으로 생성이 됨
    private String user;
    private String subject;     // 왼쪽은 실제 컬럼 이름, 오른쪽은 별칭(데이타 베이스 맨 위에 뜨는거)
    private String content;
    private LocalDateTime regDate;  // 현재시간 함수 자동으로 생성이 됨
    private Long viewCnt; // 기본값이 0
}   // ERD모델을 표현함.
