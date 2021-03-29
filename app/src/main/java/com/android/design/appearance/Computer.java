package com.android.design.appearance;

import com.android.design.util.PrintUtil;

/**
 * @ProjectName: android_design
 * @Package: com.android.design.appearance
 * @ClassName: Computer
 * @Author: 1984629668@qq.com
 * @CreateDate: 2021/3/29 15:14
 */
public class Computer {
    //是组合，而非继承。这是与工程模式的显著区别。
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void startup() {
        PrintUtil.print("start the computer...");
        cpu.startup();
        memory.startup();
        disk.startup();
        PrintUtil.print("start computer finished...");
    }

    public void shutdown() {
        PrintUtil.print("begin to close the computer...");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        PrintUtil.print("computer closed...");
    }
}
