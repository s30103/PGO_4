import java.util.ArrayList;

public class StudentGroup {

    public ArrayList<Student> students;

    public StudentGroup(){

        students = new ArrayList<>();
    }
    public void addStudentToGroup(Student student){


        if (students.size() > 15){
            throw new IllegalStateException("Grupa pelna");
        }


        if (students.contains(student)) {
            throw new IllegalStateException("Student juz jest w tej grupie");
        }
        students.add(student);
    }
}
