require recipes-images/angstrom/console-image.bb

DEPENDS += "bash perl gcc i2c-tools \
"

IMAGE_FEATURES += "allow-empty-password"
IMAGE_FEATURES += "dev-pkgs tools-sdk"
IMAGE_INSTALL += "lrzsz ffmpeg bash perl gcc i2c-tools ethtool iperf	\
	net-tools nfs-utils-client portmap tcpdump gdbserver fpga-overlay wrfpgaddr westwell-config\
"

export IMAGE_BASENAME = "extended-console-image"


