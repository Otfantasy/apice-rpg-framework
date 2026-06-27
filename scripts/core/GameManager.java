class GameManager extends Component {
    String frameworkState;
    boolean multiplayerEnabled;

    void start() {
        frameworkState = "BOOTSTRAP";
        multiplayerEnabled = false;
    }

    void repeat() {
        // Reserve this loop for high-level game flow once engine integrations are confirmed.
    }
}
