import java.util.ArrayList;

public class BranchPrinter {

    public void print(Branch branch, boolean showTransactions) {
        System.out.println("Customers details for branch " + branch.getName());
        ArrayList<Customer> branchCustomers = branch.getCustomers();
        for ( int i = 0; i < branchCustomers.size(); i++) {
            Customer branchCustomer = branchCustomers.get(i);
            System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
            if (showTransactions) {
                System.out.println("Transactions");
                ArrayList<Double> transactions = branchCustomer.getTransactions();
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                }
            }
        }
    }
}
