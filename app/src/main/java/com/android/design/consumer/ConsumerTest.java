package com.android.design.consumer;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.consumer
 * @ClassName: ConsumerTest
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 15:23
 */

/**
 * 定义与使用场景：生产者把数据放入缓冲区，而消费者从缓冲区取出数据。
 * 例子：缓冲区一般为队列（FIFO），但在生产消费较为频繁时，队列push，pop内存消耗较大，
 * 此时可以考虑环形缓冲区（以数组、链表方式实现）。
 * 通过互斥锁防止缓冲区同时读写。通过信号量控制缓冲区大小（满的时候不允许写，空的时候不允许读）
 */
public class ConsumerTest {
}
