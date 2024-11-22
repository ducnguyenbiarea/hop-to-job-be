package com.hoptojob.server.controller;

import com.hoptojob.server.constants.APIConstants;
import com.hoptojob.server.dto.PostDTO;
import com.hoptojob.server.model.PostModel;
import com.hoptojob.server.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin
public class PostController {
    private static final Logger log = LogManager.getLogger(PostController.class);
    @Autowired
    final PostService postService;

    public PostController() {
        postService = null;
    }


    @PostMapping(APIConstants.SAVE_POST)
    public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest){
        log.info("Saving post ######");
    return this.postService.savePost(postDTORequest);
    }

    @GetMapping(APIConstants.GET_ALL_POSTS)
    public List<PostModel> getAllPosts(){
        log.info("Gettin all posts ########");
        return this.postService.getAllPosts();
    }
}
