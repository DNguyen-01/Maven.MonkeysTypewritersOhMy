package io.zipcoder;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }



    public void run() {
        //implement a method for the monkey to grab next word and append to a copy

        while(stringIterator.hasNext()){
            this.copied += stringIterator.next();
            this.copied += " ";
        }



    }
}
