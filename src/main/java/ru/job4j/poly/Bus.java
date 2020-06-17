package ru.job4j.poly;

public class Bus implements Transport {

    int psng = 0;
    boolean isDrive = false;

    @Override
    public void drive() {
        isDrive = true;
    }

    @Override
    public void passengers(int count) {
        this.psng = count;
    }

    @Override
    public double fillUp(int litre) {
        return litre * 41.16;
    }
}
