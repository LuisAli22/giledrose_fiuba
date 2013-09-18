package ar.fiuba.tecnicas.giledrose;

public class DecreaseSellIn implements SellIn{
    @Override
    public void update(Item item) {
        item.setSellIn(item.getSellIn()-1);
    }
}
