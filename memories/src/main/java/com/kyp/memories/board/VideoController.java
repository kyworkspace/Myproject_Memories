package com.kyp.memories.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideoController {

	@RequestMapping("/video/main")
	public String pictureMain() {
		
		return "board/videoMain";
	}
	
}
