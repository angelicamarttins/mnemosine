package com.mnemosine.mnemosine_service.model.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RichText {
  private String type;
  private Text text;
  private Annotations annotations;
  private String plainText;
  private String href;
}
