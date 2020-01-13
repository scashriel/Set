public class Person implements Comparable<Person>{
    private String id;
    private String firstName;
    private String lastName;
    private int birthYear;

    //constructor
    public Person(String id, String firstName, String lastName, int birthYear){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    @Override
    public int compareTo(Person o) {
        if(this.lastName.equals(o.lastName)){
            return (this.firstName.compareTo(this.firstName));
        }
        else
            return this.lastName.compareTo(o.lastName);
    }

    public String getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    @Override
    public String toString(){
        return String.format("%s %s was born in %d and their id number is %s",this.firstName,this.lastName, this.birthYear, this.id);
    }
}
