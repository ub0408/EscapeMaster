package branch;

import java.util.List;

public interface BranchDAO {
	public List<BranchDTO> list();
	public BranchDTO getBranch(Integer branch_id);
	public void addBranch(BranchDTO dto);
}
