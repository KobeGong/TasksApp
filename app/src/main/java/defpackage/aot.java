package defpackage;

/* renamed from: aot reason: default package */
/* compiled from: PG */
public final class aot extends defpackage.aoq {
    private final java.lang.String b;

    public aot(android.content.Intent intent) {
        this.b = intent.getStringExtra("query");
    }

    public final defpackage.aof a(android.content.Context context, java.lang.String str) {
        java.lang.String str2 = this.b;
        defpackage.ala ala = new defpackage.ala();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("query", str2);
        ala.e(bundle);
        return defpackage.aof.a(null, ala);
    }
}
