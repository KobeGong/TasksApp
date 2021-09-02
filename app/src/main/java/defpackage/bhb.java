package defpackage;

/* renamed from: bhb reason: default package */
/* compiled from: PG */
final class bhb implements java.util.concurrent.Callable {
    private /* synthetic */ android.content.Context a;

    bhb(android.content.Context context) {
        this.a = context;
    }

    public final /* synthetic */ java.lang.Object call() {
        return this.a.getSharedPreferences("google_sdk_flags", 0);
    }
}
