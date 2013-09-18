package ar.fiuba.tecnicas.giledrose;


public class DecreaseQualityProduct extends Product{

    public DecreaseQualityProduct(Item item) {
       super(item);
        setQuality(new DecreaseQuality());
        setSellIn(new DecreaseSellIn());
    }
    public boolean isQualitivePositiveAndNotZero(Item item){
        return (item.getQuality()>0);
    }
    public void checkQualityAndUpdate(){
        if (!isQualitivePositiveAndNotZero(getItem())) setQuality(new ConstantQuality());
        getQuality().update(getItem());
    }
    @Override
    public void update() {
     checkQualityAndUpdate();
     getSellIn().update(getItem());
    }
}
