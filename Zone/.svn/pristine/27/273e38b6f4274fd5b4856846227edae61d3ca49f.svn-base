package cunyun.zone.server.entity.web;


import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * 请求的解析类
 *  Date          Author       Version       Description
 * ----------------------------------------------------------
 *  2017-4-27      yanlei            1.0           Create
 */
public class RequestParamsParse {
	private static final Logger logger = LoggerFactory.getLogger(RequestParamsParse.class);

	public static RequestParams parseRequestParam(HttpServletRequest request) throws Exception {
		RequestParams requestParams = new RequestParams();
		requestParams.setSign(request.getParameter(SIGN));
		for (Map.Entry<String, String[]> parameterMap : request.getParameterMap().entrySet()) {
			String name = parameterMap.getKey();
			String value = request.getParameter(name);
			requestParams.getParams().put(name, value);
		}
		requestParams.setIp(request.getRemoteAddr());
		String stringXml = IOUtils.toString(request.getInputStream(), "utf-8");
		requestParams.setRequestJson(stringXml);
		return requestParams;
	}

	private static List<String> params = new ArrayList<String>();
	public static final String METHOD = "method";
	public static final String FORMAT = "format";
	public static final String APP_KEY = "app_key";
	public static final String VERSION = "v";
	public static final String SIGN = "sign";
	public static final String SIGN_METHOD = "sign_method";
	public static final String TIMESTAMP = "timestamp";
	static {
		params.add(METHOD);// 请求方法名
		params.add(FORMAT);// 格式化方式
		params.add(APP_KEY);// appkey
		params.add(VERSION);// 版本号
		// params.add(SIGN);// 签名结果
		params.add(SIGN_METHOD);// 参数加密方法
		params.add(TIMESTAMP);// WMS颁发给用户的ID
	}
}
