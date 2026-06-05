package planet;

public class NotInSameGalaxy extends RuntimeException {
    public NotInSameGalaxy() {
        super("far far away");
    }
}
