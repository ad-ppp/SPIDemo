package com.jacky.study.spi.demo.sp3;

import com.google.auto.service.AutoService;

/**
 * @author yangjianfei <a href="yangjianfei@tal.com">Contact me.</a>
 * @version 1.0
 */

@AutoService(IName.class)
public class Helen implements IName {
    @Override
    public String getName() {
        return "helen";
    }
}
