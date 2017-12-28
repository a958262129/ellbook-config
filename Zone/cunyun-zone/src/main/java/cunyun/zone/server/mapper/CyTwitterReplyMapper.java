package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyTwitterReply;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CyTwitterReplyMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(CyTwitterReply record);

    int insertSelective(CyTwitterReply record);



    CyTwitterReply selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(CyTwitterReply record);

    int updateByPrimaryKeyWithBLOBs(CyTwitterReply record);

    int updateByPrimaryKey(CyTwitterReply record);
}