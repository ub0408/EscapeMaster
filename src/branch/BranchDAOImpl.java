package branch;

import java.util.List;

public class BranchDAOImpl implements BranchDAO{
	@Override
	public List<BranchDTO> list() {
		List list = Branch.listBranch();
		return list;
	}

	@Override
	public BranchDTO getBranch(Integer branch_id) {
		BranchDTO dto = Branch.getBranch(branch_id);
		return dto;
	}

	@Override
	public void addBranch(BranchDTO dto) {
		// TODO Auto-generated method stub
		
	}

}
