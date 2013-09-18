package ar.fiuba.tecnicas.giledrose;


public class ConstantQualityProduct extends Product{


    public ConstantQualityProduct(Item item) {
        super(item);
        setQuality(new ConstantQuality());
        setSellIn(new ConstSellIn());
        item.setSellIn(0);
    }
    @Override
    public void update() {
        getQuality().update(getItem());
        if (getItem().getName()=="Backstage passes to a TAFKAL80ETC concert") getItem().setQuality(0);
        if (getItem().getName()=="Sulfuras, Hand of Ragnaros") getItem().setQuality(80);
    }
}
