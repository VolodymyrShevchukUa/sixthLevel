package com.shpp.smells.parallelinheritancehierarchies;

public class CivilMileStone implements MileStone{

    @Override
    public String work() {
        return "Create Eiffel Tower";
    }

    @Override
    public String target() {
        return "Has to be completed in 2 years";
    }

    @Override
    public String toString() {
        return "CivilMileStone [work()=" + work() + ", target()=" + target()
                + "]";
    }
}
