package cunyun.zone.server.command;


import cunyun.zone.server.entity.web.JsonResponseMsg;
import cunyun.zone.server.entity.web.RequestParams;
import cunyun.zone.server.entity.web.ResponseParams;

/**
 *  请求接口
 *  Date          Author       Version       Description
 * ----------------------------------------------------------
 *  2017-4-26      yanlei            1.0           Create
 */
public interface IRequestCommand {

	/**
	 * 请求的具体实现
	 * @param params
	 * @throws Exception
	 */
	JsonResponseMsg execute(RequestParams params) throws Exception;
	/**
	 * 请求的发送之后
	 * @throws Exception
	 */
	void executeBefore(ResponseParams response) throws Exception;

}
