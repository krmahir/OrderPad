package Practical_2.arrayGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleRandomListingGenerator extends RandomListingGenerator {

    public SimpleRandomListingGenerator(int size) {
        super(size);
    }

    protected void randomise() {
        // implement simple randomise
        int[] copy = new int[getArray().length];
        boolean[] checker = new boolean[getArray().length];
        int i = 0, random = getRandomIndex() ;
        Arrays.fill(checker, false);
        while(i<copy.length){
            while(checker[random]==true){
                random = getRandomIndex();
            }
            checker[random]= true;
            copy[i] = getArray()[random];
            i++;
            }
        
        for (int index = 0; index < getArray().length; index++) {
            getArray()[index] = copy[index];
        }
    }
}
