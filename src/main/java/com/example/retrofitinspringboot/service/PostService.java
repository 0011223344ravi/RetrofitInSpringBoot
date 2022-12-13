package com.example.retrofitinspringboot.service;

import com.example.retrofitinspringboot.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    public List<Post> fetchPosts();
}
