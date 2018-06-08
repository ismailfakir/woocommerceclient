package net.cloudcentrik.woocommerceclient.scheduler;

import net.cloudcentrik.woocommerceclient.App;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class TestJob implements org.quartz.Job {

    private static final Logger log = LoggerFactory.getLogger(TestJob.class);

    public TestJob() {
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("Scheduling a job at "+new Date());
        for (int i = 0; i <5 ; i++) {
            log.info("Generating a random number : ["+i+"]"+Math.random());
        }
    }
}
