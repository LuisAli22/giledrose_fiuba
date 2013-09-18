package ar.fiuba.tecnicas.giledrose;

public class DecreaseQuality implements Quality{
    @Override
    public void update(Item item) throws AssertionError {
       item.setQuality(item.getQuality()-1);
    }
}
