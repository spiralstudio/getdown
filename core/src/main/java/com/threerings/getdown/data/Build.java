//
// Getdown - application installer, patcher and launcher
// Copyright (C) 2004-2016 Getdown authors
// https://github.com/threerings/getdown/blob/master/LICENSE

package com.threerings.getdown.data;

import java.util.Arrays;
import java.util.List;

import com.threerings.getdown.util.StringUtil;

/**
 * Contains static data provided during the build process.
 */
public class Build {

    /** The date and time at which the code was built: in {@code yyyy-MM-dd HH:mm} format. */
    public static String time () {
        return "2022-12-13 20:26";
    }

    /** The Maven version of the Getdown project. */
    public static String version () {
        return "2.0.0";
    }

    /**
     * <p>The hosts which Getdown is allowed to communicate with. An empty list indicates that
     * no whitelist is configured and there are no limitations. By default, no host whitelist
     * is added to the binary, so it can be used to download and run applications from any
     * server.
     *
     * <p>To create a custom Getdown build that can only talk to whitelisted servers, set
     * the {@code getdown.host.whitelist} property on the command line while building the JAR
     * (e.g. {@code mvn package -Dgetdown.host.whitelist=my.server.com}). Wildcards can be used
     * (e.g. {@code *.mycompany.com}) and multiple values can be separated by commas
     * (e.g. {@code app1.foo.com,app2.bar.com,app3.baz.com}).
     */
    public static List<String> hostWhitelist () {
        return Arrays.asList(StringUtil.parseStringArray(""));
    }
}
