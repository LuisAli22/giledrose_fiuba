package ar.fiuba.tecnicas.giledrose;

public class IncreaseQualityProduct extends Product{
    public IncreaseQualityProduct(Item item) {
        super(item);
        setQuality(new IncreaseQuality());
        setSellIn(new DecreaseSellIn());
    }
    public boolean isQualityInRange(Item item){
        return (item.getQuality()<50);
    }
    @Override
    public void update() {
        if (!isQualityInRange(getItem())) setQuality(new ConstantQuality());
        getQuality().update(getItem());
        getSellIn().update(getItem());
    }
}
