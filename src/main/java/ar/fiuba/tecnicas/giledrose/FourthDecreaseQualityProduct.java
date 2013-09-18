package ar.fiuba.tecnicas.giledrose;


public class FourthDecreaseQualityProduct extends DoubleDecreaseQualityProduct {
    public FourthDecreaseQualityProduct(Item item) {
        super(item);
    }
    @Override
    public void update() {
        super.update();
        checkQualityAndUpdate();
        checkQualityAndUpdate();
    }
}
