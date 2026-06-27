class PartyManager extends Component {
    int partyMemberCount;
    boolean partyInvitePending;

    void start() {
        partyMemberCount = 1;
        partyInvitePending = false;
    }

    void repeat() {
        // Party sync and invite flows depend on confirmed online services.
    }
}
