package com.codeforc.jmx;

import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import com.codeforc.model.User;
import java.lang.management.ManagementFactory;

public class UserMBeanDemo {

    public static void main(String[] args) throws MalformedObjectNameException {
        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        //为UserMXBean 定义 ObjectName
        ObjectName objectName = new ObjectName("");
        //创建UserBean实例
        User user = new User();
//        User user = new User();
//        platformMBeanServer.registerMBean(createUserMXBean(user), objectName);
    }

//    private static Object createUserMXBean(User user) {
//
//    }



}
