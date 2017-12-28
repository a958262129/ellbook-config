package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyTwitterVoteRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CyTwitterVoteRecordMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(CyTwitterVoteRecord record);

    int insertSelective(CyTwitterVoteRecord record);



    CyTwitterVoteRecord selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(CyTwitterVoteRecord record);

    int updateByPrimaryKeyWithBLOBs(CyTwitterVoteRecord record);

    int updateByPrimaryKey(CyTwitterVoteRecord record);
}