package org.kie.kogito.interviewprocess.controller;

import org.kie.kogito.interviewprocess.api.controller.InterviewFeedbackControllerInterface;
import org.kie.kogito.interviewprocess.entity.Interview;
import org.kie.kogito.interviewprocess.entity.InterviewRound;
import org.kie.kogito.interviewprocess.api.dto.InterviewRoundDTO;
import org.kie.kogito.interviewprocess.api.dto.InterviewDTO;
import org.kie.kogito.interviewprocess.service.FeedbackService;

import org.jboss.resteasy.annotations.jaxrs.QueryParam;
import org.jboss.logging.Logger;

import java.util.Collection;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/interview-feedback")
public class InterviewFeedbackController implements InterviewFeedbackControllerInterface {

    private static final Logger LOG = Logger.getLogger(InterviewFeedbackController.class);

    @Inject
    FeedbackService feedbackService;

    @Override
    public Response getOngoingInterviews(@QueryParam("interviewerId") int interviewerId) {
        LOG.info("interviewerId recieved via REST " + interviewerId);
        Collection<Interview> ongoingInterviews = feedbackService.getOngoingInterviews(interviewerId);
        return Response.ok(ongoingInterviews).build();
    }

    @Override
    public Response createInterview(InterviewDTO interviewDTO) {
        LOG.info("Create Interview request received " + interviewDTO.toString());
        feedbackService.createInterview(interviewDTO);
        return Response.ok().build();
    }

    @Override
    public Response getInterviewRounds(@QueryParam("interviewId") int interviewId) {
        LOG.info("interviewId recieved via REST " + interviewId);
        Collection<InterviewRoundDTO> interviewRoundDTOs = feedbackService.getInterviewRounds(interviewId);
        return Response.ok(interviewRoundDTOs).build();
    }

    @Override
    public Response createInterviewRound(InterviewRoundDTO interviewRoundDTO) {
        LOG.info("Create InterviewRound request received " + interviewRoundDTO.toString());
        feedbackService.createInterviewRound(interviewRoundDTO);
        return Response.ok().build();
    }

    @Override
    public Response updateInterviewRound(InterviewRoundDTO interviewRoundDTO) {
        LOG.info("InterviewRoundDTO recieved via REST " + interviewRoundDTO.toString());
        InterviewRound interviewRound = feedbackService.updateInterviewRound(interviewRoundDTO);
        return Response.ok(interviewRound).build();
    }
}
