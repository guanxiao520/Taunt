package com.caryguan.taunt;

import com.intellij.openapi.components.ApplicationComponent;

/**
 * @Author GuanCary
 * @Date 2020/7/7 16:20
 * @Version 1.0
 **/
public class MyApplicationComponent implements ApplicationComponent {
    //ctrl o 复写方法
    @Override
    public void initComponent() {
        System.out.println("initComponent");
        TauntDialog tauntDialog = new TauntDialog();
        tauntDialog.show();
    }
}