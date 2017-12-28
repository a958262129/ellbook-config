package cunyun.zone.server.mapper;


public interface CyBannerMapper {

    int deleteByPrimaryKey(String bannerId);


    int updateByPrimaryKey(CyBanner record);
}