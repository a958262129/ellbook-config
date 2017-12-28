package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyTwitter;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CyTwitterMapper {


    int deleteByPrimaryKey(Integer id);






    int updateByPrimaryKey(CyTwitter record);
}