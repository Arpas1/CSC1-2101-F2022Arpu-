package HW1;

public class Main {
    public static void main(String[] args) {

        System.out.println("hellow world!!");
        System.out.println(2 + 3);
        // int age = 20;
        // String name = "arpa";
        // String fav = "black";

        Pyramid p = new Pyramid();
        {
            p.tumi();
        }
        Adlibs a1 = new Adlibs("arpa");
        {
            Adlibs a2 = new Adlibs();
            Adlibs a3 = new Adlibs(20);
            System.out.println("Hi my name is " + a1.name + " " + a2.fav + " is my favorit color"
                    + " I can't wait to be 21 but now I am " + a3.age);
        }//code worked


    }

        Replace r = new Replace();
        r.setword(10);
        System.out.println(r.getword());
        r.setletter("apple");
        System.out.println(r.getletter());
        r.setnum('a');
        System.out.println(r.getnum());

        System.out.println(r.sent.length());
        charReplace(sent,2,T)

    // Adlibs p1 = new Adlibs();{
    // System.out.println("hi my name is"+p1.name+" my age is" +p1.num+ "my favorit
    // color is" + p1.fav);}
    // Pyramid p = new Pyramid();
    // p.Output();
    // System.out.println(p);
}
