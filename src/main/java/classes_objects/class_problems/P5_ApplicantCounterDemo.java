package classes_objects.class_problems;

// Creates three applicants and reads the shared static count.
public class P5_ApplicantCounterDemo {
    public static void main(String[] args) {
        new Applicant();
        new Applicant();
        new Applicant();
        System.out.println("Total applicants: " + Applicant.totalApplicants);
    }
}
