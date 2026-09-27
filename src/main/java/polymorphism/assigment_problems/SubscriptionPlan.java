package polymorphism.assigment_problems;

import java.time.LocalDate;

// Base streaming plan; each plan type defines how many days it stays valid.
public abstract class SubscriptionPlan {
    private final String subscriber;
    private final LocalDate startDate;

    protected SubscriptionPlan(String subscriber, LocalDate startDate) {
        if (subscriber == null || subscriber.isBlank() || startDate == null) {
            throw new IllegalArgumentException("Subscriber and start date are required");
        }
        this.subscriber = subscriber;
        this.startDate = startDate;
    }

    public String getSubscriber() {
        return subscriber;
    }

    protected abstract int validityDays();

    public LocalDate renewalDate() {
        return startDate.plusDays(validityDays());
    }
}
