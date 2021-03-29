package com.webPractice.book.springboot.service.posts;

import com.webPractice.book.springboot.domain.posts.PostsRepository;
import com.webPractice.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository ;

    @Transactional
    public  Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId() ;
    }
}
