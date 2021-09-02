package defpackage;

/* renamed from: nf reason: default package */
/* compiled from: PG */
public final class nf {
    public final android.os.Bundle a;
    public boolean b;
    public boolean c;
    public int d;
    public java.lang.CharSequence e;
    public android.app.PendingIntent f;

    public nf(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        this(i, charSequence, pendingIntent, new android.os.Bundle());
    }

    private nf(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle) {
        this.c = true;
        this.d = i;
        this.e = defpackage.ni.e(charSequence);
        this.f = pendingIntent;
        this.a = bundle;
        this.b = true;
        this.c = true;
    }
}
