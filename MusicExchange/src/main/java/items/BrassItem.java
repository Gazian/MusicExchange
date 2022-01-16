package items;

import instruments.Brass;

public class BrassItem extends Item{
    private Brass brass;

    public BrassItem(ItemType itemType, double purchasePrice, double salePrice, Brass brass) {
        super(itemType, purchasePrice, salePrice);
        this.brass = brass;
    }

    public Brass getBrass() {
        return brass;
    }

    public void setBrass(Brass brass) {
        this.brass = brass;
    }

}
