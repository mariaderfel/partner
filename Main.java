public class Main {
    public static void main(String[] args) {
        Player gracz=new Player();
        gracz=PlayerService.createPlayer();
        PlayerService.addPlayer(gracz);
    }
}
