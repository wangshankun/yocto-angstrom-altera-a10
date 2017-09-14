参考链接：
编译：    https://rocketboards.org/foswiki/view/Documentation/GSRDCompilingLinux
镜像生成：https://rocketboards.org/foswiki/view/Documentation/A10GSRDCreatingAndUpdatingTheSDCard



1. 配置环境变量
   . ./env.sh

2. 编译整个项目
   bitbake pcie-console-image

3. 制作文件系统
   mkdir rootfs
   cd rootfs
   sudo tar xf ../pcie-console-image-arria10.tar.xz

4. 修改掉软连接
   mv zzzz zImage
   mv dddd socfpga_arria10_socdk_sdmmc.dtb
   
5. 制作整个镜像
sudo ./make_sdimage.py  \
  -f \
  -P uboot_w_dtb-mkpimage.bin,num=3,format=raw,size=10M,type=A2  \
  -P rootfs/*,num=2,format=ext3,size=1500M  \
  -P zImage,ghrd_10as066n2.core.rbf,ghrd_10as066n2.periph.rbf,socfpga_arria10_socdk_sdmmc.dtb,num=1,format=vfat,size=500M  \
  -s 2G  \
  -n sdimage.img
  
  
=============================================================
只编译内核：
bitbake linux-altera-ltsi -C compile
配置内核：
bitbake linux-altera-ltsi -c menuconfig
强制重编pcie-console-image：
bitbake pcie-console-image -C compile
只编译 wrfpgaddr驱动模块
bitbake wrfpgaddr -C compile