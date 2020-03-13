package strategy.promotion;

/**
 * 返现活动
 */
public class CashbackStrategy implements IPromotionStrategy {

    public void doPromotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
