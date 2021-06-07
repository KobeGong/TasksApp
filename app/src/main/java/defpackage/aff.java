package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aff  reason: default package */
/* compiled from: PG */
public final class aff implements ahn {
    private final /* synthetic */ afd a;

    aff(afd afd) {
        this.a = afd;
    }

    @Override // defpackage.ahn
    public final View a(int i) {
        return this.a.e(i);
    }

    @Override // defpackage.ahn
    public final int a() {
        return this.a.m();
    }

    @Override // defpackage.ahn
    public final int b() {
        return this.a.m - this.a.o();
    }

    @Override // defpackage.ahn
    public final int a(View view) {
        return afd.c(view) - ((afh) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.ahn
    public final int b(View view) {
        return ((afh) view.getLayoutParams()).bottomMargin + afd.e(view);
    }
}
