package com.lec.spring.domain;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PostValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        System.out.println("supports(" + (clazz.getName()) + ")");
        boolean result = Post.class.isAssignableFrom(clazz);
        System.out.println(result);
        return result;
    }
//    Class<?> clazz 클레스의 리터럴 값 클래스를 받아온다

    @Override
    public void validate(Object target, Errors errors) {
        System.out.println("validate() 호출");
        Post post = (Post) target;

        String user = post.getUser();
        if(user == null || user.trim().isEmpty()){
            // rejectValue(field, errorCode) <- 유효성 검증 에러 추가
            errors.rejectValue("user", "작성자는 필수입니다.");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "subject", "글 제목은 필수입니다.");
    }
}