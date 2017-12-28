package cunyun.zone.server.service;



import cunyun.zone.server.constant.ConstantUtil;
import cunyun.zone.server.entity.Vo.BaseUserVo;
import cunyun.zone.server.entity.web.JsonResponseMsg;
import cunyun.zone.server.mapper.CyUserFriendsMapper;
import cunyun.zone.server.util.pageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/2.
 */
@Service
public class UserService {

    @Autowired
    CyUserFriendsMapper cyUserFriendsMapper;


    public JsonResponseMsg findUserFriends(BaseUserVo BaseUserVo) {
        JsonResponseMsg res = new JsonResponseMsg();

        Integer count = cyUserFriendsMapper.findUserFriendsCount(BaseUserVo);
        if (count == 0 || count == null) {
            Map<String, Object> map = pageUtil.paging(count, BaseUserVo.getPage(), BaseUserVo.getPageSize());
            map.put("list", "");
            res.setObject(map);
            return res.fill(ConstantUtil.MSG_FAIL_CODE,ConstantUtil.MSG_FAIL_DESC);
        }
        Map<String, Object> map = pageUtil.paging(count, BaseUserVo.getPage(), BaseUserVo.getPageSize());
        BaseUserVo.setStartAndEnd();
        List<Map<String, Object>> list = cyUserFriendsMapper.findUserFriends(BaseUserVo);
        map.put("list",list);
        return res.fill(ConstantUtil.MSG_SUCCESS_CODE,ConstantUtil.MSG_SUCCESS_DESC,map);
    }
}
