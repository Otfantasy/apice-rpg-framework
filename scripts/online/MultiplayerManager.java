class MultiplayerManager extends Component {
    boolean onlineModeEnabled;
    boolean sessionConnected;

    void start() {
        onlineModeEnabled = false;
        sessionConnected = false;
    }

    void repeat() {
        // Networking should remain disabled until official multiplayer APIs are confirmed.
    }
}
