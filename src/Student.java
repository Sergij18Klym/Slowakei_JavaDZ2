/*
* Classname : Student
*
* Version Info 1
*
*  10 June 2020
*
* Copyright : Klymenko Sergij ONPU
*
  Module 2 task 4. Programming patterns. Factory, Builder.

Develop for your class

1. Factory.
2. Abstract factory.
3. Create a class Student  - 25 fields.
4. Create a builder for the class Student

* */

import java.time.LocalDate;
import java.util.Objects;

public /*abstract*/ class Student {

    private String firstname;
    private String lastname;
    private String patronymic;
    private StudentGender gender;       // enum: Male or Female
    private LocalDate birthday;     // LocalDate.of(int year, int month, int day)

    private String nationality;
    private String origin;
    private String birthadress;
    private String currentadress;
    private String postindex;

    private String email;
    private int mobilphone;
    private String skype;
    private String telegram;
    private String instagram;

    private StudentUniver university;       // enum
    private StudentFaculty faculty;     // enum
    private StudentSpeciality spec;     // enum
    private StudentLevel level;     // enum: Bachelor or Master
    private StudentCourse course;      // enum: 1,2,3,4,5
    private StudentEducationType educationtype;     // enum: Full-time or Part-time

    private LocalDate enterdate;
    private boolean employed;
    private double stipendium;
    private boolean engaged;
    private boolean komsomolets;

    // default constructor
    public Student(){}

    /**
     * Class constructor with parameters
     * @param firstname String, set to Student object
     * @param lastname String, set to Student object
     *                 ...every other String parameter does the same
     * @param birthday LocalDate, set to Student object
     * @param enterdate LocalDate, set to Student object
     * @param mobilphone int, set to Student object
     * @param employed boolean, set to Student object
     * @param engaged boolean, set to Student object
     * @param stipendium double, set to Student object
     * @param gender enum StudentGender, set to Student object
     * @param university enum StudentUniver, set to Student object
     * @param faculty enum StudentFaculty, set to Student object
     * @param spec enum StudentSpeciality, set to Student object
     * @param level enum StudentLevel, set to Student object
     * @param course enum StudentCourse, set to Student object
     * @param educationtype enum StudentEducationType, set to Student object

     */
    public Student(String firstname, String lastname, String patronymic, StudentGender gender,
                   LocalDate birthday, String nationality, String origin, String birthadress,
                   String currentadress, String postindex, String email, int mobilphone, String skype,
                   String telegram, String instagram, StudentUniver university, StudentFaculty faculty,
                   StudentSpeciality spec, StudentLevel level, StudentCourse course,
                   StudentEducationType educationtype, LocalDate enterdate, boolean employed,
                   double stipendium, boolean engaged, boolean komsomolets) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.birthday = birthday;
        this.nationality = nationality;
        this.origin = origin;
        this.birthadress = birthadress;
        this.currentadress = currentadress;
        this.postindex = postindex;
        this.email = email;
        this.mobilphone = mobilphone;
        this.skype = skype;
        this.telegram = telegram;
        this.instagram = instagram;
        this.university = university;
        this.faculty = faculty;
        this.spec = spec;
        this.level = level;
        this.course = course;
        this.educationtype = educationtype;
        this.enterdate = enterdate;
        this.employed = employed;
        this.stipendium = stipendium;
        this.engaged = engaged;
        this.komsomolets = komsomolets;
    }

    /**
     * Getter for Student firstname field
     * @return Returns firstname of Student object
     */
    public String getFirstname() {
        return firstname;
    }
    /**
     * Setter for Student firstname field
     * @param firstname Sets firstname of Student object
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /*Every other getter and setter for 24 fields of Student object do ABSOLUTELY ANALOGICAL function
    as the first ones for firstname, save for each its own parameter*/
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public StudentGender getGender() {
        return gender;
    }
    public void setGender(StudentGender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getBirthadress() {
        return birthadress;
    }
    public void setBirthadress(String birthadress) {
        this.birthadress = birthadress;
    }

    public String getCurrentadress() {
        return currentadress;
    }
    public void setCurrentadress(String currentadress) {
        this.currentadress = currentadress;
    }

    public String getPostindex() {
        return postindex;
    }
    public void setPostindex(String postindex) {
        this.postindex = postindex;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobilphone() {
        return mobilphone;
    }
    public void setMobilphone(int mobilphone) {
        this.mobilphone = mobilphone;
    }

    public String getSkype() {
        return skype;
    }
    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getTelegram() {
        return telegram;
    }
    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public String getInstagram() {
        return instagram;
    }
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public StudentUniver getUniversity() {
        return university;
    }
    public void setUniversity(StudentUniver university) {
        this.university = university;
    }

    public StudentFaculty getFaculty() {
        return faculty;
    }
    public void setFaculty(StudentFaculty faculty) {
        this.faculty = faculty;
    }

    public StudentSpeciality getSpec() {
        return spec;
    }
    public void setSpec(StudentSpeciality spec) {
        this.spec = spec;
    }

    public StudentLevel getLevel() {
        return level;
    }
    public void setLevel(StudentLevel level) {
        this.level = level;
    }

    public StudentCourse getCourse() {
        return course;
    }
    public void setCourse(StudentCourse course) {
        this.course = course;
    }

    public StudentEducationType getEducationtype() {
        return educationtype;
    }
    public void setEducationtype(StudentEducationType educationtype) {
        this.educationtype = educationtype;
    }

    public LocalDate getEnterdate() {
        return enterdate;
    }
    public void setEnterdate(LocalDate enterdate) {
        this.enterdate = enterdate;
    }

    public boolean isEmployed() {
        return employed;
    }
    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public double getStipendium() {
        return stipendium;
    }
    public void setStipendium(double stipendium) {
        this.stipendium = stipendium;
    }

    public boolean isEngaged() {
        return engaged;
    }
    public void setEngaged(boolean engaged) {
        this.engaged = engaged;
    }

    public boolean isKomsomolets() {
        return komsomolets;
    }
    public void setKomsomolets(boolean komsomolets) {
        this.komsomolets = komsomolets;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "\n\t firstname='" + firstname + '\'' +
                "\n\t, lastname='" + lastname + '\'' +
                "\n\t, patronymic='" + patronymic + '\'' +
                "\n\t, gender=" + gender +
                "\n\t, birthday=" + birthday +
                "\n\t, nationality='" + nationality + '\'' +
                "\n\t, origin='" + origin + '\'' +
                "\n\t, birthadress='" + birthadress + '\'' +
                "\n\t, currentadress='" + currentadress + '\'' +
                "\n\t, postindex='" + postindex + '\'' +
                "\n\t, email='" + email + '\'' +
                "\n\t, mobilphone=" + mobilphone +
                "\n\t, skype='" + skype + '\'' +
                "\n\t, telegram='" + telegram + '\'' +
                "\n\t, instagram='" + instagram + '\'' +
                "\n\t, university=" + university +
                "\n\t, faculty=" + faculty +
                "\n\t, spec=" + spec +
                "\n\t, level=" + level +
                "\n\t, course=" + course +
                "\n\t, educationtype=" + educationtype +
                "\n\t, enterdate=" + enterdate +
                "\n\t, employed=" + employed +
                "\n\t, stipendium=" + stipendium +
                "\n\t, engaged=" + engaged +
                "\n\t, komsomolets=" + komsomolets +
                "\n}";
    }

    /*
     * Method to check whether object equals by value
     * @param o Object as parameter
     * @return Return boolean value as a result of comparison
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getBirthday() == student.getBirthday() &&
                getMobilphone() == student.getMobilphone() &&
                isEmployed() == student.isEmployed() &&
                Double.compare(student.getStipendium(), getStipendium()) == 0 &&
                isEngaged() == student.isEngaged() &&
                isKomsomolets() == student.isKomsomolets() &&
                Objects.equals(getFirstname(), student.getFirstname()) &&
                Objects.equals(getLastname(), student.getLastname()) &&
                Objects.equals(getPatronymic(), student.getPatronymic()) &&
                getGender() == student.getGender() &&
                Objects.equals(getNationality(), student.getNationality()) &&
                Objects.equals(getOrigin(), student.getOrigin()) &&
                Objects.equals(getBirthadress(), student.getBirthadress()) &&
                Objects.equals(getCurrentadress(), student.getCurrentadress()) &&
                Objects.equals(getPostindex(), student.getPostindex()) &&
                Objects.equals(getEmail(), student.getEmail()) &&
                Objects.equals(getSkype(), student.getSkype()) &&
                Objects.equals(getTelegram(), student.getTelegram()) &&
                Objects.equals(getInstagram(), student.getInstagram()) &&
                getUniversity() == student.getUniversity() &&
                getFaculty() == student.getFaculty() &&
                getSpec() == student.getSpec() &&
                getLevel() == student.getLevel() &&
                getCourse() == student.getCourse() &&
                getEducationtype() == student.getEducationtype() &&
                Objects.equals(getEnterdate(), student.getEnterdate());
    }

    /**
     * Method to get object hash
     * @return Returns Student object hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname(), getPatronymic(), getGender(),
                getBirthday(), getNationality(), getOrigin(), getBirthadress(), getCurrentadress(),
                getPostindex(), getEmail(), getMobilphone(), getSkype(), getTelegram(),
                getInstagram(), getUniversity(), getFaculty(), getSpec(), getLevel(), getCourse(),
                getEducationtype(), getEnterdate(), isEmployed(), getStipendium(), isEngaged(), isKomsomolets());
    }

    //   public abstract int salary(){}


/* Builder отделяет конструирование сложного объекта от его представления,
* так что в результате одного и того же процесса конструирования могут получаться разные представления. */
    public static class Builder{

        private Student studentToBuild;

// Builder pattern based on the Student object StudentToBuild with all the field setters
        public Builder() {
            this.studentToBuild = new Student();
        }

/* Constructor setSimilarTo complements the new instance of StudentToBuild object
* based on the first instance of the class */
        public Builder setSimilarTo(Student student){
            this.studentToBuild.firstname = student.firstname;
            this.studentToBuild.lastname = student.lastname;
            this.studentToBuild.patronymic = student.patronymic;
            this.studentToBuild.gender = student.gender;
            this.studentToBuild.birthday = student.birthday;
            this.studentToBuild.nationality = student.nationality;
            this.studentToBuild.origin = student.origin;
            this.studentToBuild.birthadress = student.birthadress;
            this.studentToBuild.currentadress = student.currentadress;
            this.studentToBuild.postindex = student.postindex;
            this.studentToBuild.email = student.email;
            this.studentToBuild.mobilphone = student.mobilphone;
            this.studentToBuild.skype = student.skype;
            this.studentToBuild.telegram = student.telegram;
            this.studentToBuild.instagram = student.instagram;
            this.studentToBuild.university = student.university;
            this.studentToBuild.faculty = student.faculty;
            this.studentToBuild.spec = student.spec;
            this.studentToBuild.level = student.level;
            this.studentToBuild.course = student.course;
            this.studentToBuild.educationtype = student.educationtype;
            this.studentToBuild.enterdate = student.enterdate;
            this.studentToBuild.employed = student.employed;
            this.studentToBuild.stipendium = student.stipendium;
            this.studentToBuild.engaged = student.engaged;
            this.studentToBuild.komsomolets = student.komsomolets;
            return this;
        }

    /**
     * Setter method for StudentToBuild of Student object firstname field
     * @param firstname Sets firstname of StudentToBuild object
     */
        public Builder setFirstname(String firstname){
            studentToBuild.setFirstname(firstname);
            return this;
        }
// ... and the same method goes for every other 24 fields with each own parameters
        public Builder setLastname(String lastname){
            studentToBuild.setLastname(lastname);
            return this;
        }

        public Builder setPatronymic(String patronymic){
            studentToBuild.setPatronymic(patronymic);
            return this;
        }

        public Builder setGender(StudentGender gender){
            studentToBuild.setGender(gender);
            return this;
        }

        public Builder setBirthday(LocalDate birthday){
            studentToBuild.setBirthday(birthday);
            return this;
        }

        public Builder setNationality(String nationality){
            studentToBuild.setNationality(nationality);
            return this;
        }

        public Builder setOrigin(String origin){
            studentToBuild.setOrigin(origin);
            return this;
        }

        public Builder setBirthadress(String birthadress){
            studentToBuild.setBirthadress(birthadress);
            return this;
        }

        public Builder setCurrentadress(String currentadress){
            studentToBuild.setCurrentadress(currentadress);
            return this;
        }

        public Builder setPostindex(String postindex){
            studentToBuild.setPostindex(postindex);
            return this;
        }

        public Builder setEmail(String email){
            studentToBuild.setEmail(email);
            return this;
        }

        public Builder setMobilphone(int mobilphone){
            studentToBuild.setMobilphone(mobilphone);
            return this;
        }

        public Builder setSkype(String skype){
            studentToBuild.setSkype(skype);
            return this;
        }

        public Builder setTelegram(String telegram){
            studentToBuild.setTelegram(telegram);
            return this;
        }

        public Builder setInstagram(String instagram){
            studentToBuild.setInstagram(instagram);
            return this;
        }

        public Builder setUniversity(StudentUniver univer){
            studentToBuild.setUniversity(univer);
            return this;
        }

        public Builder setFaculty(StudentFaculty faculty){
            studentToBuild.setFaculty(faculty);
            return this;
        }

        public Builder setSpec(StudentSpeciality spec){
            studentToBuild.setSpec(spec);
            return this;
        }

        public Builder setLevel(StudentLevel level){
            studentToBuild.setLevel(level);
            return this;
        }

        public Builder setCourse(StudentCourse course){
            studentToBuild.setCourse(course);
            return this;
        }

        public Builder setEducationtype(StudentEducationType educationtype){
            studentToBuild.setEducationtype(educationtype);
            return this;
        }

        public Builder setEnterdate(LocalDate enterdate){
            studentToBuild.setEnterdate(enterdate);
            return this;
        }

        public Builder setEmployed(boolean employed){
            studentToBuild.setEmployed(employed);
            return this;
        }

        public Builder setStipendium(double stipendium){
            studentToBuild.setStipendium(stipendium);
            return this;
        }

        public Builder setEngaged(boolean engaged){
            studentToBuild.setEngaged(engaged);
            return this;
        }

        public Builder setKomsomolets(boolean komsomolets){
            studentToBuild.setKomsomolets(komsomolets);
            return this;
        }

// Method returns a built Student object with complete parameters
        public Student build(){
            return studentToBuild;
        }

    }

}
