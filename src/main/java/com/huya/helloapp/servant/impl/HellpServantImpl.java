package com.huya.helloapp.servant.impl;

import com.huya.taf.spring.annotation.TafServant;
import com.huya.helloapp.servant.HelloServant;

/**
 * @author saikei
 * @email lishiji@huya.com
 */
@TafServant("HelloObj")
public class HellpServantImpl implements HelloServant {
    public String hello() {
        return "hello world";
    }

    public String sorry(){return "sorry world";}
}
