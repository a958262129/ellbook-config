package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyUserFriends;


public interface CyUserFriendsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(CyUserFriends record);

    int insertSelective(CyUserFriends record);


    CyUserFriends selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(CyUserFriends record);

    int updateByPrimaryKey(CyUserFriends record);
}