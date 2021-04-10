package com.example.flink;

import org.apache.flink.api.common.JobID;
import org.apache.flink.api.common.JobStatus;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.runtime.executiongraph.JobStatusListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JobStatusPrinter implements JobStatusListener {

  private static final Logger LOG = LoggerFactory.getLogger(JobStatusPrinter.class);

  public void open(Configuration configuration) {
    LOG.info("The JobStatusListenerPluginExample is opened using config: {}", configuration.toMap());
  }

  public void close() {
    LOG.info("The JobStatusListenerPluginExample is closed");
  }

  public void jobStatusChanges(JobID jobID, JobStatus jobStatus, long timestamp, Throwable error) {
    LOG.info("The status of the job {} is changed to {}", jobID, jobStatus);
  }
}
