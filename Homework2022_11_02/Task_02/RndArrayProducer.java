package Homework2022_11_02.Task_02;

import java.util.Random;

public class RndArrayProducer implements ArrayProducer {

    private final int MAX_SIZE = 100;

    @Override
    public int[] makeArray() {
        Random rnd = new Random(System.currentTimeMillis());
        int[] arr = new int[rnd.nextInt(MAX_SIZE)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(MAX_SIZE);
        }
        return arr;
    }
}
