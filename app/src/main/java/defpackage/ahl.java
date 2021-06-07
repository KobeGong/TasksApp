package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: ahl  reason: default package */
/* compiled from: PG */
public final class ahl {
    private final ahn a;
    private ahm b = new ahm();

    ahl(ahn ahn) {
        this.a = ahn;
    }

    /* access modifiers changed from: package-private */
    public final View a(int i, int i2, int i3, int i4) {
        int a2 = this.a.a();
        int b2 = this.a.b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a3 = this.a.a(i);
            int a4 = this.a.a(a3);
            int b3 = this.a.b(a3);
            ahm ahm = this.b;
            ahm.b = a2;
            ahm.c = b2;
            ahm.d = a4;
            ahm.e = b3;
            if (i3 != 0) {
                this.b.a = 0;
                this.b.a(i3);
                if (this.b.a()) {
                    return a3;
                }
            }
            if (i4 != 0) {
                this.b.a = 0;
                this.b.a(i4);
                if (this.b.a()) {
                    i += i5;
                    view = a3;
                }
            }
            a3 = view;
            i += i5;
            view = a3;
        }
        return view;
    }
}
