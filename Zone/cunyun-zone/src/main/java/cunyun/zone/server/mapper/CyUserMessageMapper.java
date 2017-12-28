package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyUserMessage;


public interface CyUserMessageMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(CyUserMessage record);

    int insertSelective(CyUserMessage record);


    CyUserMessage selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(CyUserMessage record);

    int updateByPrimaryKey(CyUserMessage record);
}