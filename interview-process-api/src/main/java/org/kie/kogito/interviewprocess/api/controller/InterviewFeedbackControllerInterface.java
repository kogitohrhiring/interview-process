package org.kie.kogito.interviewprocess.api.controller;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.kie.kogito.interviewprocess.api.dto.InterviewRoundDTO;
import org.kie.kogito.interviewprocess.api.dto.InterviewDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/interview-feedback")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RegisterRestClient
public interface InterviewFeedbackControllerInterface {

    @GET
    Response getOngoingInterviews(@QueryParam("interviewerId") int interviewerId);

    @POST
    Response createInterview(InterviewDTO interviewDTO);

    @GET
    @Path("interview-round")
    Response getInterviewRounds(@QueryParam("interviewId") int interviewId);

    @POST
    Response createInterviewRound(InterviewRoundDTO interviewRoundDTO);

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("interview-round")
    Response updateInterviewRound(InterviewRoundDTO interviewRoundDTO);
}
