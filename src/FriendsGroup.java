import java.util.List;

public class FriendsGroup {

    private List<ForumMember> forumMembers;

    public FriendsGroup(List<ForumMember> forumMembers) throws Exception {
        if (forumMembers.size() < 2) {
            throw new Exception("Must have at least 2 members");
        }
        this.forumMembers = forumMembers;
    }

    public List<ForumMember> getForumMembers() {
        return forumMembers;
    }

    public void setForumMembers(List<ForumMember> forumMembers) throws Exception {
        if (forumMembers.size() < 2) {
            throw new Exception("Must have at least 2 members");
        }
        this.forumMembers = forumMembers;
    }
}