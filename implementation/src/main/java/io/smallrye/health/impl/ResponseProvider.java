package io.smallrye.health.impl;

import org.eclipse.microprofile.health.HealthCheckResponseBuilder;
import org.eclipse.microprofile.health.spi.HealthCheckResponseProvider;

public class ResponseProvider implements HealthCheckResponseProvider {

    @Override
    public HealthCheckResponseBuilder createResponseBuilder() {
        return new ResponseBuilder();
    }
}
