package commons.utils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

/**
 * 当把Person类作为BeanUtilTest的内部类时，程序出错<br>
 * java.lang.NoSuchMethodException: Property '**' has no setter method<br>
 * 本质：内部类 和 单独文件中的类的区别 <br>
 * BeanUtils.populate方法的限制：<br>
 * The class must be public, and provide a public constructor that accepts no
 * arguments. <br>
 * This allows tools and applications to dynamically create new instances of
 * your bean, <br>
 * without necessarily knowing what Java class name will be used ahead of time
 */
public class CommonsUtils {

	// Bean --> Map 1: 利用Introspector和PropertyDescriptor 将Bean --> Map
	public static Map<String, Object> beantoMap(Object obj) {

		if (obj == null) {
			return null;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor property : propertyDescriptors) {
				String key = property.getName();

				// 过滤class属性
				if (!key.equals("class")) {
					// 得到property对应的getter方法
					Method getter = property.getReadMethod();
					Object value = getter.invoke(obj);

					map.put(key, value);
				}

			}
		} catch (Exception e) {
			System.out.println("transBean2Map Error " + e);
		}

		return map;

	}

	/**
	 * 使用java.util.Properties类的load()方法加载properties文件
	 */
	public static String getProperties(String path, String attr) {
		try {
			// 获取文件流（方法1或2均可）
			InputStream inputStream = new BufferedInputStream(new FileInputStream(new File(path))); // 方法1
			// InputStream inputStream =
			// Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties");
			// //方法2
			Properties prop = new Properties();

			prop.load(new InputStreamReader(inputStream, "UTF-8")); // 加载格式化后的流

			return prop.getProperty(attr);

		} catch (FileNotFoundException e) {
			System.out.println("properties文件路径有误！");
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String unicodeToCn(String unicode) {
		/** 以 \ u 分割，因为java注释也能识别unicode，因此中间加了一个空格 */
		String[] strs = unicode.split("\\\\u");
		String returnStr = "";
		// 由于unicode字符串以 \ u 开头，因此分割出的第一个字符是""。
		for (int i = 1; i < strs.length; i++) {
			returnStr += (char) Integer.valueOf(strs[i], 16).intValue();
		}
		return returnStr;
	}

	public static String cnToUnicode(String cn) {
		char[] chars = cn.toCharArray();
		String returnStr = "";
		for (int i = 0; i < chars.length; i++) {
			returnStr += "\\u" + Integer.toString(chars[i], 16);
		}
		return returnStr;
	}

	@SuppressWarnings("unchecked")
	public static <T> T xmlToBean(String XML, Class<T> load) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(load);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		return (T) unmarshaller.unmarshal(new StringReader(XML));
	}

	public static String decodeUnicode(String theString) {
		char aChar;
		int len = theString.length();
		StringBuffer outBuffer = new StringBuffer(len);
		for (int x = 0; x < len;) {
			aChar = theString.charAt(x++);
			if (aChar == '\\') {
				aChar = theString.charAt(x++);
				if (aChar == 'u') {
					// Read the xxxx
					int value = 0;
					for (int i = 0; i < 4; i++) {
						aChar = theString.charAt(x++);
						switch (aChar) {
						case '0':
						case '1':
						case '2':
						case '3':
						case '4':
						case '5':
						case '6':
						case '7':
						case '8':
						case '9':
							value = (value << 4) + aChar - '0';
							break;
						case 'a':
						case 'b':
						case 'c':
						case 'd':
						case 'e':
						case 'f':
							value = (value << 4) + 10 + aChar - 'a';
							break;
						case 'A':
						case 'B':
						case 'C':
						case 'D':
						case 'E':
						case 'F':
							value = (value << 4) + 10 + aChar - 'A';
							break;
						default:
							throw new IllegalArgumentException("Malformed   \\uxxxx   encoding.");
						}

					}
					outBuffer.append((char) value);
				} else {
					if (aChar == 't')
						aChar = '\t';
					else if (aChar == 'r')
						aChar = '\r';
					else if (aChar == 'n')
						aChar = '\n';
					else if (aChar == 'f')
						aChar = '\f';
					outBuffer.append(aChar);
				}
			} else
				outBuffer.append(aChar);
		}
		return outBuffer.toString();
	}

	@Test
	public void name() throws UnsupportedEncodingException {
		String asd = "{\"code\":200,\"data\":{\"count\":2,\"stores\":null,\"unsureStores\":null,\"trainTypeDetails\":[{\"trainType\":5,\"number\":1,\"trainTypeName\":\"K-\\u666e\\u5feb\"},{\"trainType\":4,\"number\":1,\"trainTypeName\":\"T-\\u7279\\u5feb\"}],\"streamId\":\"f6e44d18-4bdd-41ac-9fe6-89a5bcd3ace2\",\"remark\":\"\",\"isFinish\":null,\"lastTime\":0,\"expire\":false,\"freshUrl\":null,\"reserveUrls\":null,\"crossURL\":null,\"origin\":null,\"list\":[{\"trainId\":20155,\"trainNum\":\"K155\",\"trainType\":5,\"trainTypeName\":\"\\u666e\\u5feb\",\"departStationName\":\"\\u666f\\u5fb7\\u9547\",\"destStationName\":\"\\u840d\\u4e61\",\"departDepartTime\":\"01:55\",\"destArriveTime\":\"07:59\",\"duration\":364,\"prices\":[{\"leftNumber\":0,\"seatStatus\":\"\",\"seat\":5,\"price\":233,\"stuPrice\":null,\"promotionPrice\":233,\"resId\":1506960519,\"detail\":[{\"seat\":16,\"price\":205,\"promotionPrice\":205,\"seatName\":\"\\u8f6f\\u5367\\u4e0a\"},{\"seat\":5,\"price\":233,\"promotionPrice\":233,\"seatName\":\"\\u8f6f\\u5367\\u4e0b\"}],\"priceMemo\":null,\"seatName\":\"\\u8f6f\\u5367\"},{\"leftNumber\":0,\"seatStatus\":\"\",\"seat\":6,\"price\":164,\"stuPrice\":null,\"promotionPrice\":164,\"resId\":1506960520,\"detail\":[{\"seat\":14,\"price\":133,\"promotionPrice\":133,\"seatName\":\"\\u786c\\u5367\\u4e0a\"},{\"seat\":15,\"price\":133,\"promotionPrice\":133,\"seatName\":\"\\u786c\\u5367\\u4e2d\"},{\"seat\":6,\"price\":164,\"promotionPrice\":164,\"seatName\":\"\\u786c\\u5367\\u4e0b\"}],\"priceMemo\":null,\"seatName\":\"\\u786c\\u5367\"},{\"leftNumber\":0,\"seatStatus\":\"\",\"seat\":8,\"price\":75,\"stuPrice\":null,\"promotionPrice\":75,\"resId\":1506960521,\"detail\":[],\"priceMemo\":null,\"seatName\":\"\\u786c\\u5ea7\"},{\"leftNumber\":0,\"seatStatus\":\"\",\"seat\":9,\"price\":75,\"stuPrice\":null,\"promotionPrice\":75,\"resId\":1506960522,\"detail\":[],\"priceMemo\":null,\"seatName\":\"\\u65e0\\u5ea7\"}],\"durationDay\":1,\"departStationType\":2,\"destStationType\":2,\"saleStatus\":0,\"departStationId\":1176005,\"destStationId\":1176650,\"startSaleTime\":\"\",\"canChooseSeat\":0,\"memo\":\"\",\"departureCityCode\":1706,\"arrivalCityCode\":1710,\"departureCityName\":\"\\u666f\\u5fb7\\u9547\",\"arrivalCityName\":\"\\u840d\\u4e61\",\"upOrDown\":0,\"trainStartDate\":null,\"accessByIdcard\":\"N\",\"durationStr\":\"6\\u5c0f\\u65f64\\u5206\\u949f\",\"departStationTypeName\":\"\",\"destStationTypeName\":\"\",\"sellOut\":1},{\"trainId\":29151,\"trainNum\":\"T151\",\"trainType\":4,\"trainTypeName\":\"\\u7279\\u5feb\",\"departStationName\":\"\\u666f\\u5fb7\\u9547\",\"destStationName\":\"\\u840d\\u4e61\",\"departDepartTime\":\"02:33\",\"destArriveTime\":\"08:23\",\"duration\":350,\"prices\":[{\"leftNumber\":0,\"seatStatus\":\"\",\"seat\":5,\"price\":233,\"stuPrice\":null,\"promotionPrice\":233,\"resId\":1506960523,\"detail\":[{\"seat\":16,\"price\":205,\"promotionPrice\":205,\"seatName\":\"\\u8f6f\\u5367\\u4e0a\"},{\"seat\":5,\"price\":233,\"promotionPrice\":233,\"seatName\":\"\\u8f6f\\u5367\\u4e0b\"}],\"priceMemo\":null,\"seatName\":\"\\u8f6f\\u5367\"},{\"leftNumber\":0,\"seatStatus\":\"\",\"seat\":6,\"price\":164,\"stuPrice\":null,\"promotionPrice\":164,\"resId\":1506960524,\"detail\":[{\"seat\":14,\"price\":133,\"promotionPrice\":133,\"seatName\":\"\\u786c\\u5367\\u4e0a\"},{\"seat\":15,\"price\":133,\"promotionPrice\":133,\"seatName\":\"\\u786c\\u5367\\u4e2d\"},{\"seat\":6,\"price\":164,\"promotionPrice\":164,\"seatName\":\"\\u786c\\u5367\\u4e0b\"}],\"priceMemo\":null,\"seatName\":\"\\u786c\\u5367\"},{\"leftNumber\":99,\"seatStatus\":\"\\u6709\",\"seat\":8,\"price\":75,\"stuPrice\":null,\"promotionPrice\":75,\"resId\":1506960525,\"detail\":[],\"priceMemo\":null,\"seatName\":\"\\u786c\\u5ea7\"},{\"leftNumber\":0,\"seatStatus\":\"\",\"seat\":9,\"price\":75,\"stuPrice\":null,\"promotionPrice\":75,\"resId\":1506960526,\"detail\":[],\"priceMemo\":null,\"seatName\":\"\\u65e0\\u5ea7\"}],\"durationDay\":1,\"departStationType\":2,\"destStationType\":2,\"saleStatus\":0,\"departStationId\":1176005,\"destStationId\":1176650,\"startSaleTime\":\"\",\"canChooseSeat\":0,\"memo\":\"\",\"departureCityCode\":1706,\"arrivalCityCode\":1710,\"departureCityName\":\"\\u666f\\u5fb7\\u9547\",\"arrivalCityName\":\"\\u840d\\u4e61\",\"upOrDown\":0,\"trainStartDate\":null,\"accessByIdcard\":\"N\",\"durationStr\":\"5\\u5c0f\\u65f650\\u5206\\u949f\",\"departStationTypeName\":\"\",\"destStationTypeName\":\"\",\"sellOut\":0}],\"allTrainType\":{\"list\":[{\"trainType\":5,\"trainTypeName\":\"K-\\u666e\\u5feb\",\"trainTypeCode\":\"K\",\"link\":\"http:\\/\\/huoche.tuniu.com\\/station_1706_1710\\/K\"},{\"trainType\":4,\"trainTypeName\":\"T-\\u7279\\u5feb\",\"trainTypeCode\":\"T\",\"link\":\"http:\\/\\/huoche.tuniu.com\\/station_1706_1710\\/T\"}],\"departureCityName\":\"\\u666f\\u5fb7\\u9547\",\"arrivalCityName\":\"\\u840d\\u4e61\"},\"filter\":{\"filter\":[{\"id\":\"trainTypes\",\"name\":\"\\u8f66\\u578b\",\"pros\":[{\"id\":4,\"name\":\"T-\\u7279\\u5feb\"},{\"id\":5,\"name\":\"K-\\u666e\\u5feb\"}]},{\"id\":\"seats\",\"name\":\"\\u5ea7\\u5e2d\",\"pros\":[{\"id\":5,\"name\":\"\\u8f6f\\u5367\"},{\"id\":6,\"name\":\"\\u786c\\u5367\"},{\"id\":8,\"name\":\"\\u786c\\u5ea7\"}]},{\"id\":\"departureStations\",\"name\":\"\\u51fa\\u53d1\\u8f66\\u7ad9\",\"pros\":[{\"name\":\"\\u666f\\u5fb7\\u9547\",\"id\":1176005}]},{\"id\":\"arrivalStations\",\"name\":\"\\u5230\\u8fbe\\u8f66\\u7ad9\",\"pros\":[{\"name\":\"\\u840d\\u4e61\",\"id\":1176650}]},{\"id\":\"departureTimes\",\"name\":\"\\u51fa\\u53d1\\u65f6\\u6bb5\",\"pros\":[{\"id\":\"0-6\",\"name\":\"0-6\\u70b9\"}]},{\"id\":\"arrivalTimes\",\"name\":\"\\u5230\\u8fbe\\u65f6\\u6bb5\",\"pros\":[{\"id\":\"6-12\",\"name\":\"6-12\\u70b9\"}]},{\"id\":\"departStationTypes\",\"name\":\"\\u662f\\u5426\\u59cb\\u53d1\",\"pros\":[{\"id\":2,\"name\":\"\\u8fc7\\u8def\"}]}],\"sort\":[{\"type\":2,\"id\":1,\"name\":\"\\u51fa\\u53d1\\u65f6\\u95f4\"},{\"type\":2,\"id\":3,\"name\":\"\\u8fd0\\u884c\\u65f6\\u95f4\"},{\"type\":2,\"id\":2,\"name\":\"\\u5230\\u8fbe\\u65f6\\u95f4\"},{\"type\":2,\"id\":4,\"name\":\"\\u4ef7\\u683c\"}]}}}";

		System.out.println(decodeUnicode(asd));
	}
}