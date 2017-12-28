package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyTwitterVoteOption;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CyTwitterVoteOptionMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(CyTwitterVoteOption record);

    int insertSelective(CyTwitterVoteOption record);



    CyTwitterVoteOption selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(CyTwitterVoteOption record);

    int updateByPrimaryKey(CyTwitterVoteOption record);
}