package com.mnemosine.mnemosine_service.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mnemosine.mnemosine_service.model.common.Block;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
public class BlocksDto {

  private String object;

  @JsonProperty("results")
  private List<Block> children;

  @JsonProperty("next_cursor")
  private String nextCursor;

  @JsonProperty("has_more")
  private boolean hasMore;

  private String type;

  private UUID request_id;

  private Object block;
}
