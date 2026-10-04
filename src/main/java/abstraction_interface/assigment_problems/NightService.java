package abstraction_interface.assigment_problems;

// Capability for cabs that offer night trips at a 20% surcharge.
public interface NightService {
    double NIGHT_SURCHARGE = 0.20;

    double dayFare();

    default double nightFare() {
        return dayFare() * (1 + NIGHT_SURCHARGE);
    }
}
