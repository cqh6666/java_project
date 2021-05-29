package com.haige.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @className: com.haige.listener-> OnlineCountListener
 * @description: 统计网站在线人数
 * @author: cqh
 * @createDate: 2021-05-29 17:09
 * @version: 1.0
 * @todo:
 */
public class OnlineCountListener implements HttpSessionListener {

    //创建session监听
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext context = se.getSession().getServletContext();
        Integer onlineCount = (Integer) context.getAttribute("onlineCount");

        if (onlineCount == null){
            onlineCount = new Integer(1);
        }else{
            int count = onlineCount.intValue();
            onlineCount = new Integer(count+1);
        }
        context.setAttribute("onlineCount",onlineCount);

    }
    //销毁
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext context = se.getSession().getServletContext();
        se.getSession().invalidate();
        Integer onlineCount = (Integer) context.getAttribute("onlineCount");

        if (onlineCount == null){
            onlineCount = new Integer(0);
        }else{
            int count = onlineCount.intValue();
            onlineCount = new Integer(count-1);
        }
        context.setAttribute("onlineCount",onlineCount);

    }




}
