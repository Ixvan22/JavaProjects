package com.ivan.springboot.twitter.application;

import com.ivan.springboot.twitter.domain.models.Tweet;
import com.ivan.springboot.twitter.domain.repositories.TweetRepositoryDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CreateTweetUseCase {

  private final TweetRepositoryDomain repository;

  public Tweet execute(Tweet tweet) {
    Tweet tweetDb = repository.createTweet(tweet);

    if (tweetDb == null) {
      throw new RuntimeException();
    }

    return tweetDb;

  }

}
