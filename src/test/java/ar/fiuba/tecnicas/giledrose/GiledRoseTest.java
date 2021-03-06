package ar.fiuba.tecnicas.giledrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GiledRoseTest {
    @Test
    public void sellInSingleDecDexterityVestTest() {
        Item[] items=new Item[]{new Item(ItemNames.DEXTERVEST.getName(), 10, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(9,items[0].getSellIn(),0);
    }
    @Test
    public void sellInSingleDecAgedBrieTest() {
        Item[] items=new Item[]{new Item(ItemNames.AGEDBRIE.getName(), 2, 0)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(1,items[0].getSellIn(),0);
    }
    @Test
    public void sellInSingleDecElixirMongooseTest() {
        Item[] items=new Item[]{new Item(ItemNames.ELIXIR.getName(), 5, 7)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(4,items[0].getSellIn(),0);
    }
    @Test
    public void sellConstantSulfurasTest() {
        Item[] items=new Item[]{new Item(ItemNames.SULFURAS.getName(), 0, 80)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(0,items[0].getSellIn(),0);
    }
    @Test
    public void sellInSingleDecBackStagePassesTest() {
        Item[] items=new Item[]{new Item(ItemNames.BACKSTAGE.getName(), 15, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(14,items[0].getSellIn(),0);
    }
    @Test
    public void sellInSingleDecConjuredTest() {
        Item[] items=new Item[]{new Item(ItemNames.CONJUREDMANA.getName(), 3, 6)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(2,items[0].getSellIn(),0);
    }
    @Test
    public void qualityDexterityVestTest() {
        Item[] items=new Item[]{new Item(ItemNames.DEXTERVEST.getName(), 10, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(19,items[0].getQuality(),0);
    }
    @Test
    public void qualityAgedBrieTest() {
        Item[] items=new Item[]{new Item(ItemNames.AGEDBRIE.getName(), 2, 0)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(1,items[0].getQuality(),0);
    }
    @Test
    public void qualityElixirMongooseTest() {
        Item[] items=new Item[]{new Item(ItemNames.ELIXIR.getName(), 5, 7)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(6,items[0].getQuality(),0);
    }
    @Test
    public void qualitySulfurasTest() {
        Item[] items=new Item[]{new Item(ItemNames.SULFURAS.getName(), 10, 80)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(80,items[0].getQuality(),0);
    }
    @Test
    public void qualityBackStagePassesTest() {
        Item[] items=new Item[]{new Item(ItemNames.BACKSTAGE.getName(), 15, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(21,items[0].getQuality(),0);
    }
    @Test
    public void qualityConjuredTest() {
        Item[] items=new Item[]{new Item(ItemNames.CONJUREDMANA.getName(), 3, 6)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(5,items[0].getQuality(),0);
    }
    @Test
    public void qualityDoblueDecDexterityVestTest() {
        Item[] items=new Item[]{new Item(ItemNames.DEXTERVEST.getName(), 0, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(18,items[0].getQuality(),0);
    }
    @Test
    public void qualityIncDisconcertAgedBrieTest() {
        Item[] items=new Item[]{new Item(ItemNames.AGEDBRIE.getName(), 0, 0)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(2,items[0].getQuality(),0);
    }
    @Test
    public void qualityIncAgedBrieTest() {
        Item[] items=new Item[]{new Item(ItemNames.AGEDBRIE.getName(), 1, 0)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(1,items[0].getQuality(),0);
    }
    @Test
    public void qualityDoubleDecElixirMongooseTest() {
        Item[] items=new Item[]{new Item(ItemNames.ELIXIR.getName(), 0, 7)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(5,items[0].getQuality(),0);
    }
    @Test
    public void qualityConstantSulfurasTest() {
        Item[] items=new Item[]{new Item(ItemNames.SULFURAS.getName(), 0, 80)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(80,items[0].getQuality(),0);
    }
    @Test
    public void qualityTenDaysOrLessBackStagePassesTest() {
        Item[] items=new Item[]{new Item(ItemNames.BACKSTAGE.getName(), 9, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(22,items[0].getQuality(),0);
    }
    @Test
    public void qualityDisconcertBackStagePassesTest() {
        Item[] items=new Item[]{new Item(ItemNames.BACKSTAGE.getName(), 0, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(0,items[0].getQuality(),0);
    }
    @Test
    public void qualityFiveDaysOrLessBackStagePassesTest() {
        Item[] items=new Item[]{new Item(ItemNames.BACKSTAGE.getName(), 4, 20)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(23,items[0].getQuality(),0);
    }
    @Test
    public void qualitydoubledecConjuredTest() {
        Item[] items=new Item[]{new Item(ItemNames.CONJUREDMANA.getName(), 0, 6)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(4,items[0].getQuality(),0);
    }
    @Test
    public void qualityLessThanFiftyAgedBrieTest() {
        Item[] items=new Item[]{new Item(ItemNames.AGEDBRIE.getName(), 1, 50)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(50,items[0].getQuality(),0);
    }
    @Test
    public void qualityLessThanFiftyBackStagePassesTest() {
        Item[] items=new Item[]{new Item(ItemNames.BACKSTAGE.getName(), 4, 49)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(50,items[0].getQuality(),0);
    }
    @Test
    public void qualityNotNegativeConjuredTest() {
        Item[] items=new Item[]{new Item(ItemNames.CONJUREDMANA.getName(), -1, 0)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(0,items[0].getQuality(),0);
    }
    @Test
    public void qualityNotNegativeElixirMongooseTest() {
        Item[] items=new Item[]{new Item(ItemNames.ELIXIR.getName(), -1, 0)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(0,items[0].getQuality(),0);
    }
    @Test
    public void qualityNotNegativeDexterityVestTest() {
        Item[] items=new Item[]{new Item(ItemNames.DEXTERVEST.getName(), -1, 0)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(0,items[0].getQuality(),0);
    }
    @Test
    public void qualityDecreaseConjuredTest() {
        Item[] items=new Item[]{new Item(ItemNames.CONJURED.getName(), 2, 50)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(48,items[0].getQuality(),0);
    }
    @Test
    public void qualityDecreaseConjuredOutOfConcertTest() {
        Item[] items=new Item[]{new Item(ItemNames.CONJURED.getName(), 0, 50)};
        Inventory inv=new Inventory(items);
        inv.updateQuality();
        assertEquals(46,items[0].getQuality(),0);
    }
}
