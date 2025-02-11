package com.mnemosine.mnemosine_service.model.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Annotations {
  private boolean bold;
  private boolean italic;
  private boolean strikethrough;
  private boolean underline;
  private boolean code;
  private String color;
}
