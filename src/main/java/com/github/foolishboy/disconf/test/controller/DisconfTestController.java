package com.github.foolishboy.disconf.test.controller;

import com.github.foolishboy.disconf.test.conf.SystemConf;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试disconf类
 *
 * @author foolishboy66
 * @date 2019-11-18 10:59
 */
@Slf4j
@RestController
@Api(value = "测试disconf接口", tags = "测试disconf接口")
@RequestMapping("/disconfTest")
public class DisconfTestController {

    @Value("${redis.host}")
    private String redisHost;

    @Autowired
    private SystemConf systemConf;

    @GetMapping("/testDisconf")
    @ApiOperation(value = "测试动态配置")
    public String testDisconf() {

        log.info("动态配置--hostName:{}", systemConf.getHostName());
        log.info("静态配置项--redisHost:{}", redisHost);

        return "ok, 动态配置--hostName:" + systemConf.getHostName() + "; 静态配置项--redisHost:" + redisHost;
    }
}
    