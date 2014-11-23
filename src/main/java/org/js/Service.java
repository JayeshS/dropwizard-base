package org.js;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Service extends Application<AppConfig> {

    @Override
    public void initialize(Bootstrap bootstrap) {
    }

    @Override
    public void run(AppConfig configuration, Environment environment) throws Exception {
        environment.jersey().packages("org.js.web");
    }

    public static void main(String[] args) throws Exception {
        new Service().run(args);
    }
}
