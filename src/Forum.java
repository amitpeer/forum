import java.util.List;

public class Forum {

    private ActionLogger actionLogger;
    private ErrorLogger errorLogger;
    private List<ForumMember> forumMembers;
    private List<Admin> admins;
    private List<SubForum> subForums;
    private Admin complaintHandler;
    private ForumPolicy forumPolicy;
    private int forumId;

    private String systemMessage="";

    public Forum(ActionLogger actionLogger, ErrorLogger errorLogger, Admin admin, ForumPolicy forumPolicy, int
            forumId) {
        this.actionLogger = actionLogger;
        this.errorLogger = errorLogger;
        admins.add(admin);
        this.forumPolicy = forumPolicy;
        this.forumId = forumId;
    }

    public ForumPolicy getForumPolicy() {
        return forumPolicy;
    }

    public void setForumPolicy(ForumPolicy forumPolicy) {
        this.forumPolicy = forumPolicy;
    }

    public ActionLogger getActionLogger() {
        return actionLogger;
    }

    public void setActionLogger(ActionLogger actionLogger) {
        this.actionLogger = actionLogger;
    }

    public ErrorLogger getErrorLogger() {
        return errorLogger;
    }

    public void setErrorLogger(ErrorLogger errorLogger) {
        this.errorLogger = errorLogger;
    }

    public List<ForumMember> getForumMembers() {
        return forumMembers;
    }

    public void setForumMembers(List<ForumMember> forumMembers) {
        this.forumMembers = forumMembers;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }

    public Admin getComplaintHandler() {
        return complaintHandler;
    }

    public void setComplaintHandler(Admin complaintHandler) {
        this.complaintHandler = complaintHandler;
    }

    public int getForumId() {
        return forumId;
    }

    public void setForumId(int forumId) {
        this.forumId = forumId;
    }

    public List<SubForum> getSubForums() {
        return subForums;
    }

    public void setSubForums(List<SubForum> subForums) {
        this.subForums = subForums;
    }

    public void addSubForumToForum(SubForum subForum){}

    public void createReport(String reportID,Admin admin) {Report report= new Report(reportID);
    admin.addReportToAdmitList(report);}

    private void sendTo(boolean sendToMail, boolean showOnScreen) {}

    public void cancelGuide(Guide guide,Admin admin){}

    public void cancelGuideMessage(Admin admin , ForumMember forumMember, PrivateMessage message) {}

    public void removeUserFromList(ForumMember forumMember) {this.forumMembers.remove(forumMember); }

    public void addUserToUsersList(ForumMember forumMembe) { this.forumMembers.add(forumMembe);}

    public String chainCancelMessage(String message) {return systemMessage+message; }



}