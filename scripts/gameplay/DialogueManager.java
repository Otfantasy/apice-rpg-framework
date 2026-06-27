class DialogueManager extends Component {
    boolean dialogueOpen;
    String activeDialogueId;

    void start() {
        dialogueOpen = false;
        activeDialogueId = "NONE";
    }

    void repeat() {
        // Dialogue branching should be data-driven after UI and NPC contracts are formalized.
    }
}
