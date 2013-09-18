package ar.fiuba.tecnicas.giledrose;

public class DoubleDecreaseQuality implements Quality {
    @Override
    public void update(Item item) {
        item.setQuality(item.getQuality()-2);
    }
}
