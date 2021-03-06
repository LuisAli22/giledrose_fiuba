package ar.fiuba.tecnicas.giledrose;

public abstract class Product {
    private Item item;
    private SellIn sellIn;
    private Quality quality;

    public SellIn getSellIn() {
        return sellIn;
    }

    public void setSellIn(SellIn sellIn) {
        this.sellIn = sellIn;
    }
    protected Product(Item item) {
        this.item = item;
    }

    public void setQuality(Quality quality){this.quality=quality;}
    public Quality getQuality(){return quality;}
    public Item getItem(){return item;}
    public void checkQualityAndUpdate(){
        if (!isOkQuality(item)) setQuality(new ConstantQuality());
        getQuality().update(getItem());
    }
    boolean isOkQuality(Item item){
        return (item.getQuality()>0);
    }
    public abstract void update();
}
