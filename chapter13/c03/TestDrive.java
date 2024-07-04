package com.tutorial.clean.code.chapter13.c03;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class TestDrive {

    public static void main(String[] args) {


        /*
            HashMap değilde concurrent Hashmap kullan -> thread safe collections
         */


        /*
         * Path:
         *
         * 	Executor framework
         *
         *
         */

        // 4 types of executor

        /*
         *  1) Single thread executor
         *  2) Fixed thread executor
         *  3) cached thread pool
         *  4) scheculed executor
         *
         */

        // Single thread executor
        // Single thread make sense to use sequential order
        ExecutorService executor1 = Executors.newSingleThreadExecutor();
        // -> go to example..


        // Fixed Thread Executor
        ExecutorService executor2 = Executors.newFixedThreadPool(4);


        // Cached thread pool
        // -> Such an executor is suitable for applications that launch many short-lived tasks
        ExecutorService executor3 = Executors.newCachedThreadPool();



        // Scheduled Executor
        ScheduledExecutorService executor4 = Executors.newScheduledThreadPool(1);



        // StringBuffer vs StringBuilder
        // StringBuffer is synchronized, StringBuilder is not.
        // Veri tutarlılığı için stringBuffer - Hız için StringBuilder



    }

}
