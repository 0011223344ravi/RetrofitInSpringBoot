package com.example.retrofitinspringboot.controller;


import com.example.retrofitinspringboot.model.Post;
import com.example.retrofitinspringboot.service.PostApi;
import com.example.retrofitinspringboot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("v1/retrofit")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> fetchPosts(){
       return postService.fetchPosts();

    }


}
