package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyUserScoreRecode;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CyUserScoreRecodeMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(CyUserScoreRecode record);

    int insertSelective(CyUserScoreRecode record);


    CyUserScoreRecode selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(CyUserScoreRecode record);

    int updateByPrimaryKey(CyUserScoreRecode record);
}