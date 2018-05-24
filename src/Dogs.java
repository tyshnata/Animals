/* Class describing dogs*/
public class Dogs {

    private static String name; // dog's name
    private static String breed; // dog's breed

    public  Dogs(String name,String breed ){
        this.name = name;
        this.breed = breed;
    }
/* method; the dog says his name */
    public static void sayName(){
       System.out.println("Hello! My name is " + name + ".");
    }
    /* method; the dog says his breed */
    public static void sayBreed(){
        System.out.println("I'm a dog of the " + breed + " breed." );
    }


}
