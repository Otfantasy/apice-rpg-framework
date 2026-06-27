class ShopManager extends Component {
    boolean shopOpen;
    String activeShopId;

    void start() {
        shopOpen = false;
        activeShopId = "NONE";
    }

    void repeat() {
        // Buy and sell logic will be enabled after item and currency pipelines are defined.
    }
}
