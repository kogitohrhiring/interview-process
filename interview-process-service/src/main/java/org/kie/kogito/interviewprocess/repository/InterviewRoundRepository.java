package org.kie.kogito.interviewprocess.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import org.kie.kogito.interviewprocess.entity.InterviewRound;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InterviewRoundRepository implements PanacheRepository<InterviewRound> {
}
