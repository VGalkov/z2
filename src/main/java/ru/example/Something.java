package ru.example;

public class Something {

    private final int intVar1;
    private final int intVar2;

    public Something(int intVar1, int intVar2) {
        this.intVar1 = intVar1;
        this.intVar2 = intVar2;
    }



    public int result1() {
        return  intVar1 + intVar2;
    }

    public int result2() {
        return intVar1 * intVar2;
    }
}
