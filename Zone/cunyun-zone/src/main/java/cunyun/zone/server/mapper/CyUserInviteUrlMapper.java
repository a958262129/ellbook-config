package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyUserInviteUrl;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CyUserInviteUrlMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(CyUserInviteUrl record);

    int insertSelective(CyUserInviteUrl record);


    CyUserInviteUrl selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(CyUserInviteUrl record);

    int updateByPrimaryKey(CyUserInviteUrl record);
}