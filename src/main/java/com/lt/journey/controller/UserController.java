package com.lt.journey.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lt.journey.model.User;
import com.lt.journey.service.UserService;

import com.lt.journey.util.SMSUtils;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userService;

	//注册
	@RequestMapping("/registView")
	public String view() {
		return "login-register";
	}

	@RequestMapping(value = "/sendSMScode", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject index(@RequestBody User user) {
		System.out.println(user);
		Map<String, String> resBody = new HashMap<String, String>();
		User _user = userService.findUserByMobile(user.getMobile());

		if (_user != null) {
			resBody.put("code", "1");// 手机号已注册
			JSONObject json = JSONObject.fromObject(resBody);
			return json;
		}

		try {
			String isSuccess = SMSUtils.sendCode(user.getMobile());
			
			if (isSuccess != null) {
				resBody.put("code", "2");//验证码发送成功
				JSONObject json = (JSONObject) JSONObject.fromObject(resBody);
				return json;
			} else {
				resBody.put("code", "0");// 验证码发送失败
				JSONObject json = (JSONObject) JSONObject.fromObject(resBody);
				return json;
			}
		} catch (Exception e) {
			resBody.put("code", "0");// 验证码发送失败
			JSONObject json = (JSONObject) JSONObject.fromObject(resBody);
			return json;
		}
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(User user, HttpSession session) {
		userService.addUser(user);
		return "index";
	}
}
