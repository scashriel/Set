//Test class that instantiates 3 sets of Integer type and tests the functions of SetClass
import javax.swing.*;

public class SetClassTest {
    public static void main(String[] args){
        Utils u = new Utils();
        Integer[] arr1 = u.arrayOfIntegers(10);
        Integer[] arr2 = u.arrayOfIntegers(10);

        SetClass<Integer> s1 = new SetClass<>(arr1);
        SetClass<Integer> s2 = new SetClass<>(arr2);
        SetClass<Integer> s3 = new SetClass<>();
        u.instantiate(s3, 10);

        System.out.println("s1: " + s1.toString());
        System.out.println("s2: " + s2.toString());
        System.out.println("s3: " + s3.toString());

        s1.union(s2);
        System.out.println("s1 after union: " + s1.toString());

        s1.intersect(s3);
        System.out.println("s1 after intersect: " + s1.toString());

        SetClass<Integer> userSet = new SetClass<>();
        Integer integer = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number for your set"));
        userSet.insert(integer);
        integer = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number for your set"));
        userSet.insert(integer);

        System.out.println("userSet is a subset of s1: " + s1.isSubset(userSet));
        System.out.println("userSet is a subset of s2: " + s2.isSubset(userSet));
        System.out.println("userSet is a subset of s2: " + s2.isSubset(userSet));

        integer = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

        System.out.println("Your number is a member of s1: " + s1.isMember(integer));
        s2.insert(integer);
        System.out.println("s2: " + s2.toString());
        s3.delete(integer);
        System.out.println("s3: " + s3.toString());

    }



}
