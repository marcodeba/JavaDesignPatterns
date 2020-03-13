package strategy.promotion;

/**
 * 无优惠
 */
public class EmptyStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
