package ar.fiuba.tecnicas.giledrose;

public class IncreaseQuality implements Quality {
    @Override
    public void update(Item item) {
       item.setQuality(item.getQuality()+1);
    }
}
