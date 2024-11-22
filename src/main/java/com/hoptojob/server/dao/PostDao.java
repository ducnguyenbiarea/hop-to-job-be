package com.hoptojob.server.dao;

import com.hoptojob.server.model.PostModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostDao extends MongoRepository<PostModel, String> {

}
