package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyTwitterAtts;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CyTwitterAttsMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(CyTwitterAtts record);

    int insertSelective(CyTwitterAtts record);


    CyTwitterAtts selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(CyTwitterAtts record);

    int updateByPrimaryKeyWithBLOBs(CyTwitterAtts record);

    int updateByPrimaryKey(CyTwitterAtts record);
}