package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: afe  reason: default package */
/* compiled from: PG */
public final class afe implements ahn {
    private final /* synthetic */ afd a;

    afe(afd afd) {
        this.a = afd;
    }

    @Override // defpackage.ahn
    public final View a(int i) {
        return this.a.e(i);
    }

    @Override // defpackage.ahn
    public final int a() {
        return this.a.l();
    }

    @Override // defpackage.ahn
    public final int b() {
        return this.a.l - this.a.n();
    }

    @Override // defpackage.ahn
    public final int a(View view) {
        return afd.b(view) - ((afh) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.ahn
    public final int b(View view) {
        return ((afh) view.getLayoutParams()).rightMargin + afd.d(view);
    }
}
