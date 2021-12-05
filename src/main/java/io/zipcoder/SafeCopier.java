package io.zipcoder;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier {
    //create a reentrantLock lock to the method
    ReentrantLock reentrantLock = new ReentrantLock();

    public SafeCopier(String toCopy) {
        super(toCopy);


    }


    public void run() {

        while(stringIterator.hasNext()){
            reentrantLock.lock();
//            System.out.println("threadId: " + Thread.currentThread().getId());
            this.copied += stringIterator.next();
            this.copied += " ";
            reentrantLock.unlock();
        }
    }
}
