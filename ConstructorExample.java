public class ConstructorExample {

    String country;
    String capital;


   //Default constructor
    ConstructorExample(){
        this.country = "Bulgaria";
        this.capital = "Sofia";
    }

    //Parametarized constructor
    ConstructorExample(String nextCountry, String nextCapital){

      this.country = nextCountry;
      this.capital = nextCapital;
    }

    public static void main(String[] args) {
        ConstructorExample firstCountry = new ConstructorExample();
        ConstructorExample secondCountry = new ConstructorExample("Denmark","Copenhagen");

        System.out.printf("The capital of my lovely home country %s is %s.%n",firstCountry.country,firstCountry.capital);
        System.out.printf("The capital of another dear country (%s) is %s.%n",secondCountry.country,secondCountry.capital);

    }


}
