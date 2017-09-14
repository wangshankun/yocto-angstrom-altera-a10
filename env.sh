#!/bin/sh
MPWD=$(pwd)
export PATH=$PATH:$MPWD
MACHINE=arria10 . ./setup-environment
sed -i '/meta-altera/a \ \ ${TOPDIR}\/sources\/meta-altera-refdes \\' conf/bblayers.conf
export KERNEL_PROVIDER=linux-altera-ltsi
export KERNEL_TAG=refs/tags/ACDS16.1_REL_GSRD_PR
export UBOOT_TAG=refs/tags/ACDS16.1_REL_GSRD_PR
BB_ENV_EXTRAWHITE="$BB_ENV_EXTRAWHITE KERNEL_TAG UBOOT_TAG KERNEL_PROVIDER"

