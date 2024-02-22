package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {
    private String user;
    private String topic;
	// message sent from client to create topic on the broker

    public DeleteTopicMsg(String user, String topic) {
        super(MessageType.DELETETOPIC, user);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public String getUser() {
        return user;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "DeleteTopicMsg{" +
                "user='" + user + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
    // TODO:
	// Implement object variables - a topic is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text

}
