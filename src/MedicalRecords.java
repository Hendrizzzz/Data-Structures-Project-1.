/**
 * Represents the object to be sorted.
 */
public class MedicalRecords implements Comparable<MedicalRecords> {
    String lastName;
    String firstName;
    String patientID;
    String gender;
    long contactInfo;
    String medications;
    String reasonForVisit;
    String physician;

    /**
     * Constructor
     * @author Hyowon
     * */
    public MedicalRecords(String lastName, String firstName, String patientID, String gender, long contactInfo,
                          String medications, String reasonForVisit, String physician) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patientID = patientID;
        this.gender = gender;
        this.contactInfo = contactInfo;
        this.medications = medications;
        this.reasonForVisit = reasonForVisit;
        this.physician = physician;
    }

    /**
     * Getter Methods
     * @author Audrey
     * */
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getGender() {
        return gender;
    }

    public long getContactInfo() {
        return contactInfo;
    }

    public String getMedications() {
        return medications;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public String getPhysician() {
        return physician;
    }

    /**
     * Setter Methods
     * @author Franz
     * */
    // Input Methods

    /**
     * toString Method
     * @author Hyowon
     * */
    @Override
    public String toString() {
        return "{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patientID='" + patientID + '\'' +
                ", gender='" + gender + '\'' +
                ", contactInfo='+639" + contactInfo + '\'' +
                ", medications='" + medications + '\'' +
                ", reasonForVisit='" + reasonForVisit + '\'' +
                ", physician='" + physician + '\'' +
                '}';
    }

    /**
     * compareTo Method
     * @author Hyowon
     * */
    @Override
    public int compareTo(MedicalRecords o) {
        return this.lastName.compareTo(o.lastName);
    }
}
