package com.lt.journey.util;

import java.util.List;
import java.util.Properties;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.lt.commons.utils.CommonsUtils;
import com.lt.commons.utils.HttpRequest;
import com.lt.journey.model.News;

public class NewsInfo {
	private static Properties propertiesAll = CommonsUtils.getPropertiesAll("src/main/resources/apikey.properties");
	
	private static final String url = propertiesAll.getProperty("News_Url");
	private static final String key = propertiesAll.getProperty("News_key");
	private static final String type = propertiesAll.getProperty("News_type");
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
	}

	@Test
	public void name() {
		List<News> newsInfo = getNewsInfo();
		System.out.println(newsInfo);
	}

}
