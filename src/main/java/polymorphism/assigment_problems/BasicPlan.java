package polymorphism.assigment_problems;

import java.time.LocalDate;

// Basic plan valid for 30 days.
public class BasicPlan extends SubscriptionPlan {
    public BasicPlan(String subscriber, LocalDate startDate) {
        super(subscriber, startDate);
    }

    @Override
    protected int validityDays() {
        return 30;
    }
}
