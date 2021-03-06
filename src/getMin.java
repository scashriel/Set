//a class that returns min element in a set

public class getMin{

    public static <T extends Comparable<T>> T getMin(SetClass<T> s){
        T min = s.getSetElement(0); //set min to first element in set
        for (T e : s){
            if(e.compareTo(min) < 0){
                min = e;
            }
        }
        return min;
    }
}
