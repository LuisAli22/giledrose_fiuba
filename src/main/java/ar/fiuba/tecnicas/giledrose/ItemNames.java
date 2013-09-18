package ar.fiuba.tecnicas.giledrose;

public enum ItemNames {
    DEXTERVEST("+5 Dexterity Vest"),
    AGEDBRIE("Aged Brie"),
    ELIXIR("Elixir of the Mongoose"),
    SULFURAS("Sulfuras, Hand of Ragnaros"),
    BACKSTAGE("Backstage passes to a TAFKAL80ETC concert"),
    CONJUREDMANA("Conjured Mana Cake"),
    CONJURED("Conjured");

    public String getName() {
        return name;
    }

    private String name;

    private ItemNames(String name) {
        this.name = name;
    }
}
