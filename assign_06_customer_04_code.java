//mohamed hamed 
//20176672
package BankSystem;
    public class customer extends human {
        private String SSN;
        private String Address;
        private BankAccount account;

        public customer(String name, int age, String gender, String SSN, String address) {
            super(name, age, gender);
            this.SSN = SSN;
            Address = address;
            account = new BankAccount();
        }

        public void PrintData() {
            super.PrintData();
            System.out.println("SSN: " + SSN);
            System.out.println("Address: " + Address);
        }
    }
