//mohamed hamed 
//20176672
package BankSystem;
    public final class BankAccount {
        private double balance;

        public double getBalance() {
            return balance + (balance * 0.1);
        }

        public void setBalance(double balance) {
            if (balance >= 0 && balance <= 1_000_000) {
                this.balance += balance;
            }
        }

        public void setBalance(double balance, double tax_percent) {
            double taxAmount = balance * (tax_percent / 100);
            this.balance += balance - taxAmount;
        }
    }
