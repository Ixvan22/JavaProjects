package com.ivan.springboot.twitter.application;

import com.ivan.springboot.twitter.domain.models.Tweet;
import com.ivan.springboot.twitter.domain.repositories.TweetRepositoryDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TweetService {

  private final CreateTweetUseCase createTweetUseCase;

  public Tweet createTweet(Tweet tweet) {
    return createTweetUseCase.execute(tweet);
  }

  public List<Tweet> listAllTweets() {
    return List.of();
  }

  public List<Tweet> listAllTweetsByUsername(String username) {
    return List.of();
  }
}
