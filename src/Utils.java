//helper functions to instantiate test classes

import java.security.SecureRandom;

public class Utils {
    private static final SecureRandom randomNumbers = new SecureRandom();

    public Utils(){

    }

    public Integer[] arrayOfIntegers(int size){
        Integer[] arr = new Integer[size];
        SecureRandom randomNumbers = new SecureRandom();
        for(int i = 0; i < size; i++){
            Integer item = randomNumbers.nextInt(100);
            arr[i] = item;
        }
        return arr;
    }

    public void instantiate(SetClass<Integer> s, int size){
        SecureRandom randomNumbers = new SecureRandom();
        while(s.getSetSize() < 10){
            Integer integer = randomNumbers.nextInt(100);
            s.insert(integer);
        }
    }


}
