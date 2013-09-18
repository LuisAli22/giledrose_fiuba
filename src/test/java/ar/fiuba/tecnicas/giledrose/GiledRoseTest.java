package ar.fiuba.tecnicas.giledrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GiledRoseTest {
    @Test
    public void sellInSingleDecDexterityVestTest() {
        Item[] items=new Item[]{new Item("+5 Dexterity Vest", 10, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(9,items[0].getSellIn(),0);
    }
    @Test
    public void sellInSingleDecAgedBrieTest() {
        Item[] items=new Item[]{new Item("Aged Brie", 2, 0)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(1,items[0].getSellIn(),0);
    }
    @Test
    public void sellInSingleDecElixirMongooseTest() {
        Item[] items=new Item[]{new Item("Elixir of the Mongoose", 5, 7)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(4,items[0].getSellIn(),0);
    }
    @Test
    public void sellConstantSulfurasTest() {
        Item[] items=new Item[]{new Item("Sulfuras, Hand of Ragnaros", 0, 80)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(0,items[0].getSellIn(),0);
    }
    @Test
    public void sellInSingleDecBackStagePassesTest() {
        Item[] items=new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(14,items[0].getSellIn(),0);
    }
    @Test
    public void sellInSingleDecConjuredTest() {
        Item[] items=new Item[]{new Item("Conjured Mana Cake", 3, 6)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(2,items[0].getSellIn(),0);
    }
    @Test
    public void qualityDexterityVestTest() {
        Item[] items=new Item[]{new Item("+5 Dexterity Vest", 10, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(19,items[0].getQuality(),0);
    }
    @Test
    public void qualityAgedBrieTest() {
        Item[] items=new Item[]{new Item("Aged Brie", 2, 0)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(1,items[0].getQuality(),0);
    }
    @Test
    public void qualityElixirMongooseTest() {
        Item[] items=new Item[]{new Item("Elixir of the Mongoose", 5, 7)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(6,items[0].getQuality(),0);
    }
    @Test
    public void qualitySulfurasTest() {
        Item[] items=new Item[]{new Item("Sulfuras, Hand of Ragnaros", 10, 80)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(80,items[0].getQuality(),0);
    }
    @Test
    public void qualityBackStagePassesTest() {
        Item[] items=new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(21,items[0].getQuality(),0);
    }
    @Test
    public void qualityConjuredTest() {
        Item[] items=new Item[]{new Item("Conjured Mana Cake", 3, 6)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(5,items[0].getQuality(),0);
    }
    @Test
    public void qualityDoblueDecDexterityVestTest() {
        Item[] items=new Item[]{new Item("+5 Dexterity Vest", 0, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(18,items[0].getQuality(),0);
    }
    @Test
    public void qualityIncDisconcertAgedBrieTest() {
        Item[] items=new Item[]{new Item("Aged Brie", 0, 0)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(2,items[0].getQuality(),0);
    }
    @Test
    public void qualityIncAgedBrieTest() {
        Item[] items=new Item[]{new Item("Aged Brie", 1, 0)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(1,items[0].getQuality(),0);
    }
    @Test
    public void qualityDoubleDecElixirMongooseTest() {
        Item[] items=new Item[]{new Item("Elixir of the Mongoose", 0, 7)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(5,items[0].getQuality(),0);
    }
    @Test
    public void qualityConstantSulfurasTest() {
        Item[] items=new Item[]{new Item("Sulfuras, Hand of Ragnaros", 0, 80)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(80,items[0].getQuality(),0);
    }
    @Test
    public void qualityTenDaysOrLessBackStagePassesTest() {
        Item[] items=new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 9, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(22,items[0].getQuality(),0);
    }
    @Test
    public void qualityDisconcertBackStagePassesTest() {
        Item[] items=new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(0,items[0].getQuality(),0);
    }
    @Test
    public void qualityFiveDaysOrLessBackStagePassesTest() {
        Item[] items=new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 4, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(23,items[0].getQuality(),0);
    }
    @Test
    public void qualitydoubledecConjuredTest() {
        Item[] items=new Item[]{new Item("Conjured Mana Cake", 0, 6)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(4,items[0].getQuality(),0);
    }
    @Test
    public void qualityLessThanFiftyAgedBrieTest() {
        Item[] items=new Item[]{new Item("Aged Brie", 1, 50)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(50,items[0].getQuality(),0);
    }
    @Test
    public void qualityLessThanFiftyBackStagePassesTest() {
        Item[] items=new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 4, 49)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(50,items[0].getQuality(),0);
    }
    @Test
    public void qualityNotNegativeConjuredTest() {
        Item[] items=new Item[]{new Item("Conjured Mana Cake", -1, 0)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(0,items[0].getQuality(),0);
    }
    @Test
    public void qualityNotNegativeElixirMongooseTest() {
        Item[] items=new Item[]{new Item("Elixir of the Mongoose", -1, 0)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(0,items[0].getQuality(),0);
    }
    @Test
    public void qualityNotNegativeDexterityVestTest() {
        Item[] items=new Item[]{new Item("+5 Dexterity Vest", -1, 0)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(0,items[0].getQuality(),0);
    }
    @Test
    public void qualityDecreaseConjuredTest() {
        Item[] items=new Item[]{new Item("Conjured", 2, 50)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(48,items[0].getQuality(),0);
    }
    @Test
    public void qualityDecreaseConjuredOutOfConcertTest() {
        Item[] items=new Item[]{new Item("Conjured", 0, 50)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(46,items[0].getQuality(),0);
    }
}
