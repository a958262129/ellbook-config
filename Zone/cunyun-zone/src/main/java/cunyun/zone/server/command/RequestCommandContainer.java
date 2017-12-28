package cunyun.zone.server.command;

import java.util.HashMap;
import java.util.Map;


/**
 * 请求的容器，各个IRequestCommand实现类需将自身注册到该容器中
 * 注册的key为对应请求的method
 *  Date          Author       Version       Description
 * ----------------------------------------------------------
 *  2017-4-26      yanlei            1.0           Create
 */
public class RequestCommandContainer {
	private Map<String, IRequestCommand> requests = new HashMap<String, IRequestCommand>();

	private static class RequestCommandContainerHolder {
		private static RequestCommandContainer instance = new RequestCommandContainer();
	}

	public static RequestCommandContainer getInstance() {
		return RequestCommandContainerHolder.instance;
	}

	public void add(String type, IRequestCommand command) {
		requests.put(type, command);
	}

	public IRequestCommand get(String type) {
		return requests.get(type);
	}
}
