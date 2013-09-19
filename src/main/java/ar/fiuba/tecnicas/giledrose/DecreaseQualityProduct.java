package ar.fiuba.tecnicas.giledrose;


public class DecreaseQualityProduct extends Product{

    public DecreaseQualityProduct(Item item) {
       super(item);
        setQuality(new DecreaseQuality());
        setSellIn(new DecreaseSellIn());
    }

    @Override
    public void update() {
     checkQualityAndUpdate();
     getSellIn().update(getItem());
    }
}
