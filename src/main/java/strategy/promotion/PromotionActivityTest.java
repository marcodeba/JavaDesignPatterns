package strategy.promotion;

/**
 * 促销活动
 */
public class PromotionActivityTest {
    public static void main(String[] args) {
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        PromotionActivity activity1111 = new PromotionActivity(new CashbackStrategy());

        activity618.execute();
        activity1111.execute();
    }

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//
//        String promotionKey = "COUPON";
//
//        if(StringUtils.equals(promotionKey,"COUPON")){
//            promotionActivity = new PromotionActivity(new CouponStrategy());
//        }else if(StringUtils.equals(promotionKey,"CASHBACK")){
//            promotionActivity = new PromotionActivity(new CashbackStrategy());
//        }//......
//        promotionActivity.execute();
//    }


//    public static void main(String[] args) {
//        IPromotionStrategy couponStrategy = PromotionStrategyFactory.getPromotionStrategy("COUPON");
//        PromotionActivity activity618 = new PromotionActivity(couponStrategy);
//
//        IPromotionStrategy cashStrategy = PromotionStrategyFactory.getPromotionStrategy("CASHBACK");
//        PromotionActivity activity1111 = new PromotionActivity(cashStrategy);
//
//        activity618.execute();
//        activity1111.execute();
//    }
}
