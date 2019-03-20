package io.zipcoder;

public class SynchLockCopier extends Copier{

    public SynchLockCopier(String toCopy) {

        super(toCopy);
    }

//    synchronized public void run() {
//        while (stringIterator.hasNext()) {
//            String next = stringIterator.next();
//            copied += next + " ";
//        }
//    }
    public void run() {
        synchronized (SynchLockCopier.class) {
            while (stringIterator.hasNext()) {
                String next = stringIterator.next();
                copied += next + " ";
            }
        }

    }

}
