package com.haige.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @className: com.haige.service-> ScheduledService
 * @description:
 * @author: cqh
 * @createDate: 2021-06-17 14:39
 * @version: 1.0
 * @todo:
 */

@Service
public class ScheduledService {

    // 在特定时间执行 ( 秒 分 时 日 月 周）
    @Scheduled(cron = "0 48 14 * * 0-7")
    public void hello(){
        System.out.println("你被执行了！");
    }

}
