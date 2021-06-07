package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dzg  reason: default package */
/* compiled from: PG */
public final class dzg extends dze {
    dzg() {
    }

    @Override // defpackage.dze
    public final boolean a(dzd dzd) {
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

    @Override // defpackage.dze
    public final void b(dzd dzd) {
        synchronized (dzd) {
            dzd.a = 0;
        }
    }
}
