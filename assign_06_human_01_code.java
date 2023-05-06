//mohamed hamed 
//20176672
package BankSystem;

public class human {
        private String Name;
        private int Age;
        private String Gender;

        public human(String name, int age, String gender) {
            Name = name;
            Age = age;
            Gender = gender;
        }

        protected void PrintData() {
            System.out.println("Name: " + Name);
            System.out.println("Age: " + Age);
            System.out.println("Gender: " + Gender);
        }

        final void Greet() {
            System.out.println("Good Morning");
        }
    }
