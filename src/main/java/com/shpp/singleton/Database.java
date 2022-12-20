package com.shpp.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Database {
    static Logger logger = LoggerFactory.getLogger(Database.class);

    private static Object lock = new Object();

    private static Database instance = null;

    private Database() {
    }

    public static Database getDatabase() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public int getConnection() {
        logger.info("Connection successfully have got , hash code = {} ", this.hashCode());
        return hashCode();
    }
}
