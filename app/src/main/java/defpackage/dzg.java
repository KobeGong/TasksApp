package defpackage;

/* renamed from: dzg reason: default package */
/* compiled from: PG */
final class dzg extends defpackage.dze {
    dzg() {
    }

    public final boolean a(defpackage.dzd dzd) {
        boolean z;
        synchronized (dzd) {
            if (dzd.a == 0) {
                dzd.a = -1;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void b(defpackage.dzd dzd) {
        synchronized (dzd) {
            dzd.a = 0;
        }
    }
}
