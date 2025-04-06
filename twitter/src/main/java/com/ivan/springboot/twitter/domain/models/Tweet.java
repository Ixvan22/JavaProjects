package com.ivan.springboot.twitter.domain.models;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Tweet {

  private UUID id;
  private String message;
  private User user;
  private boolean deleted;

}
