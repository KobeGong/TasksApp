package defpackage;

import android.app.Notification;

/* renamed from: nh  reason: default package */
/* compiled from: PG */
public final class nh extends nk {
    private CharSequence a;

    public final nh a(CharSequence charSequence) {
        this.a = ni.e(charSequence);
        return this;
    }

    @Override // defpackage.nk
    public final void a(ne neVar) {
        new Notification.BigTextStyle(neVar.a).setBigContentTitle(this.b).bigText(this.a);
    }
}
