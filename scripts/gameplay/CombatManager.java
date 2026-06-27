class CombatManager extends Component {
    boolean combatActive;
    int encounterCount;

    void start() {
        combatActive = false;
        encounterCount = 0;
    }

    void repeat() {
        // Combat resolution is deferred until hit detection and damage APIs are validated.
    }
}
