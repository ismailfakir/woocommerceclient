package net.cloudcentrik.woocommerceclient.scheduler;

import net.cloudcentrik.woocommerceclient.App;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.Random;

public class TestJob implements org.quartz.Job {

    private static final Logger log = LoggerFactory.getLogger(TestJob.class);

    public TestJob() {
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {

        JobKey key = context.getJobDetail().getKey();

        JobDataMap dataMap = context.getJobDetail().getJobDataMap();

        log.info("\n");
        log.info("Scheduling a job at "+new Date());
        for (int i = 0; i <5 ; i++) {
            log.info("Generating a random number : ["+i+"]"+ nextRandom(dataMap.getIntValue("min"),dataMap.getIntValue("max")));
        }
    }

    private int nextRandom(int min,int max){

        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
