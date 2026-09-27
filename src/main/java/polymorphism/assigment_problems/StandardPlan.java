package polymorphism.assigment_problems;

import java.time.LocalDate;

// Standard plan valid for 90 days.
public class StandardPlan extends SubscriptionPlan {
    public StandardPlan(String subscriber, LocalDate startDate) {
        super(subscriber, startDate);
    }

    @Override
    protected int validityDays() {
        return 90;
    }
}
