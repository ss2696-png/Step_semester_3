package polymorphism.assigment_problems;

import java.time.LocalDate;

// Premium plan valid for 365 days.
public class PremiumPlan extends SubscriptionPlan {
    public PremiumPlan(String subscriber, LocalDate startDate) {
        super(subscriber, startDate);
    }

    @Override
    protected int validityDays() {
        return 365;
    }
}
