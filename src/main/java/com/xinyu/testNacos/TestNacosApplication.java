package com.xinyu.testNacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;

/**
 * 	启动项目后，NacosRegisterConfiguration.registerInstance 方法会自动把服务注册到nacos上
 *  1 需要把配置文件TestNacos.yml交给nacos管理，可在localhost:8848/nacos页面中配，也可以调用接口把配置信息注册到nacos上，
 *  1.2 接口: http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=TestNacos.yml&group=DEFAULT_GROUP&content=user.name=yuxin
 *  2 调用接口： http://localhost:8082/testNacos/getUser 可以查看到发布的配置信息。
 * @author: yx
 * @date: 2019年7月17日 下午5:31:36
 */
@SpringBootApplication
@NacosPropertySource(dataId = "TestNacos.yml", autoRefreshed = true)
public class TestNacosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestNacosApplication.class, args);
	}

}

