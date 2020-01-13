//a class that returns min element in a set

public class getMin{//<T extends Comparable<T>> implements Comparable<T> {
//
//    @Override
//    public int compareTo(T o) {
//       return this.compareTo(o);
//    }

    public static <T extends Comparable<T>> T getMin(SetClass<T> s){
        T min = s.getSetElement(1);
        for (T e : s){
            if(e.compareTo(min) == -1){
                min = e;
            }
        }
        return min;
    }
}
