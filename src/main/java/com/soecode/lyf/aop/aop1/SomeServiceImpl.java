package com.soecode.lyf.aop.aop1;

public class SomeServiceImpl implements  ISomeService{

    @Override
    public void doOther() {
        System.out.println("SomeServiceImpl.doOther()");
    }

    @Override
    public void doSome() {
        System.out.println("SomeServiceImpl.doSome()");
    }
}
