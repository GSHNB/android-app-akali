package com.nsxz.akali.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoshun on 2019/4/2.
 */

public class Dog {
    List<? super String> strlist=new ArrayList<>();
    List<? extends Dog> strlist2=new ArrayList<>();
    List<Object> objlist=new ArrayList<>();

    public void main(){
        objlist.addAll(strlist);
        objlist.add("");
        Object obj=strlist.get(1);

//        strlist2.add(new dog());
//        strlist.set()
        strlist.add("");
        Object s=strlist.get(1);
        strlist.add("");
//        strlist.add(new Object());
    }


    class dog extends Dog{}
}
