import java.util.List;

public class BranchFinder {

    public Branch findBranch(List<Branch> branches, String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch checkedBranch = branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }
}
