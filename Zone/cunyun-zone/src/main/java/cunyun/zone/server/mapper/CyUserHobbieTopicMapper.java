package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyUserHobbieTopic;


public interface CyUserHobbieTopicMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(CyUserHobbieTopic record);

    int insertSelective(CyUserHobbieTopic record);



    CyUserHobbieTopic selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(CyUserHobbieTopic record);

    int updateByPrimaryKey(CyUserHobbieTopic record);
}