package com.mnemosine.mnemosine_service.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.mnemosine.mnemosine_service.model.blocks.ParagraphBlock;

import java.time.ZonedDateTime;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParagraphBlock.class, name = "paragraph")
})
public class Block {
  protected String object;

  protected String id;

  protected Parent parent;

  @JsonProperty("created_by")
  protected User createdBy;

  @JsonProperty("last_edited_by")
  protected User lastEditedBy;

  @JsonProperty("created_time")
  protected ZonedDateTime createdTime;

  @JsonProperty("last_edited_time")
  protected ZonedDateTime lastEditedTime;

  @JsonProperty("has_children")
  protected boolean hasChildren;

  protected boolean archived;


  @JsonProperty("in_trash")
  protected boolean inTrash;
}

