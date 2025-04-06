package com.ivan.springboot.twitter.infrastructure.controllers;

import com.ivan.springboot.twitter.application.TweetService;
import com.ivan.springboot.twitter.domain.models.Tweet;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TweetController {

  private final TweetService service;

  @PostMapping("/createTweet")
  public ResponseEntity<Tweet> createTweet(@RequestBody Tweet tweet) {
    return ResponseEntity.ok(service.createTweet(tweet));
  }

}
