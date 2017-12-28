package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyBannerClickLog;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CyBannerClickLogMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(CyBannerClickLog record);

    int insertSelective(CyBannerClickLog record);


    CyBannerClickLog selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(CyBannerClickLog record);

    int updateByPrimaryKey(CyBannerClickLog record);
}