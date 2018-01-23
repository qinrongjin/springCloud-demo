package cn.tiny77.gateway.ctr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tiny77.gateway.itf.HiService;

@RestController
public class HiController {

	@Autowired
	private HiService hiService;
	
	@Value("${spring.application.name}")
	private String appName;
	
	@RequestMapping("hi")
	public String hi(String name, Model model) {
		return hiService.sayHi(name) + "<br/>【" + appName + "】";
	}
	
}
