package defpackage;

/* renamed from: bgy reason: default package */
/* compiled from: PG */
final class bgy implements java.util.concurrent.Callable {
    private /* synthetic */ android.content.SharedPreferences a;
    private /* synthetic */ java.lang.String b;
    private /* synthetic */ java.lang.Long c;

    bgy(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.Long l) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = l;
    }

    public final /* synthetic */ java.lang.Object call() {
        return java.lang.Long.valueOf(this.a.getLong(this.b, this.c.longValue()));
    }
}
