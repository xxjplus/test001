package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import po.Product;

@Controller
@RequestMapping("/sp")
public class IndexZJController {
	@RequestMapping("/index2")
	public ModelAndView indexReq(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mav = new ModelAndView("index2");
		mav.addObject("msg", "this springmvc 注解方式");
		
		return mav;
	}
	@RequestMapping("/hello2")
	public ModelAndView helloReq(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mav = new ModelAndView("hello2");
		String name=request.getParameter("name");
		System.out.println("name:"+name);
		mav.addObject("msg", name+"hello springmvc 注解方式");
		
		return mav;
	}
	
	@RequestMapping("/addPro")
	public ModelAndView addPro(Product pro){
		ModelAndView mav = new ModelAndView("showPro");
		String msg="true";
		
		System.out.println(pro.toString());
		
		mav.addObject("msg", msg);
		
		return mav;
	}

}
