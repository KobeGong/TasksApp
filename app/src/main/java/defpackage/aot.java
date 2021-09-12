package defpackage;

/* renamed from: aot reason: default package */
/* compiled from: PG */
public final class aot extends defpackage.aoq {
    private final java.lang.String query;

    public aot(android.content.Intent intent) {
        this.query = intent.getStringExtra("query");
    }

    public final AbsActivityConfig a(android.content.Context context, java.lang.String str) {
        defpackage.ala ala = new defpackage.ala();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("query", this.query);
        ala.e(bundle);
        return AbsActivityConfig.a(null, ala);
    }
}
