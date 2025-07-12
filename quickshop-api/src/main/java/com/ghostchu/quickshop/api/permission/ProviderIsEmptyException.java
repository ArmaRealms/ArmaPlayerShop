package com.ghostchu.quickshop.api.permission;

import lombok.Getter;

/**
 * Thrown when no permission provider is found.
 */
@Getter
public class ProviderIsEmptyException extends RuntimeException {

  private final String providerName;

  public ProviderIsEmptyException(final String providerName) {

    this.providerName = providerName;
  }
}
