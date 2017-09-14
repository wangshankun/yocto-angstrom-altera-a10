require recipes-images/angstrom/extended-console-image.bb

IMAGE_INSTALL += "iperf pciutils dmaxfer-altera fio"

export IMAGE_BASENAME = "pcie-console-image"

inherit core-image
