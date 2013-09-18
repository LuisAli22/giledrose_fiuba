package ar.fiuba.tecnicas.giledrose;

public class DoubleDecreaseQualityProduct extends  DecreaseQualityProduct{
    public DoubleDecreaseQualityProduct(Item item) {
        super(item);
    }

    @Override
    public void update() {
        super.update();
        if (!isQualitivePositiveAndNotZero(getItem())) setQuality(new ConstantQuality());
        getQuality().update(getItem());
    }
}
