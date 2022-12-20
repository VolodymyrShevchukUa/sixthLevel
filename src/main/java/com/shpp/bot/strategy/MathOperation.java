package com.shpp.bot.strategy;

import org.glassfish.grizzly.utils.Pair;

import java.util.function.Function;

public enum MathOperation {


    ADD('+',x -> x.getFirst() + x.getSecond() ),
    MINUS('-', x -> x.getFirst() - x.getSecond()),
    MULTIPLY('*', x -> x.getFirst() * x.getSecond());


    final Function<Pair<Integer,Integer>, Integer> function;
    final char symbol;



    MathOperation(char symbol, Function<Pair<Integer,Integer>,Integer> function) {
        this.symbol = symbol;
        this.function = function;
    }

}
