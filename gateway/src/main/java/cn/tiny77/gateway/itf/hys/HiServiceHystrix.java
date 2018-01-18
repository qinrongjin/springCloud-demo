package cn.tiny77.gateway.itf.hys;

import org.springframework.stereotype.Component;

import cn.tiny77.gateway.itf.HiService;

@Component
public class HiServiceHystrix implements HiService {

	@Override
	public String sayHi(String name) {
		return "抱歉，" + name + "， 当前网络繁忙。";
	}

}
