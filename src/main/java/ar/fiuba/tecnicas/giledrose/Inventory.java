package ar.fiuba.tecnicas.giledrose;

public class Inventory {
    private Item[] items;
    private void updateQualityOutOfConcert(Item item) {
        if (outOfConcertDecreaseQualityAndQualitvePositiveNonZero(item))  item.setQuality(item.getQuality() - 1);
        if (isSpecialItemAndIsOutOfConcert(item)) item.setQuality(item.getQuality() - item.getQuality());
        if (isSingleIncreaseAndIsOutOfConcertAndOkRangeQuality(item)) item.setQuality(item.getQuality() + 1);
    }
    private boolean  isSpecialItemAndIsOutOfConcert(Item item){
        return ((!isSellInInConcert(item))&&(isSpecialItemIncreaseQuality(item)));
    }
    private boolean  isSingleIncreaseAndIsOutOfConcertAndOkRangeQuality(Item item){
        return ((!isSellInInConcert(item))&&(isSingleIncreaseQuality(item))&&(isQualityInRange(item)));
    }
    private boolean outOfConcertDecreaseQualityAndQualitvePositiveNonZero(Item item){
        return ((outOfConcertAndIsItemDecreaseQuality(item))&&(isQualitivePositiveAndNotZero(item)));
    }
    private  boolean outOfConcertAndIsItemDecreaseQuality(Item item){
        return ((!isSellInInConcert(item))&&(isQualityDecrease(item)));
    }
    private void updateSellIn(Item item) {
        if (!isSpecialItemConstQualityConstSellIn(item)) {
            item.setSellIn(item.getSellIn() - 1);
        }
    }
    private boolean isSellInInConcert(Item item){
        return (item.getSellIn()>=0);
    }
    private boolean isSpecialItemIncreaseQuality(Item item){
        return (item.getName() == "Backstage passes to a TAFKAL80ETC concert");
    }
    private boolean isSingleIncreaseQuality(Item item){
        return (item.getName()=="Aged Brie");
    }
    private boolean isSpecialItemConstQualityConstSellIn(Item item){
        return (item.getName() == "Sulfuras, Hand of Ragnaros");
    }
    private boolean isQualityDecrease(Item item){
         return ((!isSingleIncreaseQuality(item)) &&
                (!isSpecialItemIncreaseQuality(item))&&
                 (!isSpecialItemConstQualityConstSellIn(item)));
    }
    private boolean isQualitivePositiveAndNotZero(Item item){
        return (item.getQuality()>0);
    }
    private boolean isQualityInRange(Item item){
        return (item.getQuality()<50);
    }
    private boolean areLeftTenOrLessExpire(Item item){
       return (item.getSellIn()<11);
    }
    private boolean areLeftFiveOrLessExpire(Item item){
        return (item.getSellIn()<6);
    }
    private boolean tenOreLessToExpireAndOkQualityRange(Item item){
      return (areLeftTenOrLessExpire(item)&&(isQualityInRange(item)));
    }
    private boolean fiveOreLessToExpireAndOkQualityRange(Item item){
        return (areLeftFiveOrLessExpire(item)&&(isQualityInRange(item)));
    }
    private void updateQualityInConcert(Item item){
        if ((isQualityDecrease(item))&&(isQualitivePositiveAndNotZero(item)))
            item.setQuality(item.getQuality() - 1);
        else {
            if (isQualityInRange(item)) {
                item.setQuality(item.getQuality() + 1);
                if (isSpecialItemIncreaseQuality(item)) {
                    if (tenOreLessToExpireAndOkQualityRange(item))
                            item.setQuality(item.getQuality() + 1);
                    if (fiveOreLessToExpireAndOkQualityRange(item)) {
                            item.setQuality(item.getQuality() + 1);
                    }
                }
            }
        }
    }
    public Inventory(Item[] items) {
        super();
        this.items = items;
    }
    public Inventory() {
        super();
        items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Conjured Mana Cake", 3, 6)
        };

    }
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            updateQualityInConcert(items[i]);
            updateSellIn(items[i]);
            updateQualityOutOfConcert(items[i]);
        }
    }
}
