package com.shpp.smells.parallelinheritancehierarchies;

public class MyOwnException extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
