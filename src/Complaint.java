public class Complaint {
    private String content;
    private ForumMember complainer;
    private ForumMember complaintSubject;

    public Complaint(ForumMember complainer, ForumMember complaintSubject) {
        this.complainer = complainer;
        this.complaintSubject = complaintSubject;
    }

    public Complaint(String content, ForumMember complainer, ForumMember complainAt) {
        this.content = content;
        this.complainer = complainer;
        this.complaintSubject = complainAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ForumMember getComplaintSubject() {
        return complaintSubject;
    }

    public void setComplaintSubject(ForumMember complaintSubject) {
        this.complaintSubject = complaintSubject;
    }

    public ForumMember getComplainer() {
        return complainer;
    }

    public void setComplainer(ForumMember complainer) {
        this.complainer = complainer;
    }
}