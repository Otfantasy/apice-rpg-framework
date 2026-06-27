class PlayerSkillManager extends Component {
    int equippedSkillSlots;
    boolean ultimateReady;

    void start() {
        equippedSkillSlots = 3;
        ultimateReady = false;
    }

    void repeat() {
        // Skill cooldowns and casting should be connected once animation/input hooks are known.
    }
}
