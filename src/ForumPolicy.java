public class ForumPolicy {

    private Forum forum;
    private ComplaintsPolicy complaintsPolicy;
    private GuestPrivilegesPolicy guestPrivilegesPolicy;
    private ConfidentialityPolicy confidentialityPolicy;
    private SuspensionPolicy suspensionPolicy;
    private StaffExchangePolicy staffExchangePolicy;
    private SecurityPolicy securityPolicy;

    public ForumPolicy(Forum forum, ComplaintsPolicy complaintsPolicy, GuestPrivilegesPolicy guestPrivilegesPolicy,
                       ConfidentialityPolicy confidentialityPolicy, SuspensionPolicy suspensionPolicy,
                       StaffExchangePolicy staffExchangePolicy, SecurityPolicy securityPolicy) {
        this.forum = forum;
        this.complaintsPolicy = complaintsPolicy;
        this.guestPrivilegesPolicy = guestPrivilegesPolicy;
        this.confidentialityPolicy = confidentialityPolicy;
        this.suspensionPolicy = suspensionPolicy;
        this.staffExchangePolicy = staffExchangePolicy;
        this.securityPolicy = securityPolicy;
    }

    public Forum getForum() {
        return forum;
    }

    public void setForum(Forum forum) {
        this.forum = forum;
    }

    public ComplaintsPolicy getComplaintsPolicy() {
        return complaintsPolicy;
    }

    public void setComplaintsPolicy(ComplaintsPolicy complaintsPolicy) {
        this.complaintsPolicy = complaintsPolicy;
    }

    public GuestPrivilegesPolicy getGuestPrivilegesPolicy() {
        return guestPrivilegesPolicy;
    }

    public void setGuestPrivilegesPolicy(GuestPrivilegesPolicy guestPrivilegesPolicy) {
        this.guestPrivilegesPolicy = guestPrivilegesPolicy;
    }

    public ConfidentialityPolicy getConfidentialityPolicy() {
        return confidentialityPolicy;
    }

    public void setConfidentialityPolicy(ConfidentialityPolicy confidentialityPolicy) {
        this.confidentialityPolicy = confidentialityPolicy;
    }

    public SuspensionPolicy getSuspensionPolicy() {
        return suspensionPolicy;
    }

    public void setSuspensionPolicy(SuspensionPolicy suspensionPolicy) {
        this.suspensionPolicy = suspensionPolicy;
    }

    public StaffExchangePolicy getStaffExchangePolicy() {
        return staffExchangePolicy;
    }

    public void setStaffExchangePolicy(StaffExchangePolicy staffExchangePolicy) {
        this.staffExchangePolicy = staffExchangePolicy;
    }

    public SecurityPolicy getSecurityPolicy() {
        return securityPolicy;
    }

    public void setSecurityPolicy(SecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy;
    }
}