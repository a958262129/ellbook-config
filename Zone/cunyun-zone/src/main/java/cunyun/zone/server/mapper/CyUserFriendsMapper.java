package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyUserFriends;
import cunyun.zone.server.entity.Vo.BaseUserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CyUserFriendsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(CyUserFriends record);

    int insertSelective(CyUserFriends record);


    CyUserFriends selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(CyUserFriends record);

    int updateByPrimaryKey(CyUserFriends record);

    List<Map<String, Object>> findUserFriends(BaseUserVo baseUserVo);

   Integer findUserFriendsCount(BaseUserVo baseUserVo);
}