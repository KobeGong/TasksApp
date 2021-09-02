package defpackage;

/* renamed from: bgx reason: default package */
/* compiled from: PG */
final class bgx implements java.util.concurrent.Callable {
    private /* synthetic */ android.content.SharedPreferences a;
    private /* synthetic */ java.lang.String b;
    private /* synthetic */ java.lang.Integer c;

    bgx(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.Integer num) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = num;
    }

    public final /* synthetic */ java.lang.Object call() {
        return java.lang.Integer.valueOf(this.a.getInt(this.b, this.c.intValue()));
    }
}
