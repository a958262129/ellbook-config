package cunyun.zone.server.mapper;

import cunyun.zone.server.entity.CyBannerClickLog;



public interface CyBannerClickLogMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(CyBannerClickLog record);

    int insertSelective(CyBannerClickLog record);


    CyBannerClickLog selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(CyBannerClickLog record);

    int updateByPrimaryKey(CyBannerClickLog record);
}