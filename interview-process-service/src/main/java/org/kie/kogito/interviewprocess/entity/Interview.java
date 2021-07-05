package org.kie.kogito.interviewprocess.entity;

import org.kie.kogito.interviewprocess.api.enums.InterviewStatus;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "interview")
public class Interview {

    // ------------------------------------------------------------------------
    // members
    // ------------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "interview_id")
    private int interviewId;

    @NotNull
    @Column(name = "job_id")
    private int jobId;

    @Column(name = "job_title")
    private String jobTitle;

    @NotNull
    @Column(name = "applicant_id")
    private int applicantId;

    @Column(name = "applicant_name")
    private String applicantName;

    @Column(name = "interviewer_id")
    private int interviewerId;

    @Column(name = "status")
    private InterviewStatus status;

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
        Interview interview = (Interview) o;
        return interviewId == interview.interviewId && jobId == interview.jobId && applicantId == interview.applicantId && interviewerId == interview.interviewerId && Objects.equals(jobTitle, interview.jobTitle) && Objects.equals(applicantName, interview.applicantName) && Objects.equals(status, interview.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interviewId, jobId, jobTitle, applicantId, applicantName, interviewerId, status);
    }

    @Override
    public String toString() {
        return "Interview{" +
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
