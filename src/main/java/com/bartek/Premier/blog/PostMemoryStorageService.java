package com.bartek.Premier.blog;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class PostMemoryStorageService implements PostRepository {

    private final PostRepository postRepository;

    public PostMemoryStorageService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Collection<PostForm> createPost() {
        return postRepository.createPost();
    }

    @Override
    public PostForm save(PostForm postForm) {
        return postRepository.saveAndFlush(postForm);
    }

    @Override
    public void delete(PostForm postForm) {
        postRepository.delete(postForm);

    }


}