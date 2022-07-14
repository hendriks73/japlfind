[![LGPL 2.1](https://img.shields.io/badge/License-LGPL_2.1-blue.svg)](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.tagtraum/japlfind/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.tagtraum/japlfind)
[![Build and Test](https://github.com/japlscript/japlfind/workflows/Build%20and%20Test/badge.svg)](https://github.com/japlscript/japlfind/actions)


# Japlfind

*Japlfind* is a Java API for the Apple Finder app (macOS) based on
[JaplScript](https://github.com/japlscript/japlscript).


## Installation

Japlfind is released via [Maven](https://maven.apache.org).
You can install it via the following dependency:

```xml
<dependency>
    <groupId>com.tagtraum</groupId>
    <artifactId>japlfind</artifactId>
</dependency>
```

The Maven artifacts also contain sources and javadocs. 

If you are using [modules](https://en.wikipedia.org/wiki/Java_Platform_Module_System),
its name is `tagtraum.japlfind`.


## Usage
                           
To use the generated code, do something like this:

```java
import com.tagtraum.macos.finder.Application;

public class StartupDisk {

    public static void main(final String[] args) {
        // get application
        final Application application = Application.getInstance();
        final Disk startupDisk = application.getStartupDisk();
        System.out.println("Startup Disk: " + startupDisk.getName() + ", Format: " + startupDisk.getFormat());
    }
}
```

## API

You can find the complete [API here](https://japlscript.github.io/japlfind/com/tagtraum/macos/finder/package-summary.html). 


## Shipping

For information about shipping apps with this library, please see
the corresponding notes about signing, notarization etc. in the
[JaplScript documentation](https://github.com/japlscript/japlscript/blob/main/README.md).
