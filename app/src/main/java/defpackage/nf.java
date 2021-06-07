package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* renamed from: nf  reason: default package */
/* compiled from: PG */
public final class nf {
    public final Bundle a;
    public boolean b;
    public boolean c;
    public int d;
    public CharSequence e;
    public PendingIntent f;

    public nf(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i, charSequence, pendingIntent, new Bundle());
    }

    private nf(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.c = true;
        this.d = i;
        this.e = ni.e(charSequence);
        this.f = pendingIntent;
        this.a = bundle;
        this.b = true;
        this.c = true;
    }
}
