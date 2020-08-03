package com.kyp.memories.makerInfomation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class makerInformation {
	@RequestMapping("/makerInformation/main")
	public String makerInformationMain() {
		return "/about/makerInformation";
	}
}
