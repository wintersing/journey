package com.lt.journey.util;

import java.util.List;
import java.util.Properties;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lt.commons.utils.CommonsUtils;
import com.lt.commons.utils.HttpRequest;
import com.lt.journey.model.News;
import com.lt.journey.model.NewsParam;

public class NewsInfo {
	private static Properties propertiesAll = CommonsUtils.getPropertiesAll("src/main/resources/apikey.properties");
	
	private static final String url = propertiesAll.getProperty("News_Url");
	private static final String apikey = propertiesAll.getProperty("IDataAPI_APIKEY");

	public static List<News> getNewsInfo(NewsParam newsParam) {
		StringBuffer param = new StringBuffer();
		param.append("apikey=").append(apikey).append("&size=").append(newsParam.getSize())
		.append("&catLabel2=").append(newsParam.getCatLabel2()).append("&publishDateRange=")
		.append(newsParam.getPublishDateRange()).append("&createDateRange=").append(newsParam.getCreateDateRange());
		if (newsParam.getPageToken_news() != null) {
			param.append("&pageToken=").append(newsParam.getPageToken_news());
		}
		//发送get请求
		String ret = HttpRequest.sendGet(url, param.toString());
		//处理返回数据
		JSONObject dataObj = JSON.parseObject(ret);
		String newsListStr = dataObj.getJSONArray("data").toString();
		List<News> newsList = JSONObject.parseArray(newsListStr, News.class);
//		System.out.println(newsList);
		return newsList;
	}

}
