public class DuckDuckGoose{
    public static void main(String[] args) {
        int headCount = 5;
        Player playerA = new Player("A");
        Player playerB = new Player("B");
        Player playerC = new Player("C");
        Player playerD = new Player("D");
        Player players[] = {playerA, playerB, playerC, playerD};

        for(Player player:players){
            System.out.println("Player: "+player.name);
        }
    }
}