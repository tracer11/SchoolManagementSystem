package SchoolManagementSystem

public class Main {
  public static void main(String[] args) {
    Teacher agata = new Teacher(id:1, name:"Agata", salary:60000);
    Teacher aneta = new Teacher(id:2, name:"Aneta", salary:55000);

    List<Teacher> teacherList = new ArrayList<>();
    teacherList.add(agata);
    teacherList.add(aneta);


    Student karol = new Student(id:1, name:"Karol", grade:12);
    Student jurek = new Student(id:2, name:"Jurek", grade:11);

    List<Student> studentList = ArrayList<>();
    studentList.add(karol);
    studentList.add(jurek);

    School cahs = new School(teacherList, studentList);
  }
}