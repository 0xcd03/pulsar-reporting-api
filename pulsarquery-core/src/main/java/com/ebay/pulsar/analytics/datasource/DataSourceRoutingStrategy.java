/*******************************************************************************
*  Copyright © 2012-2015 eBay Software Foundation
*  This program is dual licensed under the MIT and Apache 2.0 licenses.
*  Please see LICENSE for more information.
*******************************************************************************/
package com.ebay.pulsar.analytics.datasource;

/**
 * 
 * @author mingmwang
 *
 */
import com.ebay.pulsar.analytics.query.request.DateRange;

public interface DataSourceRoutingStrategy {
	public String getDataSourceName(String tableName, DateRange range, String molapName, String rtolapName);
}
