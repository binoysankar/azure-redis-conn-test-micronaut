package com.daimler.pf.test.service;

import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import org.apache.commons.lang3.RandomStringUtils;

import javax.inject.Inject;

public class RedisService {

  @Inject
  private StatefulRedisConnection<String, String> connection;

  public void testCrudOperations() {
    RedisCommands<String, String> commands = connection.sync();
    commands.set(RandomStringUtils.randomAlphanumeric(11), RandomStringUtils.randomAlphanumeric(11));
  }

}
