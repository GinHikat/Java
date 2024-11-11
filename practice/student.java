public class student {
    String courseid;
    String lectid;
    String stuid;
    String name;
    int mid;
    int fin;
    String result;
    public void display() {
        System.out.println("CourseID\tLecturerID\tStudentID\tName\tmidterm\t\tfinal\t\tresult");
        System.out.println(courseid + "\t\t" + lectid+"\t\t"+stuid+"\t\t" +name+"\t" +mid +"\t\t" +fin+"\t\t"+result);
    }
    public student(String courseid, String lectid, String stuid, String name, int mid, int fin, String result) {
        this.courseid = courseid;
        this.lectid = lectid;
        this.stuid = stuid;
        this.name = name;
        this.mid = mid;
        this.fin = fin;
        this.result = result;
    }
}