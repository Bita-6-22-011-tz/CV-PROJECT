package Cv.Creation.Cv_project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CVWork")
public class CVWork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String OrganisationName;
    private String OStartingYear;
    private String OEndingYear;
    private String PositionName;
    private String References_details;
    private String Hobbies;


    public CVWork() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrganisationName() {
        return OrganisationName;
    }

    public void setOrganisationName(String organisationName) {
        OrganisationName = organisationName;
    }

    public String getOStartingYear() {
        return OStartingYear;
    }

    public void setOStartingYear(String OStartingYear) {
        this.OStartingYear = OStartingYear;
    }

    public String getOEndingYear() {
        return OEndingYear;
    }

    public void setOEndingYear(String OEndingYear) {
        this.OEndingYear = OEndingYear;
    }

    public String getPositionName() {
        return PositionName;
    }

    public void setPositionName(String positionName) {
        PositionName = positionName;
    }

    public String getReferences_details() {
        return References_details;
    }

    public void setReferences_details(String references_details) {
        References_details = references_details;
    }

    public String getHobbies() {
        return Hobbies;
    }

    public void setHobbies(String hobbies) {
        Hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "CVWork{" +
                "id=" + id +
                ", OrganisationName='" + OrganisationName + '\'' +
                ", OStartingYear='" + OStartingYear + '\'' +
                ", OEndingYear='" + OEndingYear + '\'' +
                ", PositionName='" + PositionName + '\'' +
                ", References_details='" + References_details + '\'' +
                ", Hobbies='" + Hobbies + '\'' +
                '}';
    }
}