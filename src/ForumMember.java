import java.util.HashSet;
import java.util.List;

public class ForumMember {

    private static final HashSet<String> NAMES = new HashSet<>();
    private String name;
    private String password;
    private Status isActive;
    private LoggedIn isLoggedIn;
    private Forum forum;
    private List<ForumMember> friends;
    private List<FriendsGroup> groupMembers;
    private Notification notification;
    private List<Complaint> complaints;

    public ForumMember(String name) throws Exception {
        if (!checkAndAddName(name)) {
            throw new Exception("User name already taken");
        }
        this.name = name;
    }

    public List<ForumMember> getFriends() {
        return friends;
    }

    public void setFriends(List<ForumMember> friends) {
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (!checkAndAddName(name)) {
            throw new Exception("User name already taken");
        }
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getIsActive() {
        return isActive;
    }

    public void setIsActive(Status isActive) {
        this.isActive = isActive;
    }

    public LoggedIn getIsLoggedIn() {
        return isLoggedIn;
    }

    public void setIsLoggedIn(LoggedIn isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public Forum getManages() {
        return forum;
    }

    public void setManages(Forum manages) {
        this.forum = manages;
    }

    public List<FriendsGroup> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<FriendsGroup> groupMembers) {
        this.groupMembers = groupMembers;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public List<Complaint> getComplaints() {
        return complaints;
    }

    public void setComplaints(List<Complaint> complaints) {
        this.complaints = complaints;
    }

    private boolean checkAndAddName(String name) {
        return NAMES.add(name);
    }

    public void sendPrivateMessage(PrivateMessage privateMessage){}
}

enum Status {
    ACTIVE("active"),
    NOT_ACTIVE("notActive");
    private final String field;

    Status(String field) {
        this.field = field;
    }

    public String value() {
        return field;
    }
}

enum LoggedIn {
    LOGGED_IN("loggedIn"),
    LOGGED_OUT("loggedOut");
    private final String field;

    LoggedIn(String field) {
        this.field = field;
    }

    public String value() {
        return field;
    }
}

