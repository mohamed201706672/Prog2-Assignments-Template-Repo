//mohamed hamed 
//20176672
import BankSystem.employee;
import BankSystem.customer;
import BankSystem.BankAccount;
public class Main {
        public static void main(String[] args) {
            employee emp = new employee("John Doe", 30, "Male", 5000, "IT");
            customer cust = new customer("Jane Smith", 25, "Female", "123456789", "123 Main St");

            emp.PrintData();
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Department: " + emp.getDepartment());

            System.out.println("--------------------------------");

            cust.PrintData();

            System.out.println("--------------------------------");

            BankAccount bankAccount = new BankAccount();
            bankAccount.setBalance(1000);
            System.out.println("Balance with 10% interest: " + bankAccount.getBalance());

            System.out.println("--------------------------------");

            bankAccount.setBalance(2000, 20);
            System.out.println("Balance after tax deduction: " + bankAccount.getBalance());
        }
    }
