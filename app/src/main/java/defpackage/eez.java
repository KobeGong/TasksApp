package defpackage;

/* renamed from: eez reason: default package */
/* compiled from: PG */
public final class eez extends defpackage.dlz {
    private static volatile defpackage.eez[] a;

    public static defpackage.eez[] d() {
        if (a == null) {
            synchronized (defpackage.dmd.b) {
                if (a == null) {
                    a = new defpackage.eez[0];
                }
            }
        }
        return a;
    }

    public eez() {
        this.k = -1;
    }

    public final /* synthetic */ defpackage.dmf a(defpackage.dlw dlw) {
        int a2;
        do {
            a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
            }
            return this;
        } while (super.a(dlw, a2));
        return this;
    }
}
