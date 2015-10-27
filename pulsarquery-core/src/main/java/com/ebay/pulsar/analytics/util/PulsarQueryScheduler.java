/*******************************************************************************
*  Copyright © 2012-2015 eBay Software Foundation
*  This program is dual licensed under the MIT and Apache 2.0 licenses.
*  Please see LICENSE for more information.
*******************************************************************************/
package com.ebay.pulsar.analytics.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

/**
 * 
 * @author mingmwang
 *
 */
public class PulsarQueryScheduler {
	private static ScheduledExecutorService scheduler = Executors
			.newScheduledThreadPool(1, new ThreadFactoryBuilder().setNameFormat("PulsarQueryScheduler").build());

	public static ScheduledExecutorService getScheduler() {
		return scheduler;
	}
}
