package com.shpp.strategy;

import java.util.HashMap;
import java.util.Map;

public enum EnumOfTests {
    TEST_WITH_TIME_LIMIT (new TestWithTimeLimit()),
    TESTS_WITH_MISTAKE_LIMIT(new TestWithMistakeLimit()),
    TEST_WITHOUT_LIMIT(new TestWithoutLimits());

    private final Test test;


    EnumOfTests(Test test) {
        this.test = test;
    }

    public static Test getTestByButton(String response){
        return getTestMap().get(response);
    }

    public static Map<String,Test> getTestMap(){
        Map<String,Test> testMap = new HashMap<>();
        testMap.put("a", TEST_WITH_TIME_LIMIT.test);
        testMap.put("b", TESTS_WITH_MISTAKE_LIMIT.test);
        testMap.put("c", TEST_WITHOUT_LIMIT.test);
        return testMap;
    }
}
