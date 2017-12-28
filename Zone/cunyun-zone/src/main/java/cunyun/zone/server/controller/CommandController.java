package cunyun.zone.server.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;


import cunyun.zone.server.command.IRequestCommand;
import cunyun.zone.server.command.RequestCommandContainer;
import cunyun.zone.server.entity.web.RequestParams;
import cunyun.zone.server.entity.web.RequestParamsParse;
import cunyun.zone.server.response.ResponseParams;
import org.apache.commons.io.IOUtils;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * API接口 Date Author Version Description
 * ---------------------------------------------------------- 2017-8-21 yanlei
 * 1.0 Create
 */
@RestController
@RequestMapping(value = "/rest/api/")
public class CommandController {


    @RequestMapping(value = "service", method = RequestMethod.POST)
    public void service(final HttpServletRequest request, HttpServletResponse response) {
        IRequestCommand requestCommand = null;
        setCrossDomain(response);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/json;charset=UTF-8");

        try {
            RequestParams requestParam = RequestParamsParse.parseRequestParam(request);
            // log.info("RequestParams:"+requestParam.getIp()+":"+requestParam);
            // 1：校验请求

            // 2：分发请求
            String method = requestParam.getParams().get(RequestParamsParse.METHOD);
            requestCommand = RequestCommandContainer.getInstance().get(method);
            ResponseParams res = requestCommand.execute(requestParam);
            // 3:返回结果

            //log.info("ResponseParams:"+requestParam.getIp()+" method:"+method+":"+res);
            IOUtils.write(JSON.toJSONString(res, SerializerFeature.WriteMapNullValue).getBytes("UTF-8"), response.getOutputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 跨域请求设置
     *
     * @param res
     */
    protected void setCrossDomain(HttpServletResponse res) {
        res.addHeader("Access-Control-Allow-Origin", "*");
        res.addHeader("Access-Control-Allow-Credentials", "true");
        res.addHeader("Access-Control-Allow-Headers", "X-Requested-With");
        res.addHeader("P3P", "CP=CURa ADMa DEVa PSAo PSDo OUR BUS UNI PUR INT DEM STA PRE COM NAV OTC NOI DSP COR");
    }
}
