public class ConstructorDestuctor {

    class student {
        class address {
            String city;
            String state;
            String country;

        }

        String name;
        int roll;
        String password;
        int marks[];new int[3];

        // NON PARAMETRISED CONSTRUCTOR
        // student()
        // {
        // System.out.println("Constructor is called");
        // }

        // PARAMETRISED CONSTRUCTOR
        // student(string name)
        // {
        // this.name = name;
        // }
        // student(int roll)
        // {
        // this.age = roll;
        // }

        // COPY CONSTRUCTOR SHALLOW COPY
        student (student s1)
        marks[]=new int [3];
        {
            this.name = s1.name;
            this.roll = s1.roll;
            this.marks = s1.marks;
        }

        student(String name) {
            marks = new int[3];
            this.name = name;
        }

        student(int roll) {
            marks = new int[3];
            this.roll = roll;
        }
    }

    // DEEP COPY CONSTRUCTOR

    student (student s1)
    {
        marks= new int [3];
        this.name  = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<3;i++)
        {
            this.marks[i] = s1.marks[i];
        }
    }

    // DESTRUCTOR
    ~student()

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "kush";
        s1.roll = 39;
        s1.password = "abcd";
        s1.marks[0] = 90;
        s1.marks[1] = 93;
        s1.marks[2] = 95;
        student s2 = new student(s1);
        s2.name = "mittal";
        s2.password = "xyz";
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
