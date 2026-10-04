package abstraction_interface.assigment_problems;

// Capability for appliances with a saver mode that cuts energy use by 25%.
public interface SaverMode {
    double SAVER_REDUCTION = 0.25;

    double units();

    default double saverUnits() {
        return units() * (1 - SAVER_REDUCTION);
    }
}
