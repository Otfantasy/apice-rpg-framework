class DropManager extends Component {
    int pendingDropCount;
    boolean autoPickupEnabled;

    void start() {
        pendingDropCount = 0;
        autoPickupEnabled = false;
    }
}
