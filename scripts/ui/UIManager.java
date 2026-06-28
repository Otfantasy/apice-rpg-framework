class UIManager extends Component {
    boolean hudVisible;
    String currentModal;
    boolean modalOpen;
    boolean notificationsEnabled;
    String lastNotification;

    public void start() {
        hudVisible = true;
        currentModal = "";
        modalOpen = false;
        notificationsEnabled = true;
        lastNotification = "";
    }

    public void openModal(String modalName) {
        String normalizedModalName = normalizeText(modalName);

        if (normalizedModalName.length() == 0) {
            return;
        }

        currentModal = normalizedModalName;
        modalOpen = true;
    }

    public void closeModal() {
        currentModal = "";
        modalOpen = false;
    }

    public void closeAllModals() {
        closeModal();
    }

    public boolean isModalOpen() {
        return modalOpen;
    }

    public String getCurrentModal() {
        return currentModal;
    }

    public void showHUD() {
        hudVisible = true;
    }

    public void hideHUD() {
        hudVisible = false;
    }

    public boolean isHUDVisible() {
        return hudVisible;
    }

    public void showNotification(String message) {
        String normalizedMessage = normalizeText(message);

        if (!notificationsEnabled || normalizedMessage.length() == 0) {
            return;
        }

        lastNotification = normalizedMessage;
    }

    public void clearNotifications() {
        lastNotification = "";
    }

    public String getLastNotification() {
        return lastNotification;
    }

    private String normalizeText(String value) {
        if (value == null) {
            return "";
        }

        return value.trim();
    }
}
