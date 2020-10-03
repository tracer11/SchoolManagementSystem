package teacher;

//This class will be creating Teacher Objects //
// Id, name, salary //

public class Teacher {
  private int id;
  private String name;
  private static int salary;

  public Teacher(int id, String name, int salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  
  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public static int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}
