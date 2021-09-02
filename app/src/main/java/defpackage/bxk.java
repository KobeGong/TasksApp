package defpackage;

/* renamed from: bxk reason: default package */
/* compiled from: PG */
public final class bxk {
    public static volatile defpackage.bxl a = null;

    public static defpackage.bxl a(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof defpackage.cqb) {
            return (defpackage.bxl) ((defpackage.cqb) applicationContext).a();
        }
        if (applicationContext instanceof defpackage.aik) {
            return (defpackage.bxl) ((defpackage.aik) applicationContext).a();
        }
        defpackage.cld.b(a != null, (java.lang.Object) "Unable to get ChimeComponent from host app.");
        return a;
    }
}
