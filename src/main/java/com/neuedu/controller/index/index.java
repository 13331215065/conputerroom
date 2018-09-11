package com.neuedu.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {
@RequestMapping("index.do")
public String index() {
	return "index";
}
}