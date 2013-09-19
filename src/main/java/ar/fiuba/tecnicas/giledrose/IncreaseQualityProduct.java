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
    boolean isOkQuality(Item item){
        return isQualityInRange(item);
    }
    @Override
    public void update() {
        checkQualityAndUpdate();
        getSellIn().update(getItem());
    }
}
