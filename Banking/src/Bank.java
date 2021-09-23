import java.util.ArrayList;

public class Bank {

    private String name;
    private BranchFinder branchFinder;
    private BranchPrinter branchPrinter;
    private ArrayList<Branch> branches;

    public Bank(String name, BranchFinder branchFinder, BranchPrinter branchPrinter) {
        this.name = name;
        this.branchFinder = branchFinder;
        this.branchPrinter = branchPrinter;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (branchFinder.findBranch(branches, branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = branchFinder.findBranch(branches, branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = branchFinder.findBranch(branches, branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public boolean listCustomer(String branchName, boolean showTransactions) {
        Branch branch = branchFinder.findBranch(branches, branchName);
        if (branch != null) {
            branchPrinter.print(branch, showTransactions);
            return true;
        } else {
            return false;
        }
    }
}
