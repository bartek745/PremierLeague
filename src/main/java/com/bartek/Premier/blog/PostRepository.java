package com.bartek.Premier.blog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
@Repository
public interface PostRepository extends JpaRepository<PostForm, String> {
    Collection<PostForm> createPost();
    Collection<PostForm> save();


}