class TradeManager extends Component {
    boolean tradeOpen;
    String tradePartnerId;

    void start() {
        tradeOpen = false;
        tradePartnerId = "NONE";
    }

    void repeat() {
        // Trade validation and anti-duplication rules will be designed with multiplayer support.
    }
}
