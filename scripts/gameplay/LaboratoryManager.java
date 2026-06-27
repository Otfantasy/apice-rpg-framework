class LaboratoryManager extends Component {
    boolean laboratoryOpen;
    int queuedRecipes;

    void start() {
        laboratoryOpen = false;
        queuedRecipes = 0;
    }

    void repeat() {
        // Guardian creation and upgrades should wait for recipe data validation.
    }
}
