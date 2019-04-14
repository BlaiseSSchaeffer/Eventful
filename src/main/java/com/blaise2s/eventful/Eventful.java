package com.blaise2s.eventful;

import com.blaise2s.eventful.resources.TrialResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Eventful extends Application<EventfulConfiguration> {

    public static void main(String[] args) throws Exception {
        new Eventful().run(args);
    }

        @Override
    public void initialize(Bootstrap<EventfulConfiguration> bootstrap) {
        super.initialize(bootstrap);
    }

    @Override
    public void run(EventfulConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new TrialResource());
    }
}
