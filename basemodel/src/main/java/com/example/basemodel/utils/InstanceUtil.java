package com.example.basemodel.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by Administrator on 2018/1/24.
 */

public class InstanceUtil {

    private final static String TAG=InstanceUtil.class.getSimpleName();

    /**
     * 通过实例工厂去实例化相应类
     *
     * @param o   带泛型的对象
     * @param i   需要实例化的对象在泛型中的位置
     * @param <T> 返回实例的泛型类型
     * @return
     */

    public static <T> T getInstance(Object o, int i) {
        if (o.getClass().getGenericSuperclass() instanceof ParameterizedType) {
            Type[] types = ((ParameterizedType) o.getClass().getGenericSuperclass()).getActualTypeArguments();
            if (types.length > 0) {
                Class mClass = (Class<T>) types[i];
                return getInstance(mClass);
            }

        }
        return null;
    }

    /**
     * 通过实例工厂去实例化相应类
     *
     * @param <T> 返回实例的泛型类型
     * @return
     */

    public static <T> T getInstance(Class clazz) {
        try {
            return (T) clazz.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
            LogUtil.e(TAG, e.getMessage());
        }

        return null;
    }

}
