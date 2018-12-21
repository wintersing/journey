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
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

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
			InputStream inputStream = new BufferedInputStream(
					new FileInputStream(new File(path))); // 方法1
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

}