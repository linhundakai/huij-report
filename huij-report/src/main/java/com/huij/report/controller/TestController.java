/**
 * 
 */
package com.huij.report.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.huij.report.back.mapper.BackM1VintageMapper;

/**
 * @author Administrator
 *
 */
@RestController
@RequestMapping(value = "/test", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
public class TestController {

	@Autowired
	private BackM1VintageMapper backM1VintageMapper;
	
	@Autowired
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public Object test(HttpServletRequest request) {
//		List<BackM1Vintage> list = backM1VintageMapper.selectAllM1Vintage();
//		List<M1vintagetest> vintageList = m1vintagetestMapper.selectByType(1);
//		return vintageList;
		
		return null;
	}
}
