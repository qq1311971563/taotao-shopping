package com.taotao.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToPageController {
	@RequestMapping("/index.html")
	public String toIndex() {
		return "index";
	}
}
