public class Discussion {

    SubForum topicRelatedSubForum;
    Message firstMessage;
    String subTopic;

    public Discussion(SubForum topicRelatedSubForum) {
        this.topicRelatedSubForum = topicRelatedSubForum;
    }

    public SubForum getTopicRelatedSubForum() {
        return topicRelatedSubForum;
    }

    public void setTopicRelatedSubForum(SubForum topicRelatedSubForum) {
        this.topicRelatedSubForum = topicRelatedSubForum;
    }

    public String getSubTopic() {
        return subTopic;
    }

    public void setSubTopic(String subTopic) {
        this.subTopic = subTopic;
    }
}