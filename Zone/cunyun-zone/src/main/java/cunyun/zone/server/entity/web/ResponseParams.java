package cunyun.zone.server.entity.web;

import java.io.Serializable;

/**
 * 返回请求参数
 *  Date          Author       Version       Description
 * ----------------------------------------------------------
 *  2017-8-21      yanlei            1.0           Create
 */
public class ResponseParams<T> implements Serializable {
	private String code;

	private String status;

	private String message;

	private String remark;

	private T data;
	public ResponseParams() {
	}

	public ResponseParams(String remark) {
		this.remark = remark;
	}

	public ResponseParams fill(String status, String message) {
		this.setStatus(status);
		this.setMessage(message);
		return this;
	}

	public ResponseParams fill(String code, String message, String status) {
		this.code=code;
		this.message=message;
		this.setStatus(status);
		return this;
	}
	public ResponseParams fill(String status, String message,T data) {
		this.setData(data);
		this.fill(status, message);
		return this;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


	@Override
	public String toString() {
		return "ResponseParams{" +
				"code='" + code + '\'' +
				", status='" + status + '\'' +
				", message='" + message + '\'' +
				", remark='" + remark + '\'' +
				", data=" + data +
				'}';
	}
}
