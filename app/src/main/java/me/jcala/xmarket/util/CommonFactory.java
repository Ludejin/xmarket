package me.jcala.xmarket.util;

import me.jcala.xmarket.conf.Api;
import me.jcala.xmarket.data.dto.Result;

/**
 * 保存常用单例的静态工厂
 */
public class CommonFactory {

    private Result<String> server_error=new Result<String>().api(Api.SERVRE_ERROR);

    private CommonFactory(){}
    private static class FactoryHolder{
       private static CommonFactory factory=new CommonFactory();
    }

    public static CommonFactory INSTANCE(){
        return FactoryHolder.factory;
    }

    public Result<String> server_error() {
        return server_error;
    }
}
