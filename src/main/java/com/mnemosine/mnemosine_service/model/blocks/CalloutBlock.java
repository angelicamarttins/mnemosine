package com.mnemosine.mnemosine_service.model.blocks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mnemosine.mnemosine_service.model.common.Block;
import com.mnemosine.mnemosine_service.model.common.RichText;
import com.mnemosine.mnemosine_service.model.enums.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CalloutBlock extends Block {
  private Callout callout;

  @Getter
  private static class Callout {
    @JsonProperty("rich_text")
    private List<RichText> richText;
    private NotionIcon icon;
    private Color color;
  }
}
