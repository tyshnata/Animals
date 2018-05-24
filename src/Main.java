public class Main {

    public static void main (String[] args){
        Dogs dog1 = new Dogs("Star", "Spitz");
        Dogs dog2 = new Dogs("Fox","Dachshund");
        Dogs dog3 = new Dogs("Boss","Pug");

        dog1.sayName();
        dog1.sayBreed();
        dog2.sayName();
        dog2.sayBreed();
        dog3.sayName();
        dog3.sayBreed();
    }
}
