import java.util.Random;

public class Player {
    private Random random = new Random();
    private String[] temperments = {"Angry", "Funny", "Neutral"};
    String name;
    String temperment;

    public Player(String name){
        int index = random.nextInt(temperments.length); 
        this.temperment = temperments[index];
        this.name = name;
    }

    public void selected(){
        if(this.temperment == "Angry"){
            System.out.println("Player: " + name + " was selected.");
            System.out.println("******** Son of a *********");
        }
        else if(this.temperment == "Funny"){
            System.out.println("Player: " + name + " was selected.");
            System.out.println("Hahahahahah This was fun.");
        }
        else if(this.temperment == "Neutral"){
            System.out.println("Player: " + name + " was selected.");
            System.out.println("This emotion does not exist. I am nuetral");
        }
        else{
            System.out.println("Player: " + name +  "was selected.");
            System.out.println("Congrats, you have found melancholy.");
        }

    }
}
