public class PlayerService {
    public static final String SEPARATOR=";";
    public static Player createPlayer(){
        Player player=new Player();
        player.setNick(Util.readFromUser("Podaj nick:"));
        player.setEmail(Util.readFromUser("Podaj e-mail:"));
        player.setPhoneNumber(Util.readFromUser("Podaj numer telefonu:"));
        player.setCity(Util.readFromUser("Podaj miasto:"));
        player.setEdge(Util.readFromUser("Podaj wiek:"));
        player.setGender(Util.readFromUser("Podaj płeć:"));
        player.setDiscipline(Util.readFromUser("Podaj dyscyplinę:"));
        player.setLevel(Util.readFromUser("Podaj poziom zaawansowania:"));
        return player;
    }
    public static void addPlayer(Player player){
        String textPlayer=playerToText(player);
        Util.writeToFile("./players.txt",textPlayer);
    }

    public static String playerToText(Player player){
        return player.getNick()+SEPARATOR+ player.getEmail()+SEPARATOR+player.getPhoneNumber()+SEPARATOR+
                player.getCity()+SEPARATOR+player.getEdge()+SEPARATOR+player.getGender()+SEPARATOR+
                player.getDiscipline()+SEPARATOR+player.getLevel();
    }
}
