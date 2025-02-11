package com.mnemosine.mnemosine_service.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {

  @JsonProperty("object")
  private String user;

  @JsonProperty("id")
  private UUID userId;

}
