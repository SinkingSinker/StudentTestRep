/* Make a new project with a  class called Student that contain the fields in the right type:
firstName
lastName
age
height (in meters)
gender (boolean)
*/


public class Student {
    String firstName;
    String lastName;
    int age;
    Double height;
    boolean gender;

    public Student(String firstName, String lastName, int age, Double height, boolean gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }
    public String toString() {
        return("Student name: " + firstName + " " + lastName + "\nAge: " + age + "\nHeight: " + height +"m " + "\nGender: " + genderCheck(gender));
    }
    public String genderCheck(Boolean gender) {
        if (gender == true) {
            return "Male";
        }
        else {
            return "Female";
        }
    }
}
