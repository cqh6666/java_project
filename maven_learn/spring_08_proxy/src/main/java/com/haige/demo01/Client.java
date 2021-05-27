package com.haige.demo01;

/**
 * @className: com.haige-> Client
 * @description: 租客
 * @author: cqh
 * @createDate: 2021-05-27 15:13
 * @version: 1.0
 * @todo:
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
