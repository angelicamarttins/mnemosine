package com.mnemosine.mnemosine_service.model.blocks;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = EmojiBlock.class, name = "emoji"),
    @JsonSubTypes.Type(value = FileBlock.class, name = "file")
})
public class NotionIcon {
}
