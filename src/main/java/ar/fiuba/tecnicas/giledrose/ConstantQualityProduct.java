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
        if (getItem().getName().equals(ItemNames.BACKSTAGE.getName())) getItem().setQuality(0);
        if (getItem().getName().equals(ItemNames.SULFURAS.getName())) getItem().setQuality(80);
    }
}
