package com.haige.demo01;

/**
 * @className: com.haige-> Proxy
 * @description: 中介
 * @author: cqh
 * @createDate: 2021-05-27 15:13
 * @version: 1.0
 * @todo:
 */
public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    public void rent() {
        seeHouse();
        host.rent();
        frae();

    }

    public void seeHouse(){
        System.out.println("中介带你看房子");
    }
    public void frae(){
        System.out.println("中介要收点费用");
    }
}
