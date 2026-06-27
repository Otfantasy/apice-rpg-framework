class DropManager extends Component {
    int pendingDropCount;
    boolean autoPickupEnabled;

    void start() {
        pendingDropCount = 0;
        autoPickupEnabled = false;
    }

    void repeat() {
        // Drop spawning and pickup resolution depend on world/entity APIs still to be verified.
    }
}
