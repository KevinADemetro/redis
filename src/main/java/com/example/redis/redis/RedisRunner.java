package com.example.redis.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.redis.redis.service.RedisService;

@Component
public class RedisRunner implements CommandLineRunner{

  @Autowired
  private RedisService service;

  @Override
  public void run(String... args){
    service.saveValue("teste", "hello redis");
    System.out.println((String) service.getValue("teste"));
  }
}
