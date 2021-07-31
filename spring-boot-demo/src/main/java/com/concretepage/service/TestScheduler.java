package com.concretepage.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduler {

    @Scheduled(initialDelay = 30_000L, fixedRate = 15_000L)@Scheduled(fixedRate = 2000)
    public void test()
    {
        System.out.println("pribdb");
    }
}
