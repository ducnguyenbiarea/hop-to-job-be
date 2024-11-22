package com.hoptojob.server.service;

import com.hoptojob.server.dto.PostDTO;
import com.hoptojob.server.model.PostModel;

import java.util.List;

public interface PostService {
    public PostModel savePost(PostDTO postDTO);
    public List<PostModel> getAllPosts();
}
