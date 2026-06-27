class GameManager extends Component {
    String frameworkState;
    boolean multiplayerEnabled;

    void start() {
        frameworkState = "BOOTSTRAP";
        multiplayerEnabled = false;
    }
}
