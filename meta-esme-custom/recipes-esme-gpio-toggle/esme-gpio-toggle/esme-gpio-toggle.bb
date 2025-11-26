# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

# No information for SRC_URI yet (only an external source tree was specified)
SRC_URI = "git://github.com/AUDOU/yocto-toggle.git;protocol=https;branch=master \
          "
#file://0001-Prepare-workspace-for-devtool-finish.patch \
#"

#SRCREV = "13e2454f7a03c927d7f83db5f42f024ce2399959"
SRCREV= "e6cb208abd5d38d1b64dc955d217c318f50d4451"

inherit pkgconfig

DEPENDS += "libgpiod (<2.0)"

# Ajouter la classe update-rc.d
inherit update-rc.d

# Nom du script d'init et options
INITSCRIPT_NAME = "esme-gpio-toggle"
INITSCRIPT_PARAMS = "defaults 99"

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

do_configure () {
	# Specify any needed configure commands here
	:
        
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake 
}

do_install () {
	# This is a guess; additional arguments may be required
        oe_runmake install INSTALL_DIR=${D}
        
}

