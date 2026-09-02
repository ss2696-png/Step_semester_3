package classes_objects.class_problems;

// Applicant that bumps a shared counter every time one is created.
public class Applicant {
    static int totalApplicants = 0;

    public Applicant() {
        totalApplicants++;
    }
}
