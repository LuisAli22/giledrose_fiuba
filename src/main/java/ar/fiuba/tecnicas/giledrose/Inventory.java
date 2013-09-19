package ar.fiuba.tecnicas.giledrose;

public class Inventory {
    private Item[] items;
    ProductBuilder pbuilder;
    public Inventory(Item[] items) {
        super();
        this.items = items;
        pbuilder=new DefaultProductBuilder();
    }
    public Inventory() {
        super();
        items = new Item[]{
                new Item(ItemNames.DEXTERVEST.getName(), 10, 20),
                new Item(ItemNames.AGEDBRIE.getName(), 2, 0),
                new Item(ItemNames.ELIXIR.getName(), 5, 7),
                new Item(ItemNames.SULFURAS.getName(), 0, 80),
                new Item(ItemNames.BACKSTAGE.getName(), 15, 20),
                new Item(ItemNames.CONJUREDMANA.getName(), 3, 6)
        };
        pbuilder=new DefaultProductBuilder();
    }
    private void constructProductFromItemAndUpdate(Item item){
        Product product=pbuilder.construct(item);
        product.update();
    }
    public void updateQuality() {
        for (int i = 0; i < items.length; i++)
            constructProductFromItemAndUpdate(items[i]);
    }
}
