package com.bartek.Premier.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

    @Controller
public class blogController {
    @Autowired
    private PostMemoryStorageService postMemoryStorageService;

    @RequestMapping(path="/pl/blog/posts", method= RequestMethod.GET)
    public String getPostList(Model model){
        model.addAttribute(("postForm"),new PostForm());
        model.addAttribute("posts",postMemoryStorageService.getPostList());
        return "blog/posts";
    }
    @RequestMapping(path="/pl/blog/posts", method= RequestMethod.POST)
    public String createPost(PostForm postForm) {
        PostDto postDto=postMemoryStorageService.createPost(postForm.getMatch(), postForm.getWinner());
        return "/blog/posts/match";
    }
    @RequestMapping(path = "/pl/table/posts/", method = RequestMethod.GET)
    public String getPost (@PathVariable("match") String match, Model model){
        model.addAttribute("match", postMemoryStorageService.getMatch());
        return "table/post";
    }
}


