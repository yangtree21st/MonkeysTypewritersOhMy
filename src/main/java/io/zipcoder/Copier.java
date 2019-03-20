package io.zipcoder;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

/**
 * We're using this as an abstract base class since both the safe and unsafe copiers will implement it.
 */
public abstract class Copier implements Runnable {

    Random random = new Random();
    // We use an iterator so each monkey / thread can copy an individual word.
    public Iterator<String> stringIterator;
    public String copied;

    public Copier(String toCopy) {
        // Take the input string, split it on spaces, turn that array to an arraylist, and then grab its iterator.
        this.stringIterator = Arrays.asList(toCopy.split(" ")).iterator();
        this.copied = "";
    }

    public void run(){

       try{
           while(stringIterator.hasNext()){
               String temp = stringIterator.next();
               Thread.sleep(random.nextInt(10));
               copied += temp + " ";
           }
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
    }
}
