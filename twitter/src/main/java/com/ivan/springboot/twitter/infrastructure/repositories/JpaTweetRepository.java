package com.ivan.springboot.twitter.infrastructure.repositories;

import com.ivan.springboot.twitter.domain.models.Tweet;
import com.ivan.springboot.twitter.domain.repositories.TweetRepositoryDomain;
import com.ivan.springboot.twitter.infrastructure.mappers.TweetMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class JpaTweetRepository implements TweetRepositoryDomain {

  private final TweetMapper mapper;
  private final TweetRepository repository;

  @Override
  public Tweet createTweet(Tweet tweet) {
    return mapper.toTweet(repository.save(mapper.toEntity(tweet)));
  }

  @Override
  public List<Tweet> listAllTweets() {
    return mapper.toTweetList(repository.findAll());
  }

  @Override
  public List<Tweet> listAllTweetsByUsername(String username) {
    return mapper.toTweetList(repository.findAllByUsername(username));
  }
}
