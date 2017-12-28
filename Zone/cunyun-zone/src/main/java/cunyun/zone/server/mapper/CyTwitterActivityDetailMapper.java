package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyTwitterActivityDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CyTwitterActivityDetailMapper {


    int deleteByPrimaryKey(String twitterId);

    int insert(CyTwitterActivityDetail record);

    int insertSelective(CyTwitterActivityDetail record);



    CyTwitterActivityDetail selectByPrimaryKey(String twitterId);


    int updateByPrimaryKeySelective(CyTwitterActivityDetail record);

    int updateByPrimaryKey(CyTwitterActivityDetail record);
}