package cunyun.zone.server.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by Administrator on 2017/8/30.
 */
@FeignClient(name = "redis")
public interface Redis {

    /**
     * 页面列表配置模块
     */
    @RequestMapping(method = RequestMethod.POST, value = "/set")
    boolean set(@RequestParam(value = "key") String key,@RequestParam(value = "value")String value);

    @RequestMapping(method = RequestMethod.POST, value = "/hSet")
    boolean hSet(@RequestParam(value = "key") String key,@RequestParam(value = "filed") String filed,@RequestParam(value = "value")String value);

    @RequestMapping(method = RequestMethod.POST, value ="/get")
    String get(@RequestParam(value = "key") String key);

    @RequestMapping(method = RequestMethod.POST, value ="/hGet")
    String hGet(@RequestParam(value = "key") String key,@RequestParam(value = "filed") String filed);

    @RequestMapping(method = RequestMethod.POST, value ="/expire")
    String expire(@RequestParam(value = "key") String key, @RequestParam(value = "expire") long expire);

    @RequestMapping(method = RequestMethod.POST, value ="/ttl")
    long ttl(@RequestParam(value = "key") String key);

    @RequestMapping(method = RequestMethod.POST, value ="/del")
    long del(@RequestParam(value = "key") String key);

    @RequestMapping(method = RequestMethod.POST, value ="/hDel")
    long hDel(@RequestParam(value = "key") String key,@RequestParam(value = "filed") String filed);

    @RequestMapping( method = RequestMethod.POST,value ="/setMap")
    String setMap(@RequestParam(value = "key") String key,@RequestBody Map map);

    @RequestMapping(method = RequestMethod.POST, value ="/getMap")
    Map getMap(@RequestParam(value = "key") String key);


}
