/*
 * =================================================
 * Copyright 2021 tagtraum industries incorporated
 * All rights reserved.
 * =================================================
 */
package com.tagtraum.macos.finder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * TestApplication.
 *
 * @author <a href="mailto:hs@tagtraum.com">Hendrik Schreiber</a>
 */
public class TestApplication {

    @Test
    public void testVersion() {
        final Application application = Application.getInstance();
        final String version = application.getVersion();
        assertNotNull(version);
        assertFalse(version.trim().isEmpty());
    }

    @Test
    public void testShowStartupDisk() {
        final Application application = Application.getInstance();
        final Disk startupDisk = application.getStartupDisk();
        System.out.println("Startup Disk: " + startupDisk.getName() + ", Format: " + startupDisk.getFormat());
    }

}
