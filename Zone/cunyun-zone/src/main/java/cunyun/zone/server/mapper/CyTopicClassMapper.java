package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyTopicClass;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CyTopicClassMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(CyTopicClass record);

    int insertSelective(CyTopicClass record);


    CyTopicClass selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(CyTopicClass record);

    int updateByPrimaryKey(CyTopicClass record);
}