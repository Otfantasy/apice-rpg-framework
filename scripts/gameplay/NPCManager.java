class NPCManager extends Component {
    int activeNpcCount;
    String focusedNpcId;

    void start() {
        activeNpcCount = 0;
        focusedNpcId = "NONE";
    }

    void repeat() {
        // NPC interaction hooks depend on confirmed spawn and trigger APIs.
    }
}
