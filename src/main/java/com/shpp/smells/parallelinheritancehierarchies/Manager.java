package com.shpp.smells.parallelinheritancehierarchies;

public class Manager {

    public static void main(String[] args) {

        Engineer comp = new ComputerEngineer();
        comp.setSalary(50000);
        comp.setMileStone(new ComputerMileStone());

        Engineer civil = new CivilEngineer();
        civil.setSalary(60000);

        civil.setMileStone(new CivilMileStone());

        System.out.println(comp);
        System.out.println("********************");
        System.out.println(civil);

    }
}
