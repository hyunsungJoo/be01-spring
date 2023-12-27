package com.encore.sb03myBatis.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.encore.sb03myBatis.domain.TableVO;
import com.encore.sb03myBatis.service.TestTableService;

import jakarta.annotation.Resource;





@RestController
public class TestTableController {
	
	@Resource  // 내용으로 찾아줌 @Autowired : 타입으로찾아줌
	private TestTableService testTableService;
	
	@GetMapping(value = "/sign-up")
	public ModelAndView signupForm() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("signup");
		
		return mav;
		
	}
	
	@PostMapping(value = "/sign-up")
	public ModelAndView signUp(TableVO vo) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		
		testTableService.insert(vo);
		
		mav.addObject("vo", vo);
		
		mav.setViewName("insert");
		
		return mav;
		
	}
	
	@RequestMapping(value="list")
	public ModelAndView AllListView() throws Exception{
//	public String AllListView(Model model) throws Exception{ // Model : data save,    주석끼리 짝꿍
		ModelAndView mav = new ModelAndView();
		
		List<TableVO> AllList = testTableService.selectAllList();
		System.out.println(AllList);
		
//		model.addAttribute("Alllist", AllList);
		mav.addObject("Alllist", AllList); // data save
		mav.setViewName("list"); // view page move
		return mav; // return "list"
	}
	
	
	@RequestMapping(value="insert")
	public void insert(TableVO tableVO) throws Exception{
		tableVO = new TableVO(1111,"1234");
		
		testTableService.insert(tableVO);
	
	}
	
	@RequestMapping(value="delete")
	public void deleteByUserCode() throws Exception{
		testTableService.deleteByUserCode(1111);
	
	}
}




