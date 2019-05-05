package com.lt.journey.controller;

import java.util.Properties;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.lt.commons.utils.CommonsUtils;
import com.lt.commons.utils.HttpRequest;

@Controller
@RequestMapping("/")
public class CommentController {
	@Test
	public void SMSrandom() {
		System.out.println(CommentController.class.getResource(""));
	}
	private static Properties propertiesAll = CommonsUtils.getPropertiesAll("src/main/resources/apikey.properties");
//	private static final String path = "apikey.properties";
	private static final String url = propertiesAll.getProperty("comment_url");
	private static final String Hotel_comment_url = propertiesAll.getProperty("Hotel_comment_url");
	private static final String apikey = propertiesAll.getProperty( "IDataAPI_APIKEY");

	@RequestMapping(value = "/comment/{parent}/{id}", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String getComment(@PathVariable("parent") String parent, @PathVariable("id") String id, String pageToken) {

		StringBuffer param = new StringBuffer();
		param.append("apikey=").append(apikey).append("&id=").append(id).append("&parent=")
		.append(parent).append("&pageToken=").append(pageToken);

		String dataStr = HttpRequest.sendGet(url, param.toString());
		if (dataStr == null) {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("retcode", "100002");
			return jsonObject.toString();
		}
//		System.out.println(dataStr);
		return CommonsUtils.unicodeToString(dataStr);
	}

	@RequestMapping(value = "/comment/hotel/{id}", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String getHotelComment(@PathVariable("id") String id, String pageToken) {

		StringBuffer param = new StringBuffer();
		param.append("apikey=").append(apikey).append("&id=").append(id).append("&pageToken=").append(pageToken);

		String dataStr = HttpRequest.sendGet(Hotel_comment_url, param.toString());

		System.out.println(dataStr);
//		String string = CommonsUtils.unicodeToString(dataStr);
		return dataStr;
	}
}
