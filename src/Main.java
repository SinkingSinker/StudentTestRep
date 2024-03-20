public class Main {
    public static void main(String[] args) {
        Student newStudent1 = new Student("Jakob","Jakobsen", 20, 1.19, true);
        Student newStudent2 = new Student("Paula", "Gutierrez", 25, 1.49, false);
        Student newStudent3 = new Student("Mikkel", "Jacobsen", 22, 1.84, true);
        Student[] StudentList = new Student[3];
        StudentList[0] = newStudent1;
        StudentList[1] = newStudent2;
        StudentList[2] = newStudent3;

        outputStudent(StudentList);


    }
    public static void outputStudent(Student[] StudentList) {
        for (Student studentForEach : StudentList) {
            System.out.println(studentForEach);
            System.out.println();
        }
    }
}
