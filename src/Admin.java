import java.util.List;

public class Admin extends ForumMember {

    private Forum manages;
    private Forum complaintSource;
    private Complaint complaint;
    private List<Report> reportList;

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

    public void addReportToAdmitList(Report report) { this.reportList.add(report); }

    public void sendToMail(Report report){}

    public void showOnScreen(Report report) {}

    public void showMessage(String message) {}


}