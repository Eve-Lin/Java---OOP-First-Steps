public class Website {

    String webName;
    int webAge;


    //constructor
    Website(String webName, int webAge){

        this.webName = webName;
        this.webAge = webAge;
    }

    public static void main(String[] args) {

        Website myWebsite = new Website("EveLinCode",2);
        Website google = new Website("Google",20);

        System.out.printf("My website is %s and it has been around for roughly %d years(since 2016).%n", myWebsite.webName, myWebsite.webAge);
        System.out.printf("%s was founded in 1998 - roughly %d years ago.", google.webName, google.webAge);
    }
}
