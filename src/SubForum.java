import java.util.List;

public class SubForum {

    private Forum forum;
    private String topic;
    private List<Guide> guides;
    private List<Discussion> discussions;
    private int subForumId;

    public SubForum(Forum forum, Guide guide) {
        this.forum = forum;
        guides.add(guide);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<Guide> getGuides() {
        return guides;
    }

    public void setGuides(List<Guide> guides) {
        this.guides = guides;
    }

    public Forum getForum() {
        return forum;
    }

    public void setForum(Forum forum) {
        this.forum = forum;
    }

    public List<Discussion> getDiscussions() {
        return discussions;
    }

    public void setDiscussions(List<Discussion> discussions) {
        this.discussions = discussions;
    }

    public void addGuide(Guide guide, int subForumId) {
    }

    public Boolean isSubjectTaken(int forumId, String subForumSubject) {
        return null;
    }

    public void createSubForum(int forumId, String subForumSubject, String adminName){}

    public void deleteGuideFromGuideList(Guide guide){}
}