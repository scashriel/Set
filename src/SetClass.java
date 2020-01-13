//A Generic class to define a set of some Type

import java.util.ArrayList;
import java.util.Iterator;

public class SetClass<T> implements Iterable<T>{

    private ArrayList<T> set;

    //default constructor
    public SetClass(){
        set = new ArrayList<>();
    }

    //constructor
    public SetClass(T[] e){
        set = new ArrayList<>();
        for (T item : e){
            this.insert(item);
        }
    }

    //create a union of one set with this set
    public void union(SetClass s){
        //add elements that are in other set into this set
        Iterator<T> it = s.iterator();
        while(it.hasNext()){
            T e = it.next();
            if(!isMember(e)){
                this.insert(e);
            }
        }
    }

    //create intersect of one set with this set
    public void intersect(SetClass<T> s){
        Iterator<T> it = this.iterator();
        while (it.hasNext()){
            T e = it.next();
            if(!s.isMember(e)){
                it.remove();
            }
        }
    }

    //check if the set is a subset of this set
    public boolean isSubset(SetClass<T> s){
        boolean sub = true;
        if(s.getSetSize() > this.getSetSize()){
            sub = false;
        }
        else{
            Iterator<T> it = s.iterator();
            while(it.hasNext()){
                T e = it.next();
                if(!isMember(e)){
                    sub = false;
                    break;
                }
            }
        }
        return sub;
    }

    //check if element is found in this set
    public boolean isMember(T element){
        return set.contains(element);
    }

    //add an element to the set
    public void insert(T element){
        if (!isMember(element)){
            set.add(element);
        }
    }

    //delete an element from the set
    public void delete(T element){
        if(isMember(element)) {
            set.remove(element);
        }
    }

    //iterator
    @Override
    public Iterator<T> iterator() {
        return set.iterator();
    }


    //toString
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("The elements are: ");
        for(T e : set){
            res.append(e+" ");
        }

        return res.toString();
    }

    public ArrayList<T> getSet() {
        return set;
    }

    public T getSetElement(int index) {
        return set.get(index);
    }

    public int getSetSize(){
        return set.size();
    }


}
