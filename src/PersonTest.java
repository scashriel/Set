//test class for person


public class PersonTest {
    public static void main(String[] args) {
        //instantiate 5 Person objects
        Person p1 = new Person("123", "Diana", "Prince", 1941);
        Person p2 = new Person("234", "Carol", "Danvers", 1968);
        Person p3 = new Person("345", "Bruce", "Wayne", 1939);
        Person p4 = new Person("456", "Clark", "Kent", 1938);
        Person p5 = new Person("567", "Artist", "Prince", 1958);

        //create an array of Person
        Person[] pArr = {p1, p2, p3, p4, p5};
        Person[] dArr = {p1,p5};

        //create a set of Persons
        SetClass<Person> people = new SetClass<>(pArr);
        SetClass<Person> duo = new SetClass<>(dArr);

        //display them
        System.out.println(people.toString());

        //get "minimum" person

        System.out.println("The smallest element in people is " + getMin.getMin(people).getFirstName() + " " +getMin.getMin(people).getLastName());
        System.out.println("The smallest element in duo is " + getMin.getMin(duo).getFirstName() + " " +getMin.getMin(duo).getLastName());
    }
}
