public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(8);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("age = " + person.getAge());
        System.out.println("teen = " + person.isTeen());
    }



}
