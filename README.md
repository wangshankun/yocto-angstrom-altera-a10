# yocto-angstrom-altera-a10

##目前修改内容：

###增加fpga通过DMA读写arm侧ddr4的驱动

#### 路径sources/meta-altera-refdes/recipes-altera/wr\_fpga\_ddr/
 * dma驱动发送接收并相应中断的例子
 * 实现自己uio的例子(包含了寄存器映射，中断epoll，dma buffer)
 * 个使用C语言宏分割功能，节省代码的例子
 * yocto添加自定义驱动的例子
 
#### 路径sources/meta-altera/recipes-kernel/linux/linux-altera.inc
 * yocto中使用自定义device tree(设备树)的例子

#### 路径sources/meta-altera-refdes/recipes-images/angstrom
 * 在yocto编译的目标版增加开发工具集比如gcc的功能()
 
   IMAGE\_FEATURES += "dev-pkgs tools-sdk"并且inherit core-image

 * 在yocto编译的目标版增加lrzsz ffmpeg iperf工具

#### 路径sources/meta-altera-refdes/recipes-altera/westwell\_config
 * systemd配置静态ip地址的功能(eth0.network)
 * yocto中增加systemd service的功能(类似原来的启动脚本)

#### 路径sources/meta-angstrom/recipes-images/angstrom
 * 去掉CONMANPKGS组件，因为connman server会执行udhcpc，自动配置ip地址

#### 其他文件为方便编译和镜像生成的工具
