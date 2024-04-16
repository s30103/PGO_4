import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        StudentGroup group1 = new StudentGroup();
        StudentGroup group2 = new StudentGroup();

        student1.fname = "Jan";
        student1.lname = "pierwszy";
        student1.indexNumber = 111111;
        student1.email = "s111111@pjwstk.edu.pl";
        student1.address = "xyz";
        student1.grades = new ArrayList<>();
        student1.grades.add(3.0);
        student1.grades.add(5.0);
        student1.grades.add(3.5);
        student1.grades.add(4.0);
        double average1 = student1.calculateAverage();
        student1.checkGrades();
        group1.addStudentToGroup(student1);





        student2.fname = "Piotr";
        student2.lname = "drugi";
        student2.indexNumber = 222222;
        student2.email = "s222222@pjwstk.edu.pl";
        student2.address = "abc";
        student2.grades = new ArrayList<>();
        student2.grades.add(3.0);
        student2.grades.add(3.0);
        student2.grades.add(3.5);
        student2.grades.add(3.0);
        double average2 = student2.calculateAverage();
        student2.checkGrades();
        group1.addStudentToGroup(student2);



        student3.fname = "Michal";
        student3.lname = "trzeci";
        student3.indexNumber = 333333;
        student3.email = "s333333@pjwstk.edu.pl";
        student3.address = "qwe";
        student3.grades = new ArrayList<>();
        student3.grades.add(3.0);
        student3.grades.add(5.0);
        student3.grades.add(3.0);
        student3.grades.add(5.0);
        double average3 = student3.calculateAverage();
        student3.checkGrades();
        group2.addStudentToGroup(student3);



        student4.fname = "Antoni";
        student4.lname = "czwarty";
        student4.indexNumber = 444444;
        student4.email = "s444444@pjwstk.edu.pl";
        student4.address = "asd";
        student4.grades = new ArrayList<>();
        student4.grades.add(5.0);
        student4.grades.add(5.0);
        student4.grades.add(5.0);
        student4.grades.add(5.0);
        double average4 = student4.calculateAverage();
        student4.checkGrades();
        group1.addStudentToGroup(student4);

        
    }

}
