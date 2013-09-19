package ar.fiuba.tecnicas.giledrose;

public class DoubleIncreaseQualityProduct extends IncreaseQualityProduct{
    public DoubleIncreaseQualityProduct(Item item) {
        super(item);
    }
    @Override
    public void update() {
        super.update();
        checkQualityAndUpdate();
    }
}
