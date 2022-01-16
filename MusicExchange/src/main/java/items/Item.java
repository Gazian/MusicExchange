package items;

import behaviours.ISell;
import instruments.InstrumentFamilyType;

public abstract class Item implements ISell {
    private ItemType itemType;
    private double purchasePrice;
    private double salePrice;

    public Item(ItemType itemType, double purchasePrice, double salePrice) {
        this.itemType = itemType;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    @Override
    public double calculateMarkup() {
        return (this.salePrice -this.purchasePrice);
    }
}
