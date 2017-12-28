package cunyun.zone.server.mapper;


import cunyun.zone.server.entity.CyBanner;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CyBannerMapper {

    int deleteByPrimaryKey(String bannerId);


    int updateByPrimaryKey(CyBanner record);
}