package com.webPractice.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts , Long> {
    // DAO 라고 불리는 DB 접근자
    // JPA에서는 이를 Repository 라고 부른다.
    // 인터페이스로 생성, JpaRepository를 상속해서 만든다.
    // JpaRepository< Entity 클래스 , PK 타입 >

    // 주의할 점이라면 Entity 클래스와 Repository 는 항상 같은 위치에 같이 있어야만 한다.


}

