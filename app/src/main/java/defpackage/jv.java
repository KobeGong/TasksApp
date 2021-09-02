package defpackage;

/* renamed from: jv reason: default package */
/* compiled from: PG */
final class jv {
    public static final defpackage.jy a;

    static void a(android.view.ViewGroup viewGroup, boolean z) {
        a.a(viewGroup, z);
    }

    static {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            a = new defpackage.jx();
        } else {
            a = new defpackage.jy();
        }
    }
}
