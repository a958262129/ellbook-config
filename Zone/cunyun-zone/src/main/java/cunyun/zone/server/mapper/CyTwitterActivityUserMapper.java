package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyTwitterActivityUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CyTwitterActivityUserMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(CyTwitterActivityUser record);

    int insertSelective(CyTwitterActivityUser record);



    CyTwitterActivityUser selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(CyTwitterActivityUser record);

    int updateByPrimaryKey(CyTwitterActivityUser record);
}