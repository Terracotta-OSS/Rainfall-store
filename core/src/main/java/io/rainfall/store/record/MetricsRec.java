package io.rainfall.store.record;

import io.rainfall.store.core.MetricsLog;

/**
 * @author Aurelien Broszniowski
 */

public class MetricsRec {

  private final Long id;
  private final MetricsLog value;

  public MetricsRec(Long id, MetricsLog value) {
    this.id = id;
    this.value = value;
  }

  public Long getId() {
    return id;
  }

  public MetricsLog getValue() {
    return value;
  }

  public String getCloudType() {
    return this.value.getCloudType();
  }
}
