package com.blog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class CommentController {

	@RequestMapping(value = "/comment", method = RequestMethod.GET)
	public String index() {
		return "comment/index";
	}
}
