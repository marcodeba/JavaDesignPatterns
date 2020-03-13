package strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * 促销策略工厂
 */
public class PromotionStrategyFactory {
    private static final IPromotionStrategy NON_PROMOTION = new EmptyStrategy();
    private static Map<String, IPromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<String, IPromotionStrategy>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK, new CashbackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY, new GroupbuyStrategy());
    }

    private PromotionStrategyFactory() {
    }

    public static IPromotionStrategy getPromotionStrategy(String promotionKey) {
        IPromotionStrategy IPromotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return IPromotionStrategy == null ? NON_PROMOTION : IPromotionStrategy;
    }

    private interface PromotionKey {
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }
}
