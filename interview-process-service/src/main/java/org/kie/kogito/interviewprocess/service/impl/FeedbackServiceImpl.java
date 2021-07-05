package org.kie.kogito.interviewprocess.service.impl;

import org.kie.kogito.interviewprocess.entity.Interview;
import org.kie.kogito.interviewprocess.entity.InterviewRound;
import org.kie.kogito.interviewprocess.api.dto.InterviewRoundDTO;
import org.kie.kogito.interviewprocess.api.dto.InterviewDTO;
import org.kie.kogito.interviewprocess.mapper.InterviewMapper;
import org.kie.kogito.interviewprocess.repository.FeedbackRepository;
import org.kie.kogito.interviewprocess.repository.InterviewRoundRepository;
import org.kie.kogito.interviewprocess.service.FeedbackService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Collection;

@ApplicationScoped
public class FeedbackServiceImpl implements FeedbackService {

    @Inject
    FeedbackRepository feedbackRepository;

    @Inject
    InterviewRoundRepository interviewRoundRepository;

    @Inject
    InterviewMapper interviewMapper;

    @Override
    public Collection<Interview> getOngoingInterviews(final int interviewerId) {
        return feedbackRepository.getOngoingInterviews(interviewerId);
    }

    @Override
    public void createInterview(InterviewDTO interviewDTO) {
        feedbackRepository.persist(interviewMapper.toInterview(interviewDTO));
    }

    @Override
    public Collection<InterviewRoundDTO> getInterviewRounds(int interviewId) {
        return interviewMapper.toInterviewRoundDTOs(interviewRoundRepository.list("interview_id", interviewId));
    }

    @Override
    public void createInterviewRound(InterviewRoundDTO interviewRoundDTO) {
        interviewRoundRepository.persist(interviewMapper.toInterviewRound(interviewRoundDTO));
    }

    @Override
    public InterviewRound updateInterviewRound(InterviewRoundDTO interviewRoundDTO) {
        InterviewRound interviewRound = interviewMapper.toInterviewRound(interviewRoundDTO);
        interviewRoundRepository.persist(interviewRound);
        return interviewRound;
    }
}
