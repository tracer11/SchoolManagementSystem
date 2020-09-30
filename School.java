package SchoolManagementSystem

import java.utils.List;

public class School {

  private List<Teacher> teachers;
  private List<Student> students;
  private int totalMoneyEarned;
  private int totalMoneySpent;

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

  public void addTotalMoneyEarned(int MoneyEarned) {
    this.totalMoneyEarned += MoneyEarned;
  }

  public int getTotalMoneySpent() {
    return this.totalMoneySpent;
  }

  public void addTotalMoneySpent(int MoneySpent) {
    this.totalMoneySpent += MoneySpent;
  }
}