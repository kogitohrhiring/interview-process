package org.kie.kogito.interviewprocess.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Parameters;
import org.kie.kogito.interviewprocess.entity.Interview;
import org.kie.kogito.interviewprocess.api.enums.InterviewStatus;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;

@ApplicationScoped
public class FeedbackRepository implements PanacheRepository<Interview> {

    public Collection<Interview> getOngoingInterviews(final int interviewerId) {
        return list("interviewer_id = :interviewerId and status = :status",
                Parameters.with("interviewerId", interviewerId).and("status", InterviewStatus.ACTIVE));
    }
}
