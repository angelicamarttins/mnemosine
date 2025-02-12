package com.mnemosine.mnemosine_service.model.blocks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mnemosine.mnemosine_service.model.common.Block;
import com.mnemosine.mnemosine_service.model.common.RichText;
import com.mnemosine.mnemosine_service.model.enums.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class BulletedListItemBlock extends Block {
  @JsonProperty("bulleted_list_item")
  private BulletedListItem bulletedListItem;

  @Getter
  private static class BulletedListItem {
    @JsonProperty("rich_text")
    private List<RichText> rickText;
    private Color color;
    private List<Block> children;
  }
}
