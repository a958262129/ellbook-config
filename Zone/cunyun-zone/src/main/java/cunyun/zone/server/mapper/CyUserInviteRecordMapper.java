package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyUserInviteRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CyUserInviteRecordMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(CyUserInviteRecord record);

    int insertSelective(CyUserInviteRecord record);



    CyUserInviteRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyUserInviteRecord record);

    int updateByPrimaryKey(CyUserInviteRecord record);
}