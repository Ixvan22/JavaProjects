package com.ivan.springboot.twitter.domain.models;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

  private String username;
  private boolean deleted;

}
