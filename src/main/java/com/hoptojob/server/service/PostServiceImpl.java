package com.hoptojob.server.service;

import com.hoptojob.server.dao.PostDao;
import com.hoptojob.server.dto.PostDTO;
import com.hoptojob.server.model.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostDao postDao;
    @Override
   public PostModel savePost(PostDTO postDTO) {
       PostModel postModel = new PostModel();
       postModel.setProfile(postDTO.getProfile());
       postModel.setDescription(postDTO.getDescription());
       postModel.setSalary(postDTO.getTechnology());
       postModel.setType(postDTO.getType());
       postModel.setExperience(postDTO.getExperience());
       return postDao.save(postModel);
   }

    @Override
    public List<PostModel> getAllPosts() {
        return postDao.findAll();
    }
}
