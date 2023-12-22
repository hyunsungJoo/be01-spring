package kr.encore.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.encore.model.DeptDAO;
import kr.encore.model.DeptDTO;

@Controller
public class WriteController { 
	
	@Autowired
	private DeptDAO deptDAO;   // DB ���� ���� 

	@RequestMapping("/write.do")
	public String write(Model model, HttpServletRequest request) {
		
//		request.setCharacterEncoding("utf-8");
		
		int no = Integer.parseInt(request.getParameter("deptno"));
		String name = request.getParameter("deptname");
		String loc = request.getParameter("deptloc");
		System.out.println(no + "/ " + name + "/ " + loc);
		
		DeptDTO dto = new DeptDTO();
		dto.setDeptno(no);
		dto.setDname(name);
		dto.setLoc(loc);
		
		deptDAO.insertDept(dto);
		
		return "redirect:list.do";
	}

}

//public class WriteController  implements Controller {  // controller
//	
//	@Autowired
//	private DeptDAO deptDAO;   // DB ���� ���� 
//
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, 
//			HttpServletResponse response) throws Exception {
//		
//		int no = Integer.parseInt(request.getParameter("deptno"));
//		String name = request.getParameter("deptname");
//		String loc = request.getParameter("deptloc");
//		System.out.println(no + "/ " + name + "/ " + loc);
//		
//		ModelAndView mav = new ModelAndView();  // ����, �������� ����
//		mav.addObject("no", no);   // ������ ����
//		mav.addObject("name", name);
//		mav.addObject("loc", loc);
//		
//		mav.setViewName("list");  // �̵��� �������� ����
//		
//		
//		return mav;
//	}
//
//}