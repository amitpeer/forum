import java.util.List;

public class Notification {

    private List<ForumMember> notificationRecipient;
    private Message notificationSource;

    public Notification(Message notificationSource) {
        this.notificationSource = notificationSource;
    }

    public List<ForumMember> getNotificationRecipient() {
        return notificationRecipient;
    }

    public void setNotificationRecipient(List<ForumMember> notificationRecipient) {
        this.notificationRecipient = notificationRecipient;
    }

    public Message getNotificationSource() {
        return notificationSource;
    }

    public void setNotificationSource(Message notificationSource) {
        this.notificationSource = notificationSource;
    }
}