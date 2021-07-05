package org.kie.kogito.interviewprocess.api.dto;

import org.kie.kogito.interviewprocess.api.enums.InterviewStatus;

import java.util.Objects;

public class InterviewDTO {

    // ------------------------------------------------------------------------
    // members
    // ------------------------------------------------------------------------

    private int interviewId;

    private int jobId;

    private String jobTitle;

    private int applicantId;

    private String applicantName;

    private int interviewerId;

    private InterviewStatus status;

    // ------------------------------------------------------------------------
    // constructors
    // ------------------------------------------------------------------------

    public InterviewDTO() {
    }

    public InterviewDTO(int interviewId, int jobId, String jobTitle, int applicantId, String applicantName, int interviewerId, InterviewStatus status) {
        this.interviewId = interviewId;
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.applicantId = applicantId;
        this.applicantName = applicantName;
        this.interviewerId = interviewerId;
        this.status = status;
    }

    // ------------------------------------------------------------------------
    // getter/setters
    // ------------------------------------------------------------------------


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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public InterviewStatus getStatus() {
        return status;
    }

    public void setStatus(InterviewStatus status) {
        this.status = status;
    }

    public int getInterviewerId() {
        return interviewerId;
    }

    public void setInterviewerId(int interviewerId) {
        this.interviewerId = interviewerId;
    }

    // ------------------------------------------------------------------------
    // methods
    // ------------------------------------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterviewDTO that = (InterviewDTO) o;
        return interviewId == that.interviewId && jobId == that.jobId && applicantId == that.applicantId && interviewerId == that.interviewerId && Objects.equals(jobTitle, that.jobTitle) && Objects.equals(applicantName, that.applicantName) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interviewId, jobId, jobTitle, applicantId, applicantName, interviewerId, status);
    }

    @Override
    public String toString() {
        return "InterviewDTO{" +
                "interviewId=" + interviewId +
                ", jobId=" + jobId +
                ", jobTitle='" + jobTitle + '\'' +
                ", applicantId=" + applicantId +
                ", applicantName='" + applicantName + '\'' +
                ", interviewerId=" + interviewerId +
                ", status=" + status +
                '}';
    }
}
