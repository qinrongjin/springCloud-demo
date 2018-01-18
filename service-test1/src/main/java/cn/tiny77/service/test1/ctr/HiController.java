package cn.tiny77.service.test1.ctr;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hi")
public class HiController {

	@Value("${server.port}")
	private String port;
	
	@Value("${default.name}")
	private String defaultName;
	
	@RequestMapping("sayHi")
	public String sayHi(String name) {
		name = StringUtils.isEmpty(name) ? defaultName : name;
		return "你好~ " + name +"(端口:"+ port +")。";
	}
	
}
