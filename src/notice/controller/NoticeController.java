package notice.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import notice.NoticeDAO;

@Controller
public class NoticeController {
	NoticeDAO noticeDAO;
	public void setNoticeDAO(NoticeDAO noticeDAO) {
		this.noticeDAO = noticeDAO;
	}
	
	@RequestMapping(value="/notice.mainPage")
	public ModelAndView branchManage(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		String kind = arg0.getParameter("kind");
		List list = noticeDAO.list(kind);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("WEB-INF/mainPage/notice/notice.jsp");
		mav.addObject("list", list);
		return mav;
	}
}
