public class Admin extends ForumMember {

    private Forum manages;
    private Forum complaintSource;
    private Complaint complaint;

    public Admin(String name) throws Exception {
        super(name);
    }

    public Forum getManages() {
        return manages;
    }

    public void setManages(Forum manages) {
        this.manages = manages;
    }

    public Complaint getComplaint() {
        return complaint;
    }

    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }

    public Forum getComplaintSource() {
        return complaintSource;
    }

    public void setComplaintSource(Forum complaintSource) {
        this.complaintSource = complaintSource;
    }

    public  void promoteMemberToGuide(int memberId, int subForumId) {}

    public void createSubForum(int forumId, String subForumSubject, String adminName){}
}