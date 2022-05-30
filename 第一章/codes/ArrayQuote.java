public class ArrayQuote{
    public static void main(String[] args){
        Person[] persons = new Person[2];
        persons[0] = new Person();
        persons[1] = new Person("jack",18);
        for(Person person : persons){
            System.out.println(person.getName() + "\t" + person.getAge());
        }
    }
}