package com.ivan.springboot.twitter.infrastructure.repositories;

import com.ivan.springboot.twitter.infrastructure.repositories.entities.TweetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TweetRepository extends JpaRepository<TweetEntity, UUID> {

  List<TweetEntity> findAllByUsername(String username);
}
