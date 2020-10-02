import school.School;
import teacher.Teacher;
import student.Student;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Teacher agata = new Teacher(1,"Agata",60000);
    Teacher aneta = new Teacher(2,"Aneta",55000);

    List<Teacher> teacherList = new ArrayList<>();
    teacherList.add(agata);
    teacherList.add(aneta);


    Student karol = new Student(1,"Karol", 12);
    Student jurek = new Student(2,"Jurek", 11);

    List<Student> studentList = new ArrayList<>();
    studentList.add(karol);
    studentList.add(jurek);

    School cahs = new School(teacherList, studentList);
    
  }
}