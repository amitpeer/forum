import java.util.List;

public class Message {

    private Discussion discussionStarter;
    private List<Message> replies;
    private Message repliesTo;
    private Notification messageNotification;
    private String content;
    private String title;
    private String subTopic;

    public Message(Discussion discussionStarter) {
        this.discussionStarter = discussionStarter;
    }

    public Discussion getDiscussionStarter() {
        return discussionStarter;
    }

    public void setDiscussionStarter(Discussion discussionStarter) {
        this.discussionStarter = discussionStarter;
    }

    public List<Message> getReplies() {
        return replies;
    }

    public void setReplies(List<Message> replies) {
        this.replies = replies;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTopic() {
        return subTopic;
    }

    public void setSubTopic(String subTopic) {
        this.subTopic = subTopic;
    }

    public Notification getMessageNotification() {
        return messageNotification;
    }

    public void setMessageNotification(Notification messageNotification) {
        this.messageNotification = messageNotification;
    }

    public Message getRepliesTo() {
        return repliesTo;
    }
}