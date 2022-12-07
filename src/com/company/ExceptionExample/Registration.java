package com.company.ExceptionExample;

public class Registration
{
    String name;
    long mobile;

    public void  reg(String name, long mobile) throws WrongNumberException {
        this.name = name;
        String m = ""+mobile;
        if(m.length()!=10)
        {
            WrongNumberException K=new WrongNumberException("Wrong mobile number as it must have-10 degits");
            throw K;
        }
        this.mobile=mobile;
    }

}
