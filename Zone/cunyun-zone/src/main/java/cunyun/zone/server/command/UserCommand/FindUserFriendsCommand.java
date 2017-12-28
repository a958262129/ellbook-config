package cunyun.zone.server.command.UserCommand;


import com.alibaba.fastjson.JSONObject;
import cunyun.zone.server.command.IRequestCommand;
import cunyun.zone.server.command.RequestCommandContainer;
import cunyun.zone.server.entity.Vo.BaseUserVo;
import cunyun.zone.server.entity.web.JsonResponseMsg;
import cunyun.zone.server.entity.web.RequestParams;
import cunyun.zone.server.entity.web.ResponseParams;
import cunyun.zone.server.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * 根据作者信息
 * Date          Author       Version       Description
 * ----------------------------------------------------------
 * 2017-8-25      xixiaoyi           1.0           Create
 */
@Component
@Lazy(false)
public class FindUserFriendsCommand implements IRequestCommand, InitializingBean {
    @Autowired
    UserService userService;

    @Override
    public void afterPropertiesSet() throws Exception {
        RequestCommandContainer.getInstance().add("neican.user.findUserFriends", this);
    }

    @Override
    public JsonResponseMsg execute(RequestParams params) throws Exception {
        String content = params.getParams().get("content");
        BaseUserVo baseUserVo = JSONObject.parseObject(content, BaseUserVo.class);
        return userService.findUserFriends(baseUserVo);
    }

    @Override
    public void executeBefore(ResponseParams response) throws Exception {

    }


}
