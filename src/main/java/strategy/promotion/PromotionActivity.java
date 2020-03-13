package strategy.promotion;

/**
 * 优惠活动
 */
public class PromotionActivity {
    private IPromotionStrategy IPromotionStrategy;

    public PromotionActivity(IPromotionStrategy IPromotionStrategy) {
        this.IPromotionStrategy = IPromotionStrategy;
    }

    public void execute() {
        IPromotionStrategy.doPromotion();
    }

}
