package student;


// This class will be creating the Student Objects//
// Name, Grade, Fees Total, Fees Paid //

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
  // method used for setting/changing grade //
  public void setGrade(int grade){
    this.grade = grade;
  }
  // method for updating fees paid value
  public void updateFeesPaid(int fees) {
    feesPaid += fees;
  }

  public void updateFeesTotal(int feesPaid) {
    feesTotal -= feesPaid;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public int getGrade() {
    return this.grade;
  }

  public int getFeesTotal() {
    return this.feesTotal;
  }

  public int getFeesPaid() {
    return this.feesPaid;
  }
}