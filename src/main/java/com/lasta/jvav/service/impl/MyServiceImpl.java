package com.lasta.jvav.service.impl;

import com.lasta.jvav.service.MyService;

import java.util.concurrent.*;

public class MyServiceImpl implements MyService {

    private static final int CORE_POOL_SIZE = 10;
    private static final int MAX_POOL_SIZE = 20;
    private static final long KEEP_ALIVE = 1;
    private static final TimeUnit KEEP_ALIVE_TIME_UNIT = TimeUnit.SECONDS;

    private static final BlockingQueue<Runnable> WORK_QUEUE = new LinkedBlockingQueue<>();

    private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(
            CORE_POOL_SIZE,
            MAX_POOL_SIZE,
            KEEP_ALIVE,
            KEEP_ALIVE_TIME_UNIT,
            WORK_QUEUE,
            new ThreadPoolExecutor.CallerRunsPolicy()
    );

    public static void main(String[] args) {
        Runnable task = () -> {
            
        };
    }
}
