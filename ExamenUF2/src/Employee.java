public class Employee {

   private String myName;
   private double mySalary;

   public Employee(String name, double salary) {
      myName = name;
      mySalary = salary;
   }
   
   //Et retorna el nom
   public String getName() {
      return myName;
   }
   
   //et reorna el salari
   public double getSalary() {
      return mySalary;
   }

   public void raiseSalary(int percent) {
      mySalary = mySalary +
         percent * 0.01 * mySalary;
   }

   public void setSalary(double salary) {
      mySalary = salary;
   }

   public String toString() {
      return "Name: " + getName() +
             ", Salary: " + getSalary();
   }
}
