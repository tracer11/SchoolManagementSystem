// This class will be creating the Student Objects//
// Name, Grade, Fees Total, Fees Paid

public class Student {
  private int id;
  private String name;
  private int grade;
  private int feesPaid;
  private int feesTotal;

  // constructor // 
  public Student(int id, String name, int grade) {
    this.id=id;
    this.name=name;
    this.grade=grade;
    this.feesTotal = 50000;
    this.feesPaid = 0;

  }
  // method used for setting/changing grade 
  public void setGrade(int grade){
    this.grade = grade;
  }

}