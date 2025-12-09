package domain.game;

public class NopeAction implements CardAction {
    @Override
    public void execute(Game game, Player player) {
        System.out.println("--- NOPE! Player " + player.getPlayerID() + " played a NOPE card! ---");
    }
}