package defpackage;

/* renamed from: eez  reason: default package */
/* compiled from: PG */
public final class eez extends dlz {
    private static volatile eez[] a;

    public static eez[] d() {
        if (a == null) {
            synchronized (dmd.b) {
                if (a == null) {
                    a = new eez[0];
                }
            }
        }
        return a;
    }

    public eez() {
        this.k = -1;
    }

    @Override // defpackage.dmf
    public final /* synthetic */ dmf a(dlw dlw) {
        int a2;
        do {
            a2 = dlw.a();
            switch (a2) {
                case 0:
                    return this;
            }
        } while (super.a(dlw, a2));
        return this;
    }
}
