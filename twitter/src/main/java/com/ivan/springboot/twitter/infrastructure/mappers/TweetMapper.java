package com.ivan.springboot.twitter.infrastructure.mappers;

import com.ivan.springboot.twitter.domain.models.Tweet;
import com.ivan.springboot.twitter.infrastructure.repositories.entities.TweetEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TweetMapper {

  @Mapping(source = "message", target = "message")
  @Mapping(source = "user", target = "user")
  @Mapping(source = "deleted", target = "deleted")
  TweetEntity toEntity(Tweet model);

  @Mapping(source = "message", target = "message")
  @Mapping(source = "user", target = "user")
  @Mapping(source = "deleted", target = "deleted")
  Tweet toTweet(TweetEntity model);

  List<Tweet> toTweetList(List<TweetEntity> model);

}
