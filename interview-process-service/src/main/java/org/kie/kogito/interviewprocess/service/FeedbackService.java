package org.kie.kogito.interviewprocess.service;

import org.kie.kogito.interviewprocess.entity.Interview;
import org.kie.kogito.interviewprocess.entity.InterviewRound;
import org.kie.kogito.interviewprocess.api.dto.InterviewRoundDTO;
import org.kie.kogito.interviewprocess.api.dto.InterviewDTO;

import java.util.Collection;

public interface FeedbackService {

    Collection<Interview> getOngoingInterviews(int interviewerId);

    void createInterview(InterviewDTO interviewDTO);

    Collection<InterviewRoundDTO> getInterviewRounds(int interviewId);

    void createInterviewRound(InterviewRoundDTO interviewRoundDTO);

    InterviewRound updateInterviewRound(InterviewRoundDTO interviewRound);
}
