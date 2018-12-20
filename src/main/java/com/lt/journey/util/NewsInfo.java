package com.lt.journey.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.springframework.http.converter.json.GsonBuilderUtils;

import com.alibaba.druid.support.json.JSONParser;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.processors.JsonValueProcessor;
import net.sf.json.util.JSONUtils;

public class NewsInfo {

	private static String url = "http://v.juhe.cn/toutiao/index";
	private static String key = "6c9d043717499325c91fc1e9addd7d30";
	private static String type = "top";
//	top(头条),
//	shehui(社会),
//	guonei(国内),
//	guoji(国际),
//	yule(娱乐),
//	tiyu(体育)
//	junshi(军事),
//	keji(科技),
//	caijing(财经),
//	shishang(时尚)

	public static void getNewsInfo() {
		String param = "key=" + key + "&type=" + type;
		String ret = HttpRequest.sendGet(url, param);
//		System.out.println(ret);
		JSONObject object = JSONObject.fromObject(ret);
		String result = object.getString("result");
		JSONArray news = JSONObject.fromObject(result).getJSONArray(result);
	}

	@Test
	public void name() {
		getNewsInfo();
	}
}
