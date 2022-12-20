package com.shpp.bot.strategy;

import com.shpp.adapter.TextMessage;
import org.glassfish.grizzly.utils.Pair;

import java.util.Random;

public abstract class Strategy {

    private String answer ;

    private final Random random = new Random();

    public TextMessage getNextMessage(){
        MathOperation[] mathOperations = MathOperation.values();
        int firstNumber = random.nextInt(100);
        int secondNumber = random.nextInt(100);
        Pair<Integer,Integer> pair = new Pair<>(firstNumber,secondNumber);
        MathOperation mathOperation = mathOperations[random.nextInt(mathOperations.length)];
        answer = mathOperation.function.apply(pair)+"";
        TextMessage textMessage = new TextMessage();
        textMessage.setText("What are result of next sentence ? ->".concat(firstNumber+"").concat(mathOperation.symbol+"")
                .concat(secondNumber+"").concat(" ?"));
        return textMessage;
    }

    public String getAnswer() {
        return answer;
    }

    public void startTheGame(){


    }

    public abstract boolean isValid();
}
