package defpackage;

/* renamed from: akg reason: default package */
/* compiled from: PG */
final class akg implements java.lang.Runnable {
    private final /* synthetic */ android.content.Context a;
    private final /* synthetic */ java.lang.String b;
    private final /* synthetic */ java.lang.String c;
    private final /* synthetic */ defpackage.akf d;

    akg(defpackage.akf akf, android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.d = akf;
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        android.accounts.Account b2 = defpackage.ajd.b(this.a, this.b);
        if (b2 == null) {
            return;
        }
        if (this.d.a(b2.name).contains(this.c)) {
            new java.lang.Object[1][0] = defpackage.azb.a(b2.name);
            this.d.a(b2, this.c);
            return;
        }
        new java.lang.Object[1][0] = defpackage.azb.a(b2.name);
        this.d.b.a(b2);
        this.d.a(b2, this.c);
    }
}
