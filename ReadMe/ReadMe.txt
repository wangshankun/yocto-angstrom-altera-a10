�ο����ӣ�
���룺    https://rocketboards.org/foswiki/view/Documentation/GSRDCompilingLinux
�������ɣ�https://rocketboards.org/foswiki/view/Documentation/A10GSRDCreatingAndUpdatingTheSDCard



1. ���û�������
   . ./env.sh

2. ����������Ŀ
   bitbake pcie-console-image

3. �����ļ�ϵͳ
   mkdir rootfs
   cd rootfs
   sudo tar xf ../pcie-console-image-arria10.tar.xz

4. �޸ĵ�������
   mv zzzz zImage
   mv dddd socfpga_arria10_socdk_sdmmc.dtb
   
5. ������������
sudo ./make_sdimage.py  \
  -f \
  -P uboot_w_dtb-mkpimage.bin,num=3,format=raw,size=10M,type=A2  \
  -P rootfs/*,num=2,format=ext3,size=1500M  \
  -P zImage,ghrd_10as066n2.core.rbf,ghrd_10as066n2.periph.rbf,socfpga_arria10_socdk_sdmmc.dtb,num=1,format=vfat,size=500M  \
  -s 2G  \
  -n sdimage.img
  
  
=============================================================
ֻ�����ںˣ�
bitbake linux-altera-ltsi -C compile
�����ںˣ�
bitbake linux-altera-ltsi -c menuconfig
ǿ���ر�pcie-console-image��
bitbake pcie-console-image -C compile
ֻ���� wrfpgaddr����ģ��
bitbake wrfpgaddr -C compile