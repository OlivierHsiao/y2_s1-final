// package finalReview;

public class StaticVar {
    private static int idCount = 0;
    public int studentId;

    public StaticVar() {
        this.studentId = idCount;
        idCount++;
    }

    public static void main(String[] arg) {
        System.out.println(StaticVar.idCount);
        new StaticVar();
        new StaticVar();
        StaticVar a = new StaticVar();
        System.out.println(a.studentId);
    }
}
