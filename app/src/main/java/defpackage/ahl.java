package defpackage;

/* renamed from: ahl reason: default package */
/* compiled from: PG */
final class ahl {
    private final defpackage.ahn a;
    private defpackage.ahm b = new defpackage.ahm();

    ahl(defpackage.ahn ahn) {
        this.a = ahn;
    }

    /* access modifiers changed from: 0000 */
    public final android.view.View a(int i, int i2, int i3, int i4) {
        int a2 = this.a.a();
        int b2 = this.a.b();
        int i5 = i2 > i ? 1 : -1;
        android.view.View view = null;
        while (i != i2) {
            android.view.View a3 = this.a.a(i);
            int a4 = this.a.a(a3);
            int b3 = this.a.b(a3);
            defpackage.ahm ahm = this.b;
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
