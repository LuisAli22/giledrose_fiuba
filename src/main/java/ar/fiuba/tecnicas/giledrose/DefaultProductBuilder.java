package ar.fiuba.tecnicas.giledrose;

public class DefaultProductBuilder implements ProductBuilder{
    private boolean isCommonProduct(String name){
        return ((name.equals(ItemNames.DEXTERVEST.getName())) ||
                (name.equals(ItemNames.ELIXIR.getName()))||(name.equals(ItemNames.CONJUREDMANA.getName())));
    }
    private Product getCorrectDoubleDecrease(Item item) {
        if (item.getSellIn()>0) return new DoubleDecreaseQualityProduct(item);
        return new FourthDecreaseQualityProduct(item);
    }

    private Product getCorrectIncrease(Item item) {
        if(item.getSellIn()>0) return new IncreaseQualityProduct(item);
        return new DoubleIncreaseQualityProduct(item);
    }

    private Product getCorrectDecrease(Item item) {
        if (item.getSellIn()>0)
            return new DecreaseQualityProduct(item);
        return new DoubleDecreaseQualityProduct(item);
    }

    private Product getCorrectSpecialIncrease(Item item) {
        if (item.getSellIn()>10)
            return new IncreaseQualityProduct(item);
        if ((item.getSellIn()>5)&&(item.getSellIn()<11))
            return new DoubleIncreaseQualityProduct(item);
        if(item.getSellIn()>0)
            return new TripleIncreaseQualityProduct(item);
        return new ConstantQualityProduct(item);
    }
    private boolean isConstantQualityProduct(String name) {
        return (name.equals(ItemNames.SULFURAS.getName()));
    }
    private boolean isSpecialIncreaseProduct(String name){
        return (name.equals(ItemNames.BACKSTAGE.getName()));
    }
    private boolean isSingleIncreaseProduct(String name) {
        return (name.equals(ItemNames.AGEDBRIE.getName()));
    }
    @Override
    public Product construct(Item item) {
        if (isCommonProduct(item.getName()))
            return getCorrectDecrease(item);
        if (isSingleIncreaseProduct(item.getName()))
            return getCorrectIncrease(item);
        if (isConstantQualityProduct(item.getName()))
            return new ConstantQualityProduct(item);
        if (isSpecialIncreaseProduct(item.getName()))
            return getCorrectSpecialIncrease(item);
        return getCorrectDoubleDecrease(item);
    }
}
