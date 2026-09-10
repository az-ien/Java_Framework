package com.iengineering.helper;

import com.google.common.base.Stopwatch;

public class TransactionTimer {
	
	public static void Start(Stopwatch stopwatch)
    {
        stopwatch.reset();
        stopwatch.start();
    }
	
	public static void Stop(Stopwatch stopwatch, String strProcessName)
    {
        stopwatch.stop();

        // Writing to debug window
        System.out.println(strProcessName + " Time elapsed: {0:hh\\:mm\\:ss}" + stopwatch.elapsed());

        // Writing to Test Window will be viewable at end to test execution
        System.out.println(strProcessName + " Time elapsed: {0:hh\\:mm\\:ss}" + stopwatch.elapsed());
    }

}
