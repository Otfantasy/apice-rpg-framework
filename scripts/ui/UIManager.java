class UIManager extends Component {
    String activeModalName;
    boolean hudVisible;

    void start() {
        activeModalName = "NONE";
        hudVisible = true;
    }

    void repeat() {
        // HUD refresh and modal transitions should be connected after UI APIs are confirmed.
    }
}
