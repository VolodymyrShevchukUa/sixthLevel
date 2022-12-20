package com.shpp.singleton;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class DatabaseTest {
    public static final int N_THREADS = 10;
    Database instance;

    @Test
    public void SingletonTest(){

        ExecutorService executorService = Executors.newFixedThreadPool(N_THREADS);
        LinkedList<Future<Database>> futureLinkedList = new LinkedList<>();
        for(int i = 0;i<N_THREADS;i++){
           futureLinkedList.add(executorService.submit(Database::getDatabase));
        }
        executorService.shutdown();
        for(Future<Database> d:futureLinkedList){
            try {
                d.get().getConnection();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void makeTest(){
        instance = Database.getDatabase();
        instance.getConnection();
    }
}