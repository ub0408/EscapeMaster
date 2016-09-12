package branch.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import branch.BranchDAO;
import branch.BranchDTO;
import room.RoomDAO;


@Controller
public class BranchController {
	private BranchDAO branchDAO;
	private RoomDAO roomDAO;
	public void setBranchDAO(BranchDAO branchDAO) {
		this.branchDAO = branchDAO;
	} 
	public void setRoomDAO(RoomDAO roomDAO){
		this.roomDAO = roomDAO;
	}
	
	@RequestMapping(value="/branchManage.mainPage")
	public ModelAndView branchManage(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		List list = branchDAO.list();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("WEB-INF/mainPage/branchManage/branchManage_main.jsp");
		mav.addObject("list", list);
		return mav;
	}
	
	@RequestMapping(value="/branchMain.branchPage")
	public ModelAndView branchMain(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		Integer branch_id = Integer.parseInt(arg0.getParameter("branch_id"));
		BranchDTO dto = branchDAO.getBranch(branch_id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("WEB-INF/branchPage/branchPage_main.jsp");
		mav.addObject("dto", dto);
		return mav;
	}
	
	@RequestMapping(value="/roomManage.branchPage")
	public ModelAndView roomManage(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		Integer branch_id = Integer.parseInt(arg0.getParameter("branch_id"));
		List list = roomDAO.list(branch_id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("WEB-INF/branchPage/roomManage/roomManage_main.jsp");
		mav.addObject("list", list);
		return mav;
	}
}
