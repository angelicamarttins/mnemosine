package com.mnemosine.mnemosine_service.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RichText {
  private String type;
  private Text text;
  private Annotations annotations;
  @JsonProperty("plain_text")
  private String plainText;
  private String href;
}
