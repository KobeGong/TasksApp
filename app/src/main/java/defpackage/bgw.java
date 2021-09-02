package defpackage;

/* renamed from: bgw reason: default package */
/* compiled from: PG */
final class bgw implements java.util.concurrent.Callable {
    private /* synthetic */ android.content.SharedPreferences a;
    private /* synthetic */ java.lang.String b;
    private /* synthetic */ java.lang.Boolean c;

    bgw(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.Boolean bool) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = bool;
    }

    public final /* synthetic */ java.lang.Object call() {
        return java.lang.Boolean.valueOf(this.a.getBoolean(this.b, this.c.booleanValue()));
    }
}
