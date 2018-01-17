package com.hlex.learn.testing;

public class SchoolService {

    public void register(String classId){
        if(classId==null) throw  new IllegalArgumentException("class id is null");
    }
}
