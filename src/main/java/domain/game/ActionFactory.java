package domain.game;

public class ActionFactory {

    public static CardAction createAction(CardType type) {
        switch (type) {
            case SKIP:
                return new SkipAction();
            case SHUFFLE:
                return new ShuffleAction();
            case EXPLODING_KITTEN:
                return new ExplodingKittenAction();
            case NOPE:
                return new NopeAction();
            default:
                return new DefaultAction();
        }
    }
}