import java.time.LocalDate;
import java.util.Objects;

/*
* Classname: Student
*
* @Version     1.10  12 June 2020
* @Author      Klymenko Sergij, ONPU
*
*  Module 2 task 4. Programming patterns. Factory, Builder.
*
* Develop for your class:
*
*  1. Factory.
*  2. Abstract factory.
*  3. Create a class Student  - 25 fields.
*  4. Create a builder for the class Student
*
* */

public class Student {

    // firstName String, set the First Name of Student
    private String firstName;
    // lastName String, set the Last Name of Student
    private String lastName;
    // patronymic String, set the Patronymic of Student
    private String patronymic;
    // gender enum StudentGender, set the Gender of Student
    // enum StudentGender: Male or Female
    private StudentGender gender;
    // birthday LocalDate, set the Birthday of Student
    /* LocalDate.of(int year, int month, int day) */
    private LocalDate birthday;

    // nationality String, set the Nationality of Student
    private String nationality;
    // origin String, set the Origin of Student
    private String origin;
    // birthAdress String, set the Birth Adress of Student
    private String birthAdress;
    // currentAdress String, set the Current Adress of Student
    private String currentAdress;
    // postIndex String, set the Post Index of Student
    private String postIndex;

    // email String, set the Email of Student
    private String email;
    // mobilPhone int, set the Mobile Phone of Student
    private int mobilPhone;
    // skype String, set the Skype of Student
    private String skype;
    // telegram String, set the Telegram of Student
    private String telegram;
    // instagram String, set the Instagram of Student
    private String instagram;

    // university enum StudentUniver, set the University of Student
    // enum StudentUniver: ONPU, ONMA, MGU, ONUiM;
    private StudentUniver university;
    // faculty enum StudentFaculty, set the Faculty of Student
    // enum StudentFacylty: IPTDM, IKS, IEE, IEBRT;
    private StudentFaculty faculty;
    // spec enum StudentSpeciality, set the Speciality of Student
    // enum StudentSpeciality: DESIGN, SOFTWARE_ENGINEERING, NETWORKS, GUI;
    private StudentSpeciality spec;
    // level enum StudentLevel, set the Level of Student
    // enum StudentLevel: BACHELOR, MASTER;
    private StudentLevel level;
    // course enum StudentCourse, set the Course of Student
    // enum StudentCourse: FIRST, SECOND, THIRD, FOURTH, FIFTH;
    private StudentCourse course;
    // educationType enum StudentEducationType, set the Education Type of Student
    // enum StudentEducationType: FULL_TIME or PART_TIME
    private StudentEducationType educationType;

    // enterDate LocalDate, set the Enter to University Date of Student
    /* LocalDate.of(int year, int month, int day) */
    private LocalDate enterDate;
    // employed boolean, checks whether the Student is Employed
    private boolean employed;
    // stipendium double, set the Stipendium of Student
    private double stipendium;
    // employed boolean, checks whether the Student is Engaged
    private boolean engaged;
    // komsomolets boolean, checks whether the Student is Komsomolets
    private boolean komsomolets;

    /**
     * Class constructor with parameters
     * @param firstName String, set to Student object
     * @param lastName String, set to Student object
     *                 ...every other String parameter does the same
     * @param birthday LocalDate, set to Student object
     * @param enterDate LocalDate, set to Student object
     * @param mobilPhone int, set to Student object
     * @param employed boolean, set to Student object
     * @param engaged boolean, set to Student object
     * @param stipendium double, set to Student object
     * @param gender enum StudentGender, set to Student object
     * @param university enum StudentUniver, set to Student object
     * @param faculty enum StudentFaculty, set to Student object
     * @param spec enum StudentSpeciality, set to Student object
     * @param level enum StudentLevel, set to Student object
     * @param course enum StudentCourse, set to Student object
     * @param educationType enum StudentEducationType, set to Student object

     */

    /*
     * Class constructor with parameters
     */

    public Student(String firstName,
                   String lastName,
                   String patronymic,
                   StudentGender gender,
                   LocalDate birthday,
                   String nationality,
                   String origin,
                   String birthAdress,
                   String currentAdress,
                   String postIndex,
                   String email,
                   int mobilPhone,
                   String skype,
                   String telegram,
                   String instagram,
                   StudentUniver university,
                   StudentFaculty faculty,
                   StudentSpeciality spec,
                   StudentLevel level,
                   StudentCourse course,
                   StudentEducationType educationType,
                   LocalDate enterDate,
                   boolean employed,
                   double stipendium,
                   boolean engaged,
                   boolean komsomolets) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.gender = gender;
        this.birthday = birthday;
        this.nationality = nationality;
        this.origin = origin;
        this.birthAdress = birthAdress;
        this.currentAdress = currentAdress;
        this.postIndex = postIndex;
        this.email = email;
        this.mobilPhone = mobilPhone;
        this.skype = skype;
        this.telegram = telegram;
        this.instagram = instagram;
        this.university = university;
        this.faculty = faculty;
        this.spec = spec;
        this.level = level;
        this.course = course;
        this.educationType = educationType;
        this.enterDate = enterDate;
        this.employed = employed;
        this.stipendium = stipendium;
        this.engaged = engaged;
        this.komsomolets = komsomolets;
    }

    /*
     * Default constructor
     */
    public Student(){}

    /**
     * Getter for Student firstName field
     * @return Returns firstName of Student object
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Setter for Student firstName field
     * @param firstName Sets firstName of Student object
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Every other getter and setter for 24 fields of Student object
     * do ABSOLUTELY ANALOGICAL function
     * as the first ones for firstName, save for each its own parameter
     */
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getBirthAdress() {
        return birthAdress;
    }
    public void setBirthAdress(String birthAdress) {
        this.birthAdress = birthAdress;
    }

    public String getCurrentAdress() {
        return currentAdress;
    }
    public void setCurrentAdress(String currentAdress) {
        this.currentAdress = currentAdress;
    }

    public String getPostIndex() {
        return postIndex;
    }
    public void setPostIndex(String postIndex) {
        this.postIndex = postIndex;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobilPhone() {
        return mobilPhone;
    }
    public void setMobilPhone(int mobilPhone) {
        this.mobilPhone = mobilPhone;
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

    public StudentEducationType getEducationType() {
        return educationType;
    }
    public void setEducationType(StudentEducationType educationType) {
        this.educationType = educationType;
    }

    public LocalDate getEnterDate() {
        return enterDate;
    }
    public void setEnterDate(LocalDate enterDate) {
        this.enterDate = enterDate;
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

    /**
     * Method toString() for class Student
     * @return Returns info about Student
     */
    @Override
    public String toString() {
        return "\nStudent{" +
                "\n\t firstName='" + firstName + '\'' +
                "\n\t, lastName='" + lastName + '\'' +
                "\n\t, patronymic='" + patronymic + '\'' +
                "\n\t, gender=" + gender +
                "\n\t, birthday=" + birthday +
                "\n\t, nationality='" + nationality + '\'' +
                "\n\t, origin='" + origin + '\'' +
                "\n\t, birthAdress='" + birthAdress + '\'' +
                "\n\t, currentAdress='" + currentAdress + '\'' +
                "\n\t, postindex='" + postIndex + '\'' +
                "\n\t, email='" + email + '\'' +
                "\n\t, mobilphone=" + mobilPhone +
                "\n\t, skype='" + skype + '\'' +
                "\n\t, telegram='" + telegram + '\'' +
                "\n\t, instagram='" + instagram + '\'' +
                "\n\t, university=" + university +
                "\n\t, faculty=" + faculty +
                "\n\t, spec=" + spec +
                "\n\t, level=" + level +
                "\n\t, course=" + course +
                "\n\t, educationtype=" + educationType +
                "\n\t, enterdate=" + enterDate +
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
                getMobilPhone() == student.getMobilPhone() &&
                isEmployed() == student.isEmployed() &&
                Double.compare(student.getStipendium(), getStipendium()) == 0 &&
                isEngaged() == student.isEngaged() &&
                isKomsomolets() == student.isKomsomolets() &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Objects.equals(getPatronymic(), student.getPatronymic()) &&
                getGender() == student.getGender() &&
                Objects.equals(getNationality(), student.getNationality()) &&
                Objects.equals(getOrigin(), student.getOrigin()) &&
                Objects.equals(getBirthAdress(), student.getBirthAdress()) &&
                Objects.equals(getCurrentAdress(), student.getCurrentAdress()) &&
                Objects.equals(getPostIndex(), student.getPostIndex()) &&
                Objects.equals(getEmail(), student.getEmail()) &&
                Objects.equals(getSkype(), student.getSkype()) &&
                Objects.equals(getTelegram(), student.getTelegram()) &&
                Objects.equals(getInstagram(), student.getInstagram()) &&
                getUniversity() == student.getUniversity() &&
                getFaculty() == student.getFaculty() &&
                getSpec() == student.getSpec() &&
                getLevel() == student.getLevel() &&
                getCourse() == student.getCourse() &&
                getEducationType() == student.getEducationType() &&
                Objects.equals(getEnterDate(), student.getEnterDate());
    }

    /**
     * Method to get object hash
     * @return Returns Student object hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPatronymic(), getGender(),
                getBirthday(), getNationality(), getOrigin(), getBirthAdress(), getCurrentAdress(),
                getPostIndex(), getEmail(), getMobilPhone(), getSkype(), getTelegram(),
                getInstagram(), getUniversity(), getFaculty(), getSpec(), getLevel(), getCourse(),
                getEducationType(), getEnterDate(), isEmployed(), getStipendium(), isEngaged(), isKomsomolets());
    }



    /*
     * Pattern Builder takes a basic Student with all setters for StudentToBuild
     */
    public static class Builder{

        private Student studentToBuild;

    /*
     * Builder pattern based on the Student object StudentToBuild with all the field setters
     * Builder constructor creates Student type object and assigns it to studentToBuild field
     */
        public Builder() {
            this.studentToBuild = new Student();
        }

    /**
     *  Constructor setSimilarTo complements the new instance of StudentToBuild object
     *  based on the first instance of the class
     *  @param student is an object from which all parameters are taken
     *  @return Returns new Student object with same fields as a parameter object has
     */
        public Builder setSimilarTo(Student student){
            this.studentToBuild.firstName = student.firstName;
            this.studentToBuild.lastName = student.lastName;
            this.studentToBuild.patronymic = student.patronymic;
            this.studentToBuild.gender = student.gender;
            this.studentToBuild.birthday = student.birthday;
            this.studentToBuild.nationality = student.nationality;
            this.studentToBuild.origin = student.origin;
            this.studentToBuild.birthAdress = student.birthAdress;
            this.studentToBuild.currentAdress = student.currentAdress;
            this.studentToBuild.postIndex = student.postIndex;
            this.studentToBuild.email = student.email;
            this.studentToBuild.mobilPhone = student.mobilPhone;
            this.studentToBuild.skype = student.skype;
            this.studentToBuild.telegram = student.telegram;
            this.studentToBuild.instagram = student.instagram;
            this.studentToBuild.university = student.university;
            this.studentToBuild.faculty = student.faculty;
            this.studentToBuild.spec = student.spec;
            this.studentToBuild.level = student.level;
            this.studentToBuild.course = student.course;
            this.studentToBuild.educationType = student.educationType;
            this.studentToBuild.enterDate = student.enterDate;
            this.studentToBuild.employed = student.employed;
            this.studentToBuild.stipendium = student.stipendium;
            this.studentToBuild.engaged = student.engaged;
            this.studentToBuild.komsomolets = student.komsomolets;
            return this;
        }

    /**
     * Setter for StudentToBuild of Student object firstName field
     * @param firstName Sets firstName of StudentToBuild object
     */
        public Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this;
        }
// ... and the same method goes for every other 24 fields with each own parameters
        public Builder setLastName(String lastName){
            studentToBuild.setLastName(lastName);
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

        public Builder setBirthAdress(String birthAdress){
            studentToBuild.setBirthAdress(birthAdress);
            return this;
        }

        public Builder setCurrentAdress(String currentAdress){
            studentToBuild.setCurrentAdress(currentAdress);
            return this;
        }

        public Builder setPostIndex(String postIndex){
            studentToBuild.setPostIndex(postIndex);
            return this;
        }

        public Builder setEmail(String email){
            studentToBuild.setEmail(email);
            return this;
        }

        public Builder setMobilPhone(int mobilPhone){
            studentToBuild.setMobilPhone(mobilPhone);
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

        public Builder setEducationType(StudentEducationType educationType){
            studentToBuild.setEducationType(educationType);
            return this;
        }

        public Builder setEnterDate(LocalDate enterDate){
            studentToBuild.setEnterDate(enterDate);
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

      /*
       * Method returns a built Student object with complete parameters
       * @return studentToBuild as a Student object
       */
        public Student build(){
            return studentToBuild;
        }

    }

}
