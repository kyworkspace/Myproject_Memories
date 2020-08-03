package com.kyp.memories.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping("/board/main")
	public String main() {
		
		
		return "board/boardMain";
	}

}
