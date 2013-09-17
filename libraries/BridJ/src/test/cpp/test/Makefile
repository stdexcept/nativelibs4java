# Requires the following variables:
# OS, ARCH, CONFIG, DYNCALL_HOME, OBJ_DIR, OUT_DIR

SHARED_LIB	 = test

UNITS += test
UNITS += structs
UNITS += templates

ifeq ($(OS), darwin)
UNITS += objctest
CPPFLAGS	+=	-I/System/Library/Frameworks/JavaVM.framework/Versions/Current/Headers/
#LDFLAGS		+= -lobjc
LDFLAGS		+= -framework Foundation
LDFLAGS		+= -install_name @rpath/libtest.dylib
endif

ifeq ($(OS), sunos)
# http://gcc.gnu.org/onlinedocs/gcc/Solaris-2-Options.html
CPPFLAGS  += -fno-stack-protector -funsafe-loop-optimizations
CPPFLAGS	+=	-D__EXTENSIONS__
LDFLAGS		+= 	-mimpure-text
LDFLAGS		+=	-L/opt/csw/gcc4/lib
endif

ifeq ($(OS), windows)
CPPFLAGS	+=	"-IC:\Program Files\Microsoft SDKs\Windows\v6.0A\Include"
endif

ifdef BUILD_OS_darwin
endif

LDFLAGS   += -l stdc++

include ../../../main/cpp/bridj/epilog.make