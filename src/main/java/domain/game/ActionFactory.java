package domain.game;

public class ActionFactory {

    public static CardAction createAction(CardType type) {
        switch (type) {
            case SKIP:
                return new SkipAction();
            default:
                return new DefaultAction();
        }
    }
}