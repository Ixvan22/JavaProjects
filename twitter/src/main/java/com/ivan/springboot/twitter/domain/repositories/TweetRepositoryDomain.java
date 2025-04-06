package com.ivan.springboot.twitter.domain.repositories;

import com.ivan.springboot.twitter.domain.models.Tweet;

import java.util.List;

public interface TweetRepositoryDomain {

  Tweet createTweet(Tweet tweet);
  List<Tweet> listAllTweets();
  List<Tweet> listAllTweetsByUsername(String username);

}
