import java.util.List;

public class Guide extends ForumMember {

    private int seniority;
    private List<SubForum> forums;

    public Guide(String name, SubForum forum) throws Exception {
        super(name);
        forums.add(forum);
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public List<SubForum> getForums() {
        return forums;
    }

    public void setForums(List<SubForum> forums) {
        this.forums = forums;
    }

    public Boolean alreadyGuide(int memeberId, int subForumId){
        return null;
    }

    public void createGuideTo(int memberId, int subForumId){}

    public void createGuideToSubForum(SubForum subForum, String adminName){}

    public  void getGuideSubForums(){}

}