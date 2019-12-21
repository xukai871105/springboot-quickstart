package com.example.city;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class CityController {

    private static Logger log = LoggerFactory.getLogger(CityController.class);
    @Resource
    private CityMapper cityMapper;

    @RequestMapping(value = "/index")
    @ResponseBody
    public CityDO info() {
        log.info("info");
        return this.cityMapper.findByState("Jiangsu");
    }
}
