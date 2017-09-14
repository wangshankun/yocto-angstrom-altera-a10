DESCRIPTION = "westwell config on altera A10"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit allarch systemd

SRC_URI = "file://eth0.network \
           file://westwell-config.service \
          "

do_compile() {
        :
}


do_install () {
        install -d ${D}${systemd_unitdir}/system
        install -d ${D}${systemd_unitdir}/../../etc/systemd/network/

        install -m 0744 ${WORKDIR}/eth0.network ${D}${systemd_unitdir}/../../etc/systemd/network/
        install -m 0744 ${WORKDIR}/westwell-config.service ${D}${systemd_unitdir}/system/
}

NATIVE_SYSTEMD_SUPPORT = "1"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "westwell-config.service"

FILES_${PN} += "${base_libdir}/systemd"

