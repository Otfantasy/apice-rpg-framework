class UIManagerValidation extends Component {
    boolean hudVisible;
    String currentModal;
    boolean modalOpen;
    boolean notificationsEnabled;
    String lastNotification;
    boolean modalValidationPassed;
    boolean hudValidationPassed;
    boolean notificationValidationPassed;
    boolean overallValidationPassed;
    String validationSummary;

    void start() {
        resetState();

        simulateOpenModal("Inventory");
        boolean firstModalOpened = modalOpen && currentModal.equals("Inventory");

        simulateOpenModal("Quest");
        boolean modalReplacementWorked = modalOpen && currentModal.equals("Quest");

        simulateOpenModal("   ");
        boolean invalidModalIgnored = currentModal.equals("Quest");

        simulateCloseModal();
        boolean closeModalWorked = !modalOpen && currentModal.equals("");

        simulateOpenModal("Settings");
        simulateCloseAllModals();
        boolean closeAllModalsWorked = !modalOpen && currentModal.equals("");

        modalValidationPassed =
            firstModalOpened &&
            modalReplacementWorked &&
            invalidModalIgnored &&
            closeModalWorked &&
            closeAllModalsWorked;

        simulateHideHUD();
        boolean hideHudWorked = !hudVisible;

        simulateShowHUD();
        boolean showHudWorked = hudVisible;

        hudValidationPassed = hideHudWorked && showHudWorked;

        simulateShowNotification("Welcome");
        boolean firstNotificationWorked = lastNotification.equals("Welcome");

        simulateShowNotification("   ");
        boolean invalidNotificationIgnored = lastNotification.equals("Welcome");

        simulateClearNotifications();
        boolean clearNotificationsWorked = lastNotification.equals("");

        notificationValidationPassed =
            firstNotificationWorked &&
            invalidNotificationIgnored &&
            clearNotificationsWorked;

        overallValidationPassed =
            modalValidationPassed &&
            hudValidationPassed &&
            notificationValidationPassed;

        if (overallValidationPassed) {
            validationSummary = "UIManager state rules passed in isolated validation.";
        } else {
            validationSummary = "UIManager state rules failed in isolated validation.";
        }
    }

    private void resetState() {
        hudVisible = true;
        currentModal = "";
        modalOpen = false;
        notificationsEnabled = true;
        lastNotification = "";
        modalValidationPassed = false;
        hudValidationPassed = false;
        notificationValidationPassed = false;
        overallValidationPassed = false;
        validationSummary = "Validation not started.";
    }

    private void simulateOpenModal(String modalName) {
        String normalizedModalName = normalizeText(modalName);

        if (normalizedModalName.length() == 0) {
            return;
        }

        currentModal = normalizedModalName;
        modalOpen = true;
    }

    private void simulateCloseModal() {
        currentModal = "";
        modalOpen = false;
    }

    private void simulateCloseAllModals() {
        simulateCloseModal();
    }

    private void simulateShowHUD() {
        hudVisible = true;
    }

    private void simulateHideHUD() {
        hudVisible = false;
    }

    private void simulateShowNotification(String message) {
        String normalizedMessage = normalizeText(message);

        if (!notificationsEnabled || normalizedMessage.length() == 0) {
            return;
        }

        lastNotification = normalizedMessage;
    }

    private void simulateClearNotifications() {
        lastNotification = "";
    }

    private String normalizeText(String value) {
        if (value == null) {
            return "";
        }

        return value.trim();
    }
}
