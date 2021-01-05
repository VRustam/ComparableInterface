package Interface;


import java.util.Arrays;

public class ComparableInterface {
    public static void main(String[] args) {
        Student12 st1 = new Student12(5,"aydin");
        Student12 st2 = new Student12(6,"aydin1");
        Student12 st3 = new Student12(7,"aydin2");

        Student12[] students1={st1,st2,st3};
        System.out.println("Evvelki hali");
        for(Student12 gecici : students1){
            System.out.println(gecici);
        }

        Arrays.sort(students1);
        System.out.println("sonraki hali");
        for(Student12 gecici : students1){
            System.out.println(gecici);
        }
    }
}
class Student12 implements Comparable<Student12>{
    int id;
    String ad;

    public Student12(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student12 o) {
      /*  if(this.id < o.id){
            return 1;
        }else if (this.id > o.id){
            return  -1;
        }else return 0; */
        if(this.ad.compareTo(o.ad) < 0){
            return 1;
        }else if(this.ad.compareTo(o.ad) > 0){
            return  -1;
        }else return 0;

    }
}