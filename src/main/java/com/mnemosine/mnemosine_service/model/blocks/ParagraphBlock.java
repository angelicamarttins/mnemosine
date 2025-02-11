package com.mnemosine.mnemosine_service.model.blocks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mnemosine.mnemosine_service.model.common.Block;
import com.mnemosine.mnemosine_service.model.common.RichText;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ParagraphBlock extends Block {
  private Paragraph paragraph;

  private static class Paragraph {
    @JsonProperty("rich_text")
    private List<RichText> richText;

    private String color;
  }

}

