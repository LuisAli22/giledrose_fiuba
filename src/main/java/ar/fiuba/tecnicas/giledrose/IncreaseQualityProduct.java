package ar.fiuba.tecnicas.giledrose;

public class IncreaseQualityProduct extends Product{
    public IncreaseQualityProduct(Item item) {
        super(item);
        setQuality(new IncreaseQuality());
        setSellIn(new DecreaseSellIn());
    }
    @Override
    boolean isOkQuality(Item item){
        return (item.getQuality()<50);
    }
    @Override
    public void update() {
        checkQualityAndUpdate();
        getSellIn().update(getItem());
    }
}
