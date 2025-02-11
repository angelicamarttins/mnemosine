package com.mnemosine.mnemosine_service.model.blocks;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BreadcrumbBlock {
  private Breadcrumb breadcrumb;

  @Getter
  private static class Breadcrumb {
  }
}
