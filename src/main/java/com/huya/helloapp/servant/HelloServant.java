package com.huya.helloapp.servant;


import com.qq.tars.protocol.annotation.Servant;

/**
 * @author saikei
 * @email lishiji@huya.com
 */
@Servant
public interface HelloServant {
    String hello();

    String sorry();
}
