package com.shpp.smells.parallelinheritancehierarchies;

public class CivilEngineer implements Engineer {
    private int salary;
    private MileStone mileStone;


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setMileStone(MileStone mileStone) {
        this.mileStone = mileStone;
    }


    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public MileStone getMileStone() {
        return mileStone;
    }

    @Override
    public String toString() {
        return "CivilEngineer " +  ", salary=" + salary
                + ", mileStone=" + mileStone ;
    }
}

