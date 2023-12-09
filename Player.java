import java.util.Random;

public class Player {
    private Random random = new Random();
    private String[] temperaments = {"Angry", "Funny", "Neutral", "Melancholy"};
    String name;
    String temperament;

    public Player(String name){
        int index = random.nextInt(temperaments.length); 
        this.temperament = temperaments[index];
        this.name = name;
    }

    public void selected(){
        if(this.temperament == "Angry"){
            System.out.println("Player: " + name + " was selected.");
            System.out.println("******** Son of a *********");
        }
        else if(this.temperament == "Funny"){
            System.out.println("Player: " + name + " was selected.");
            System.out.println("Hahahahahah This was fun.");
        }
        else if(this.temperament == "Neutral"){
            System.out.println("Player: " + name + " was selected.");
            System.out.println("This emotion does not exist. I am neutral");
        }
        else{
            System.out.println("Player: " + name +  "was selected.");
            System.out.println("Congrats, you have found melancholy.");
        }

    }
}
