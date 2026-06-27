class EventSystem extends Component {
    String lastEventName;

    void start() {
        lastEventName = "NONE";
    }

    void repeat() {
        // Future event dispatch should remain lightweight and avoid undocumented APIs.
    }
}
