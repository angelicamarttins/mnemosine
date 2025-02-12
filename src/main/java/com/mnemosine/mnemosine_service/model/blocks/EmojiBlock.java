package com.mnemosine.mnemosine_service.model.blocks;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EmojiBlock extends NotionIcon {
  private String emoji;
}
