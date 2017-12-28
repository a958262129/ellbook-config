package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CyUserMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(CyUser record);

    int insertSelective(CyUser record);


    CyUser selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(CyUser record);

    int updateByPrimaryKeyWithBLOBs(CyUser record);

    int updateByPrimaryKey(CyUser record);
}