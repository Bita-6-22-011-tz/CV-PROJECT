package Cv.Creation.Cv_project.model;


import jakarta.persistence.*;

@Entity
@Table(name="CvDetails")

public class CVDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String  PrimaryName;
    private String  PStartingYear;
    private String  PEndingYear;
    private String  SecondaryName;
    private String  SStartingYear;
    private String  SEndingYear;
    private String  InstituteName;
    private String  IStartingYear;
    private String  IEndingYear;
    private String  DiplomaName;
    private String  DStartingYear;
    private String  DEndingYear;
    private String  UniversityName;
    private String  UStartingYear;
    private String  UEndingYear;
    private String ProfessionSkills;

    public CVDetails() {
    }

    public String getDStartingYear() {
        return DStartingYear;
    }

    public void setDStartingYear(String DStartingYear) {
        this.DStartingYear = DStartingYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrimaryName() {
        return PrimaryName;
    }

    public void setPrimaryName(String primaryName) {
        PrimaryName = primaryName;
    }

    public String getPStartingYear() {
        return PStartingYear;
    }

    public void setPStartingYear(String PStartingYear) {
        this.PStartingYear = PStartingYear;
    }

    public String getPEndingYear() {
        return PEndingYear;
    }

    public void setPEndingYear(String PEndingYear) {
        this.PEndingYear = PEndingYear;
    }

    public String getSecondaryName() {
        return SecondaryName;
    }

    public void setSecondaryName(String secondaryName) {
        SecondaryName = secondaryName;
    }

    public String getSStartingYear() {
        return SStartingYear;
    }

    public void setSStartingYear(String SStartingYear) {
        this.SStartingYear = SStartingYear;
    }

    public String getSEndingYear() {
        return SEndingYear;
    }

    public void setSEndingYear(String SEndingYear) {
        this.SEndingYear = SEndingYear;
    }

    public String getInstituteName() {
        return InstituteName;
    }

    public void setInstituteName(String instituteName) {
        InstituteName = instituteName;
    }

    public String getIStartingYear() {
        return IStartingYear;
    }

    public void setIStartingYear(String IStartingYear) {
        this.IStartingYear = IStartingYear;
    }

    public String getIEndingYear() {
        return IEndingYear;
    }

    public void setIEndingYear(String IEndingYear) {
        this.IEndingYear = IEndingYear;
    }

    public String getDiplomaName() {
        return DiplomaName;
    }

    public void setDiplomaName(String diplomaName) {
        DiplomaName = diplomaName;
    }

    public String getDEndingYear() {
        return DEndingYear;
    }

    public void setDEndingYear(String DEndingYear) {
        this.DEndingYear = DEndingYear;
    }

    public String getUniversityName() {
        return UniversityName;
    }

    public void setUniversityName(String universityName) {
        UniversityName = universityName;
    }

    public String getUStartingYear() {
        return UStartingYear;
    }

    public void setUStartingYear(String UStartingYear) {
        this.UStartingYear = UStartingYear;
    }

    public String getUEndingYear() {
        return UEndingYear;
    }

    public void setUEndingYear(String UEndingYear) {
        this.UEndingYear = UEndingYear;
    }

    public String getProfessionSkills() {
        return ProfessionSkills;
    }

    public void setProfessionSkills(String professionSkills) {
        ProfessionSkills = professionSkills;
    }

    @Override
    public String toString() {
        return "CVDetails{" +
                "id=" + id +
                ", PrimaryName='" + PrimaryName + '\'' +
                ", PStartingYear='" + PStartingYear + '\'' +
                ", PEndingYear='" + PEndingYear + '\'' +
                ", SecondaryName='" + SecondaryName + '\'' +
                ", SStartingYear='" + SStartingYear + '\'' +
                ", SEndingYear='" + SEndingYear + '\'' +
                ", InstituteName='" + InstituteName + '\'' +
                ", IStartingYear='" + IStartingYear + '\'' +
                ", IEndingYear='" + IEndingYear + '\'' +
                ", DiplomaName='" + DiplomaName + '\'' +
                ", DStartingYear='" + DStartingYear + '\'' +
                ", DEndingYear='" + DEndingYear + '\'' +
                ", UniversityName='" + UniversityName + '\'' +
                ", UStartingYear='" + UStartingYear + '\'' +
                ", UEndingYear='" + UEndingYear + '\'' +
                ", ProfessionSkills='" + ProfessionSkills + '\'' +
                '}';
    }
}
