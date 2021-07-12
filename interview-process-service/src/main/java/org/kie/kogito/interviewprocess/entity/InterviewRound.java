package org.kie.kogito.interviewprocess.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "interview_round")
public class InterviewRound {

    // ------------------------------------------------------------------------
    // members
    // ------------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "interview_round_id")
    private int interviewRoundId;

    @Column(name = "interview_id")
    private int interviewId;

    @Column(name = "job_id")
    private int jobId;

    @Column(name = "interview_round_name")
    private String interviewRoundName;

    @Column(name = "interviewer_id")
    private String interviewerId;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "feedback_summary")
    private String feedbackSummary;

    // ------------------------------------------------------------------------
    // constructors
    // ------------------------------------------------------------------------

    public InterviewRound() {
    }

    public InterviewRound(int interviewRoundId, int interviewId, int jobId, String interviewRoundName, String interviewerId, Integer rating, String feedbackSummary) {
        this.interviewRoundId = interviewRoundId;
        this.interviewId = interviewId;
        this.jobId = jobId;
        this.interviewRoundName = interviewRoundName;
        this.interviewerId = interviewerId;
        this.rating = rating;
        this.feedbackSummary = feedbackSummary;
    }

    // ------------------------------------------------------------------------
    // methods
    // ------------------------------------------------------------------------

    public int getInterviewRoundId() {
        return interviewRoundId;
    }

    public void setInterviewRoundId(int interviewRoundId) {
        this.interviewRoundId = interviewRoundId;
    }

    public int getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(int interviewId) {
        this.interviewId = interviewId;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getInterviewRoundName() {
        return interviewRoundName;
    }

    public void setInterviewRoundName(String interviewRoundName) {
        this.interviewRoundName = interviewRoundName;
    }

    public String getInterviewerId() {
        return interviewerId;
    }

    public void setInterviewerId(String interviewerId) {
        this.interviewerId = interviewerId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getFeedbackSummary() {
        return feedbackSummary;
    }

    public void setFeedbackSummary(String feedbackSummary) {
        this.feedbackSummary = feedbackSummary;
    }

    // ------------------------------------------------------------------------
    // methods
    // ------------------------------------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterviewRound that = (InterviewRound) o;
        return interviewRoundId == that.interviewRoundId && interviewId == that.interviewId && jobId == that.jobId && rating == that.rating && Objects.equals(interviewRoundName, that.interviewRoundName) && Objects.equals(interviewerId, that.interviewerId) && Objects.equals(feedbackSummary, that.feedbackSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interviewRoundId, interviewId, jobId, interviewRoundName, interviewerId, rating, feedbackSummary);
    }

    @Override
    public String toString() {
        return "InterviewRoundDTO{" +
                "interviewRoundId=" + interviewRoundId +
                ", interviewId=" + interviewId +
                ", jobId=" + jobId +
                ", interviewRoundName='" + interviewRoundName + '\'' +
                ", interviewerId='" + interviewerId + '\'' +
                ", rating=" + rating +
                ", feedbackSummary='" + feedbackSummary + '\'' +
                '}';
    }
}
