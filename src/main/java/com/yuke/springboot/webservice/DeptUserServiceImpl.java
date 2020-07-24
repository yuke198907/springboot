package com.yuke.springboot.webservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@Slf4j
@Service
@WebService(
        endpointInterface = "com.yuke.springboot.webservice.DeptUserService",
        targetNamespace = "http://GetUserInfoService.com/"
)
public class DeptUserServiceImpl implements DeptUserService {

    @Override
    public String updateUserInfo(String model, String userInfo) {
        log.info("接受到更新数据updateUserInfo 开始");
        log.info("model = " +model + "   userInfo = " + userInfo);
        return "ok";
    }

    @Override
    public String updateDeptInfo(String model, String deptInfo) {
        log.info("deptInfo 开始");
        log.info("model = " +model + "   deptInfo = " + deptInfo);
        return "1";
    }
}
