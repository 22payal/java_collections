import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
   private String Name;
   private Double Score;
   private Double Age;

   public Student(String Name,Double Score,Double Age)
   {
       this.Name=Name;
       this.Score=Score;
       this.Age=Age;
   }

    public String getName() {

        String[] FirstName = Name.split("\\s+");

        return FirstName[0];
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getScore() {
        return Score;
    }

    public void setScore(Double score) {
        Score = score;
    }

    public Double getAge() {
        return Age;
    }

    public void setAge(Double age) {
        Age = age;
    }


}

class question5
{
    public static void main(String[] args)
    {
        ArrayList<Student> ar = new ArrayList<Student>();

        ar.add(new Student("abc ggh", 95.9, 22.0));
        ar.add(new Student("cde hhg", 89.8, 23.0));
        ar.add(new Student("fz  jkh", 89.8, 23.0));
        ar.add(new Student("xyz bmn", 67.8, 21.0));


        Collections.sort(ar, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.getScore() == s2.getScore()) {
                    if(s1.getName().compareTo(s2.getName()) < 0){
                        return -1;
                    } else {
                        return 1;
                    }
                } else if(s1.getScore() > s2.getScore()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        System.out.println("Students in increasing order of marks:");
        for (Student s: ar)
        {
            System.out.println(s.getName() + " " + s.getScore());
        }
    }



}
