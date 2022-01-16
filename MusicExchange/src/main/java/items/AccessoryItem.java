package items;

public class AccessoryItem extends Item{
    private String name;

    public AccessoryItem(String name,ItemType itemType, double purchasePrice, double salePrice) {
        super(itemType, purchasePrice, salePrice);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
