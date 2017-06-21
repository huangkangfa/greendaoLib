package com.example.greendao;

import android.content.Context;

import com.example.greendao.dao.SqlCoffeeDao;

/**
 * Created by huangkangfa on 2017/6/19.
 */

public class SqlDaoManager {
    private  static SqlCoffeeDao coffeeManager;
    public  static Context context;

    public static void init(Context context){
        SqlDaoManager.context = context.getApplicationContext();
    }

    /**
     * 单列模式获取CustomerManager对象
     * @return
     */
    public static SqlCoffeeDao getSqlCoffeeDaoInstance(){
        if (coffeeManager == null) {
            coffeeManager = new SqlCoffeeDao(context);
        }
        return coffeeManager;
    }
}
