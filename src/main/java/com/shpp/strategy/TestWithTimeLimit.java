package com.shpp.strategy;

import org.telegram.telegrambots.meta.api.objects.Update;

public class TestWithTimeLimit extends Test {


    @Override
    public String startTest(Update update) {
        return  "We will start test with time limit";
    }
}
