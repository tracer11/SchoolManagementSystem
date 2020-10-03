package teacher;
import school.School;

//This class will be creating Teacher Objects //
// Id, name, salary //

public class Teacher {
  private int id;
  private String name;
  private int salary;
  private int salaryEarned;

  public Teacher(int id, String name, int salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.salaryEarned = 0;
  }

  
  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public void getPayed(int salary) {
    salaryEarned += salary;
    School.addTotalMoneySpent(salary);
  }

  public int getSalaryEarned() {
    return this.salaryEarned;
  }
}
