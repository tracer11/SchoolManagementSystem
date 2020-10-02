package student;
import school.School;


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
  // fetches id of student object//
  public int getId() {
    return this.id;
  }
  // returns name of student object//
  public String getName() {
    return this.name;
  }
  // returns grade of student object //
  public int getGrade() {
    return this.grade;
  }
  // returns total fees for student//
  public int getFeesTotal() {
    return this.feesTotal;
  }
  // returns amount of fees already paid by student //
  public int getFeesPaid() {
    return this.feesPaid;
  }
  // method for paying off fees //
  public void payFees(int payment) {
    feesPaid += payment;
    School.addTotalMoneyEarned(payment);
  }
  // returns fees left unpaid // 
  public int getFeesUnpaid() {
    return this.feesTotal - this.feesPaid;
  }
}