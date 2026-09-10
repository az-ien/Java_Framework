package com.iengineering.helper;

import java.time.Duration;


public class GlobalWaitTime {

    //Standard wait timeout
    public static Duration getIntWaitTime() {
        return Duration.ofSeconds(5);
    }

    // Short wait used for unexpected alerts
    public static Duration getShortWaitTime() {
        return Duration.ofSeconds(15);
    }

    // Extra long wait timeout used in some searches
    public static Duration getLongWaitTime() {
        return Duration.ofSeconds(30);
    }
}
