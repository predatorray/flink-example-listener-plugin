package com.example.flink;

import org.apache.flink.configuration.Configuration;
import org.apache.flink.runtime.executiongraph.JobStatusListenerFactory;

public class JobStatusPrinterFactory implements JobStatusListenerFactory {
  public JobStatusPrinter createJobStatusListener(Configuration configuration) {
    return new JobStatusPrinter();
  }
}
