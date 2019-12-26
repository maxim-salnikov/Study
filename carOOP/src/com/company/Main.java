package com.company;

import s.GSMTel;
import s.ITel;
import s.Smart;
import s.Tel;

public class Main {

    public static void main(String[] args) {
        ITel oldPhone = new Tel();
        ITel gsmPhone = new GSMTel();
        ITel smartPhone = new Smart();

        oldPhone.call();


        gsmPhone.call();
        smartPhone.call();
//        smartPhone.pause();

    }
}
