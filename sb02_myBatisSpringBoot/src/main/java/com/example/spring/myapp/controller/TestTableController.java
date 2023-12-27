package com.example.spring.myapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.sping.domain.TableVO;
import com.example.spring.myapp.service.TestTableService;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
/*
@RestController
public class TestTableController {
	
	@Resource
	private TestTableService testtableService;
	
	@RequestMapping(value="list")
	public ModelAndView AllListView() throws Exception{
		ModelAndView mav = new ModelAndView();
		
		List<TableVO> AllList = testtableService.selectAllList();
		System.out.println(AllList);
		
		
		mav.addObject("Alllist", AllList);
		mav.setViewName("list");
		return mav;
	}
	
	
	@RequestMapping(value="insert")
	public void insert(TableVO tableVO) throws Exception{
		tableVO = new TableVO(1111,"1234");
		
		testtableService.insert(tableVO);
	
	}
	
	@RequestMapping(value="delete")
	public void deleteByUserCode() throws Exception{
		testtableService.deleteByUserCode(1111);
	
	}
	
}
*/

//*
@RestController
public class TestTableController {

	@Resource
	private TestTableService testtableService;

	@GetMapping(value = "/sign-up")
	public ModelAndView signupForm() {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("signup");

		return mav;
	}

	@PostMapping(value = "/sign-up")
	public ModelAndView signUp(TableVO testTable) throws Exception {

		ModelAndView mav = new ModelAndView();

		testtableService.insert(testTable);

		mav.addObject("testTable", testTable);
//	        mav.setViewName("list");
		mav.setViewName("insert");

		return mav;
	}

	@GetMapping(value = "/insert")
	public TableVO selectByUserCode() throws Exception {

		ModelAndView mav = new ModelAndView();

		TableVO testTable = testtableService.selectByUserCode(1234);
		System.out.println(testTable);

		return testTable;
	}

	@RequestMapping(value = "list")
	public ModelAndView AllListView() throws Exception {
		ModelAndView mav = new ModelAndView();

		List<TableVO> AllList = testtableService.selectAllList();
		System.out.println(AllList);

		mav.addObject("Alllist", AllList);
		mav.setViewName("list");
		return mav;
	}

	@RequestMapping(value = "insert")
	public void insert(TableVO tableVO) throws Exception {
		tableVO = new TableVO(1111, "1234");

		testtableService.insert(tableVO);
	}

	@RequestMapping(value = "deleteform") // delete 완료
//	@GetMapping(value = "/deleteform")
	public ModelAndView deleteByUserCode(HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		String userCode = request.getParameter("userCode");
		int result = testtableService.deleteByUserCode(Integer.parseInt(userCode));
		System.out.println(result + "삭제 되었습니다.");

		mav.setViewName("list");
		return mav;
	}

	@GetMapping(value = "/deleteform") // UI 나오게 하는 작업
	public ModelAndView deleteForm() {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("deleteForm");

		return mav;
	}

	@PostMapping(value = "/deleteform")
	public ModelAndView delete(int userCode) throws Exception {

		ModelAndView mav = new ModelAndView();

		testtableService.delete(userCode);

		mav.addObject("userCode", userCode);
		mav.setViewName("deleteForm");

		return mav;
	}
	
	@GetMapping(value = "/updateform") // UI 나오게 하는 작업
	public ModelAndView updateForm() {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("updateForm");

		return mav;
	}
	
	@PostMapping(value = "/updateform")
	public ModelAndView update(TableVO testTable) throws Exception {

		ModelAndView mav = new ModelAndView();

		testtableService.update(testTable);
		
		mav.addObject("testTable", testTable);
		
		mav.setViewName("redirect:list");
		
		return mav;

	}
}
//*/