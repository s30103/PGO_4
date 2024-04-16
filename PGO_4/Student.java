import java.util.ArrayList;

public class Student {
    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String address;
    public ArrayList<Double> grades;
    public double calculateAverage() {
        double avg = 0;
        for (int i = 0; i < grades.size(); i++) {
            avg += grades.get(i);
        }
        avg /= grades.size();
        return avg;
    }

    public void checkGrades() {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Student nie ma zadnej oceny - blad");
        } else if (grades.size() >= 20) {
            throw new IllegalArgumentException("Student ma wiecej niz 20 ocen, niemozliwe - blad");
        }
    }
}
