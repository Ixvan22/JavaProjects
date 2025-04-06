package com.ivan.springboot.twitter.infrastructure.repositories.entities;

import com.ivan.springboot.twitter.domain.models.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "tweets")
@AllArgsConstructor
@Data
public class TweetEntity {

  @Id
  @GeneratedValue
  private UUID id;
  private String message;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "username", referencedColumnName = "username")
  private UserEntity user;
  private boolean deleted;

}
