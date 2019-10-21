package com.electron.reactive.repo;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.electron.reactive.model.MyUser;

@Repository
public interface MyUserRepo extends ReactiveMongoRepository<MyUser, String> {

}