package proxy.mybatisSample;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MybatisHandler implements InvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("connect DB");
        Select annotation = method.getAnnotation(Select.class);
        System.out.println(annotation.value()[0]);
        return null;
    }
}