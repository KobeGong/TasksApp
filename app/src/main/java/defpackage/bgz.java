package defpackage;

/* renamed from: bgz reason: default package */
/* compiled from: PG */
final class bgz implements java.util.concurrent.Callable {
    private /* synthetic */ android.content.SharedPreferences a;
    private /* synthetic */ java.lang.String b;
    private /* synthetic */ java.lang.String c;

    bgz(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.String str2) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
    }

    public final /* synthetic */ java.lang.Object call() {
        return this.a.getString(this.b, this.c);
    }
}
