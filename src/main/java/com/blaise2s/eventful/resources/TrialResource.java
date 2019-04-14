package com.blaise2s.eventful.resources;

import com.blaise2s.eventful.api.Trial;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/trials")
public class TrialResource {

    private static final Trial TRIAL;
    private static final List<Trial> TRIALS;

    static {
        TRIAL = new Trial("Test object 'Trial' for project creation");
        TRIALS = new ArrayList<>();
        TRIALS.add(TRIAL);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTrial() {
        return Response.ok(TRIALS).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createTrial(Trial trial) {
        TRIALS.add(trial);
        return Response.ok(TRIALS).build();
    }

}
