package defpackage;

import android.view.View;

/* renamed from: ahe  reason: default package */
/* compiled from: PG */
final class ahe implements View.OnClickListener {
    private final yp a = new yp(this.b.a.getContext(), this.b.d);
    private final /* synthetic */ acr b;

    ahe(acr acr) {
        this.b = acr;
    }

    public final void onClick(View view) {
        if (this.b.e != null && this.b.f) {
            this.b.e.onMenuItemSelected(0, this.a);
        }
    }
}
