/**  
 * @Title: SpringBootStartApplication.java 
 * @Package com.qz 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author linhong.li  
 * @date 2017年6月21日 上午10:40:32 
 * @version V1.0  
 */
package com.huij.report;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * @ClassName: SpringBootStartApplication
 * @Description: 若需要部署到外部的tomcat容器中，则添加该类即可。 修改启动类，继承
 *               SpringBootServletInitializer 并重写 configure 方法
 * @author linhong.li
 * @date 2017年6月21日 上午10:40:32
 */
public class SpringBootStartApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	return builder.sources(ApplicationService.class);
    }

}