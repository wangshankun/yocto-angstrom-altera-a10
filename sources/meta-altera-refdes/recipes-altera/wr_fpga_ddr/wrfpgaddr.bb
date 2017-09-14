LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit module

SRC_URI = "file://${TOPDIR}/sources/meta-altera-refdes/recipes-altera/wr_fpga_ddr/Makefile \
            file://${TOPDIR}/sources/meta-altera-refdes/recipes-altera/wr_fpga_ddr/wr_fpga_ddr.c \
            file://${TOPDIR}/sources/meta-altera-refdes/recipes-altera/wr_fpga_ddr/wr_fpga_ddr.h \
"

PR = "r0"
PV = "0.1"

S = "${WORKDIR}/${TOPDIR}/sources/meta-altera-refdes/recipes-altera/wr_fpga_ddr"

