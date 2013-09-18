package ar.fiuba.tecnicas.giledrose;


public class ForthDecreaseQualityProduct extends DoubleDecreaseQualityProduct {
    public ForthDecreaseQualityProduct(Item item) {
        super(item);
    }
    @Override
    public void update() {
        super.update();
        if (!isQualitivePositiveAndNotZero(getItem())) setQuality(new DoubleDecreaseQuality());
        getQuality().update(getItem());
    }
}
