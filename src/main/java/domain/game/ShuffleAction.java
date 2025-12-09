package domain.game;

public class ShuffleAction implements CardAction {
    @Override
    public void execute(Game game, Player player) {
        game.getDeck().shuffleDeck();

        System.out.println("ShuffleAction executed: The deck has been shuffled!");
    }
}