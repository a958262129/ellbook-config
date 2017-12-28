package cunyun.zone.server.entity.web;

import java.util.HashMap;
import java.util.Map;

/**
 * 接口的参数封装
 *  Date          Author       Version       Description
 * ----------------------------------------------------------
 *  2017-8-21     yanlei            1.0           Create
 */
public class RequestParams {
	private Map<String, String> params = new HashMap<String, String>();// 所有需要加密的请求参数
	private String requestJson;// 请求body内容
	private String secret;//秘钥
	private String sign;
	private String ip;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	
	public String getRequestJson() {
		return requestJson;
	}

	public void setRequestJson(String requestJson) {
		this.requestJson = requestJson;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Override
	public String toString() {
		return "RequestParams{" +
				"params=" + params +
				", requestJson='" + requestJson + '\'' +
				", secret='" + secret + '\'' +
				", sign='" + sign + '\'' +
				", ip='" + ip + '\'' +
				'}';
	}
}
