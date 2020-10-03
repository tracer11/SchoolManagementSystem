package school;

import java.util.List;
import teacher.Teacher;
import student.Student;

public class School {

  private List<Teacher> teachers;
  private List<Student> students;
  private static int totalMoneyEarned;
  private static int totalMoneySpent;

  public School(List<Teacher> teachers, List<Student> students) {
    this.teachers = teachers;
    this.students = students;
    totalMoneyEarned = 0;
    totalMoneySpent = 0;
  }

  public List<Teacher> getTeachers() {
    return this.teachers;
  }

  public void addTeacher(Teacher teacher) {
    this.teachers.add(teacher);
  }

  public List<Student> getStudents() {
    return this.students;
  }

  public void addStudent(Student student) {
    this.students.add(student);
  }

  public int getTotalMoneyEarned() {
    return this.totalMoneyEarned;
  }

  public static void addTotalMoneyEarned(int moneyEarned) {
    totalMoneyEarned += moneyEarned;
  }

  public int getTotalMoneySpent() {
    return this.totalMoneySpent;
  }

  public static void addTotalMoneySpent(int moneySpent) {
    totalMoneySpent += moneySpent;
  }
}