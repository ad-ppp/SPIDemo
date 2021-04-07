package com.jacky.study.spi.demo.spi1;

/**
 * @author yangjianfei <a href="yangjianfei@tal.com">Contact me.</a>
 * @version 1.0
 */
public class Hello1 implements IHello {

    @Override
    public String sayHello() {
        return "hello jacky1";
    }
}
