class ChatManager extends Component {
    boolean chatVisible;
    int unreadMessages;

    void start() {
        chatVisible = true;
        unreadMessages = 0;
    }

    void repeat() {
        // Text chat transport and moderation hooks are planned for a later phase.
    }
}
