package com.mnemosine.mnemosine_service.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Color {
  BLUE("blue"),
  BLUE_BACKGROUND("blue_background"),
  BROWN("brown"),
  BROWN_BACKGROUND("brown_background"),
  DEFAULT("default"),
  GRAY("gray"),
  GRAY_BACKGROUND("gray_background"),
  GREEN("green"),
  GREEN_BACKGROUND("green_background"),
  ORANGE("orange"),
  ORANGE_BACKGROUND("orange_background"),
  YELLOW("yellow"),
  PINK("pink"),
  PINK_BACKGROUND("pink_background"),
  PURPLE("purple"),
  PURPLE_BACKGROUND("purple_background"),
  RED("red"),
  RED_BACKGROUND("red_background"),
  YELLOW_BACKGROUND("yellow_background");

  private final String value;

  @JsonValue
  public String getValue() {
    return value;
  }

  @JsonCreator
  public static Color fromString(String value) {
    for (Color color : Color.values()) {
      if (color.value.equalsIgnoreCase(value)) {
        return color;
      }
    }
    throw new IllegalArgumentException("Unknown color: " + value);
  }
}
