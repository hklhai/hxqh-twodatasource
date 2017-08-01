package com.hxqh.twodatasource;

import ch.qos.logback.core.joran.conditional.ElseAction;
import com.hxqh.twodatasource.pojo.GroupNode;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Ocean lin on 2017/7/27.
 */
public class ThreadTest {

    public static void main(String args[]) {


//        //根据最大值与最小值 分组数返回List
//        List<GroupNode> groupNodes = groupNode(new BigDecimal(10095343), new BigDecimal(10357484), 10000);
//        for (int i = 0; i < groupNodes.size(); i++) {
//            System.out.println(groupNodes.get(i));
//        }
//
//    }
//
//    private static List<GroupNode> groupNode(BigDecimal start, BigDecimal end, int count) {
//        List<GroupNode> groupNodes = new LinkedList<>();
//
//        BigDecimal subtract = end.subtract(start).add(new BigDecimal(1));
//        Integer size = subtract.intValue();
//        Integer num = (size) % count == 0 ? (size / count) : (size / count + 1);
//
//        for (int j = 0; j < num; j++) {
//            int i = j + 1;
//            if (i == 1 || i == num) {
//                start = BigDecimal.valueOf((i - 1) * count).add(new BigDecimal(1));
//                end = BigDecimal.valueOf((i * count) > size ? size : (i * count));
//                groupNodes.add(new GroupNode(start, end));
//            } else {
//                start = BigDecimal.valueOf((i - 1) * count);
//                end = BigDecimal.valueOf((i * count) > size ? size : (i * count));
//                groupNodes.add(new GroupNode(start.add(new BigDecimal(1)), end));
//            }
//        }
//        return groupNodes;
    }


}

