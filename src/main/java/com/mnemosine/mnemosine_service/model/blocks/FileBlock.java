package com.mnemosine.mnemosine_service.model.blocks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
@AllArgsConstructor
public class FileBlock extends NotionIcon {
  private File file;

  @Getter
  private static class File {
    private String url;
    @JsonProperty("expiry_time")
    private ZonedDateTime expiryTime;
  }
}
