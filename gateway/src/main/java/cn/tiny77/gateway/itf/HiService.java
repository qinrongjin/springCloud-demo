package cn.tiny77.gateway.itf;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.tiny77.gateway.itf.hys.HiServiceHystrix;

@FeignClient(value = "SERVICE-TEST1", fallback = HiServiceHystrix.class)
public interface HiService {

	@RequestMapping("hi/sayHi/")
	public String sayHi(@RequestParam("name")String name);
	
}
