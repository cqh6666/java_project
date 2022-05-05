package com.haige.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: com.haige.controller-> indexController
 * @description:
 * @author: cqh
 * @createDate: 2021-06-09 14:39
 * @version: 1.0
 * @todo:
 */
@RestController
public class IndexController {

    Logger logger = LogManager.getLogger(IndexController.class);

    @RequestMapping("/log")
    public String index(){
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "hello, this is logging test!";
    }

}
