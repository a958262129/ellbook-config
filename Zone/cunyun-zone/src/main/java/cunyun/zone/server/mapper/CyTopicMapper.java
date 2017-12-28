package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyTopic;


public interface CyTopicMapper {


    int deleteByPrimaryKey(String topicId);

    int insert(CyTopic record);

    int insertSelective(CyTopic record);



    CyTopic selectByPrimaryKey(String topicId);



    int updateByPrimaryKeySelective(CyTopic record);

    int updateByPrimaryKey(CyTopic record);
}