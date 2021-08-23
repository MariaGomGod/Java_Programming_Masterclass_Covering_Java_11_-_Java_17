public class Person {


    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {

        if (age < 0 || age > 100) {
            return 0;
        } else {
            return age;
        }
    }

    public boolean isTeen() {

        return age > 12 && age < 20;

    }

    public String getFullName() {

        boolean emptyFirstName = firstName.isEmpty();
        boolean emptyLastName = lastName.isEmpty();

        if (emptyFirstName && emptyLastName) {
            return "";
        } else if (emptyFirstName && !emptyLastName) {
            return lastName;
        } else if (!emptyFirstName && emptyLastName) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
