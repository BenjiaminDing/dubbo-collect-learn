package com.tuling.vo;

import com.tuling.Car;
import org.apache.dubbo.common.Extension;
import org.apache.dubbo.common.URL;

@Extension("")
public class BlackCar implements Car {

    @Override
    public String getCarName(URL url ) {
        return "black";
    }

    @Override
    public String sayHell() {
        return null;
    }
}
