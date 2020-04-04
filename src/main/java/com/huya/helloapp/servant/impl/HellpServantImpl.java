package com.huya.helloapp.servant.impl;


import com.huya.helloapp.servant.HelloServant;
import com.qq.tars.spring.annotation.TarsServant;

/**
 * @author saikei
 * @email lishiji@huya.com
 */
@TarsServant("HelloObj")
public class HellpServantImpl implements HelloServant {
    public String hello() {
        return "hello world";
    }

    public String sorry(){return "sorry world";}
}
