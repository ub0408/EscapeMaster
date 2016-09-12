package qna.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import qna.QnaDAO;

@Controller
public class QnaController {
	private QnaDAO qnaDAO;
	public void setQnaDAO(QnaDAO qnaDAO) {
		this.qnaDAO = qnaDAO;
	}

	@RequestMapping(value="/qna.mainPage")
	public ModelAndView branchManage(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		List list = qnaDAO.list();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("WEB-INF/mainPage/qna/qna.jsp");
		mav.addObject("list", list);
		return mav;
	}
}
