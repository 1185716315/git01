package com.yjxxt.crm.utlis;


import com.yjxxt.crm.exception.ParamsException;

public class AssertUtil {


    public  static void isTrue(Boolean flag,String msg){
        if(flag){
            throw  new ParamsException(msg);
        }
    }

}
