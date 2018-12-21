package com.lt.journey.util;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lt.journey.model.News;

import commons.utils.CommonsUtils;
import commons.utils.HttpRequest;

public class NewsInfo {

	private static String path = "src/main/resources/apikey.properties";
	private static String url = CommonsUtils.getProperties(path, "News_Url");
	private static String key = CommonsUtils.getProperties(path, "News_key");
	private static String type = CommonsUtils.getProperties(path, "News_type");
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

	public static List<News> getNewsInfo() {
		String param = "key=" + key + "&type=" + type;
		String dataStr = HttpRequest.sendGet(url, param);
		JSONObject dataObj = JSONObject.parseObject(dataStr);
		String newsListStr = dataObj.getJSONObject("result").getJSONArray("data") + "";
		List<News> newsList = JSONObject.parseArray(newsListStr, News.class);
		return newsList;
//		JSONObject newsObj = JSONObject.fromObject(dataStr);
//		JSONArray newsObjs = newsObj.getJSONObject("result").getJSONArray("data");
//		ArrayList<News> newsList = new ArrayList<News>();
//		for (int i = 0; i < newsObjs.size(); i++) {
//			JSONObject newsInfo = newsObjs.getJSONObject(i);
//			News news= (News) JSONObject.toBean(newsInfo, News.class);
//			newsList.add(news);
//		}
//		return newsList;
	}

	@Test
	public void name() {
		List<News> newsInfo = getNewsInfo();
		System.out.println(newsInfo);
	}

}
