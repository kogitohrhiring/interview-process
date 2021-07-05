package org.kie.kogito.interviewprocess.mapper;

import org.kie.kogito.interviewprocess.entity.Interview;
import org.kie.kogito.interviewprocess.entity.InterviewRound;
import org.kie.kogito.interviewprocess.api.dto.InterviewDTO;
import org.kie.kogito.interviewprocess.api.dto.InterviewRoundDTO;

import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.ArrayList;

@Mapper(componentModel = "cdi")
public interface InterviewMapper {

    public InterviewDTO toInterviewDTO(Interview interview);

    public Interview toInterview(InterviewDTO interviewDTO);

    public InterviewRoundDTO toInterviewRoundDTO(InterviewRound interviewRound);
    
    public InterviewRound toInterviewRound(InterviewRoundDTO interviewRound);

    public default Collection<InterviewRoundDTO> toInterviewRoundDTOs(Collection<InterviewRound> interviewRounds) {
        Collection<InterviewRoundDTO> interviewRoundDTOs = new ArrayList<InterviewRoundDTO>();
        for (InterviewRound interviewRound : interviewRounds) {
            interviewRoundDTOs.add(toInterviewRoundDTO(interviewRound));
        }
        return interviewRoundDTOs;
    }
}