package com.code.joblisting.controller;

import com.code.joblisting.model.Post;
import com.code.joblisting.repository.PostRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostController {

    @Autowired
    PostRepository postRepository;

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }
}
