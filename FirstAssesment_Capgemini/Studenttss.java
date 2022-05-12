

// 4. Create a class that captures students. Each student has a first name, last name, class year, and major. 
// Declare these variables as private and provide getter and setter methods for these variables
// Create two examples of students(means create 2 objects of Student class). 
// 


class Studenttss {
    private String fname ;
    private String lname ;
    private int year ;
    private String major;

    public void setfname(String fname) {
        this.fname = fname;
    }
    public void setlname(String lname) {
        this.lname = lname;
    }
    public void setyear(int year) {
        this.year = year;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getfname() {
        return fname;
    }
    public String getlname() {
        return lname;
    }
    public String getMajor() {
        return major;
    }
    public int getyear() {
        return year;
    }


    public static void main(String[] args) {
        
        Studenttss s1 = new Studenttss();
        Studenttss s2 = new Studenttss();

        s1.setfname("abc");
        s1.setlname("qwe");
        s1.setMajor("cse");
        s1.setyear(1995);

        s2.setfname("bnm");
        s2.setlname("poi");
        s2.setMajor("cse");
        s2.setyear(1996);

        System.out.println(s1.getfname());
        System.out.println(s1.getlname());
        System.out.println(s1.getMajor());
        System.out.println(s1.getyear());

        System.out.println("\n ");
        
        System.out.println(s2.getfname());
        System.out.println(s2.getlname());
        System.out.println(s2.getMajor());
        System.out.println(s2.getyear());
    }
}