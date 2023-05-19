package com.spring.hjhBook;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// å ��Ʈ�ѷ�
@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	/**
	 * å ���� Mapping
	 * @param ����, ī�װ�, ����
	 * 
	 * @return
	 * 	ModelAndView("book/create");
	 */
	@RequestMapping(value="create", method = RequestMethod.GET)
	public ModelAndView create() {
		return new ModelAndView("book/create");
	}
	
	@RequestMapping(value="create", method = RequestMethod.POST)
	public ModelAndView createPost(@RequestParam Map<String, Object> map) {
		
//		System.out.println(map);
		
		ModelAndView mav = new ModelAndView();
		
		String bookId = this.bookService.create(map);
		
		System.out.println(bookId);
		
		if(bookId == null) {
			mav.setViewName("redirect:/create");
		}else {
			mav.setViewName("redirect:/detail?bookId=" + bookId); 
		}
		
		return mav;
	}

}
