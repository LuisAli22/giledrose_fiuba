package ar.fiuba.tecnicas.giledrose;

public class TripleIncreaseQualityProduct extends DoubleIncreaseQualityProduct{
    public TripleIncreaseQualityProduct(Item item) {
        super(item);
    }
    @Override
    public void update() {
        super.update();
        checkQualityAndUpdate();
    }
}
