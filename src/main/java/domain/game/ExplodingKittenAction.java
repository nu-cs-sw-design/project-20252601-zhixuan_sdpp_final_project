package domain.game;

public class ExplodingKittenAction implements CardAction {
    @Override
    public void execute(Game game, Player player) {
        System.out.println("BOOM! Exploding Kitten triggered for player " + player.getPlayerID());

        if (player.hasCard(CardType.DEFUSE)) {
            System.out.println("Player has a Defuse card! Crisis averted (for now).");
            return;
        }

        player.setIsDead();
        System.out.println("Player " + player.getPlayerID() + " has exploded and is out of the game!");

        if (game.getPlayerTurn() == player.getPlayerID()) {
            game.setCurrentPlayerNumberOfTurns(0);
        }
    }
}