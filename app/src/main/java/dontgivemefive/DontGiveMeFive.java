package dontgivemefive;

import java.util.ArrayList;

public class DontGiveMeFive {

    public int dontGiveMeFive(int start, int end){
    int[] getValuesBetween = new int[(end + 1) - start];
    ArrayList<Integer> storeValues = new ArrayList<>();
    for(int i = 0; i < getValuesBetween.length; i++){
        if(i % 5 != 0 ) {
            storeValues.add(getValuesBetween[i] + 1);
        }

    }
        return storeValues.size() + 1;

    }
}
