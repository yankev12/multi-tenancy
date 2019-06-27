package com.multitenancy.multitenancy.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import com.multitenancy.multitenancy.config.TenantContext;

public class MultitenantDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return TenantContext.getCurrentTenant();
    }
}
