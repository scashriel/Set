//a class that

public class Comparing<T> implements Comparable<T> {

    @Override
    public int compareTo(T o) {
        int min = 1;
        if(this.equals(o)){
            min = 0;
        }
        else if (this < o){
            min = -1;
        }
        return min;
    }

    public T getMin(SetClass<T> s){


    }
}
