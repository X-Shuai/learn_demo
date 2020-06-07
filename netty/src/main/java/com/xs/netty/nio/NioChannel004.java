package com.xs.netty.nio;

import java.nio.ByteBuffer;

/**
 * @program: learn_root
 * @description: 读取和写入
 * @author: xs-shuai.com
 * @create: 2020-06-07 22:07
 **/

public class NioChannel004 {
    public static void main(String[] args) {

        //创建一个 Buffer
        ByteBuffer buffer = ByteBuffer.allocate(64);
        //类型化方式放入数据
        buffer.putInt(100);
        buffer.putLong(9);
        buffer.putChar('尚');
        buffer.putShort((short) 4);
        //取出
        buffer.flip();
        System.out.println();
        System.out.println(buffer.getInt());
        System.out.println(buffer.getLong());
        System.out.println(buffer.getChar());
        System.out.println(buffer.getShort());
    }
}
