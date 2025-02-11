package com.mnemosine.mnemosine_service.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.UUID;

@Data
public class Parent {

  private String type;

  @JsonProperty("page_id")
  private UUID pageId;

}
