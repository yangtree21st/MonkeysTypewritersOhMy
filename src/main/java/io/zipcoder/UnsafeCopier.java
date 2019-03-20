package io.zipcoder;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        try {
            while (stringIterator.hasNext()) {
//                String next = stringIterator.next();
//
//                copied += next + " ";
                super.run();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}