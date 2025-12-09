package domain.game;

public class SkipAction implements CardAction {

    @Override
    public void execute(Game game, Player player) {
        game.decrementNumberOfTurns();

        if (game.getNumberOfTurns() == 0) {
            game.incrementPlayerTurn();
        }

        System.out.println("SkipAction executed for player " + player.getPlayerID());
    }
}