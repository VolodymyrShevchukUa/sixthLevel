package com.shpp.strategy;

import org.telegram.telegrambots.meta.api.objects.Update;

public class TestWithMistakeLimit extends Test{

    @Override
    public String startTest(Update update) {
        return  "We are starting test with mistake Limit";
    }
}
