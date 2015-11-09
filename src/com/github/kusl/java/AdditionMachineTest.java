package com.github.kusl.java;

public class AdditionMachineTest {
    @org.junit.Test
    public void testAddition() {
        AdditionMachine additionMachine = new AdditionMachine();
        String result = additionMachine.add("one", "two");
        org.junit.Assert.assertEquals("onetwo", result);
    }
}
