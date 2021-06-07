package defpackage;

import android.app.Dialog;

/* renamed from: bcf  reason: default package */
/* compiled from: PG */
final class bcf extends bas {
    private /* synthetic */ Dialog a;
    private /* synthetic */ bce b;

    bcf(bce bce, Dialog dialog) {
        this.b = bce;
        this.a = dialog;
    }

    @Override // defpackage.bas
    public final void a() {
        this.b.a.f();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
