package com.ivan.springboot.twitter.infrastructure.repositories.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "users")
@AllArgsConstructor
public class UserEntity {

  @Id
  private String username;
  private boolean deleted;

}
