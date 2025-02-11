package com.mnemosine.mnemosine_service.model.blocks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mnemosine.mnemosine_service.model.common.Block;
import com.mnemosine.mnemosine_service.model.common.RichText;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class BookmarkBlock extends Block {
  private Bookmark bookmark;

  @Getter
  private static class Bookmark {
    private List<RichText> caption;
    private String url;
  }
}
