//A Generic class to define a set of some Type

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Iterator;

public class SetClass<T> {

    private ArrayList<T> elements;
    private Iterator<T> Iterator;

    //default constructor
    public SetClass(){
        elements = new ArrayList<T>();
    }

    //constructor
    public SetClass(ArrayList<T> a){
        //construct set from elements in list
        //implement equals to prevent duplicate of elements
        //use hashSet?
    }

    //create a union of one set with this set
    public void union(SetClass set){
        //add elements that are in other set into this set
    }

    //create intersect of one set with this set
    public void intersect(SetClass<T> set){
        //remove elements from this set that are not in other set
    }

    //check if the set is a subset of this set
    public boolean isSubset(SetClass<T> set){
        //if set size > this set - false
        //check that every item in set is found in this set
        return true;
    }

    //check if element is found in this set
    public boolean isMember(T element){
        //contains element
        return false;
    }

    //add an element to the set
    public void insert(T element){
        //check isMember - if true, do nothing, else add
    }

    //delete an element from the set
    public void delete(T element){
        //check isMember - if true, do nothing, else delete
        //use remove method
    }

    //returns an iterator
    public ￿Iterator<T> iterator(){
        return Iterator;
    }

    //toString
    public String toString(){
        return "";
    }

}
