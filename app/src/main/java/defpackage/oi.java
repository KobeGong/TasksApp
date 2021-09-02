package defpackage;

/* renamed from: oi reason: default package */
/* compiled from: PG */
final class oi extends android.os.Handler {
    oi() {
        super(android.os.Looper.getMainLooper());
    }

    public final void handleMessage(android.os.Message message) {
        defpackage.oh ohVar = (defpackage.oh) message.obj;
        switch (message.what) {
            case 1:
                defpackage.oe oeVar = ohVar.a;
                java.lang.Object obj = ohVar.b[0];
                if (oeVar.f.get()) {
                    oeVar.a();
                } else {
                    oeVar.a(obj);
                }
                oeVar.e = defpackage.bg.C;
                return;
            case 2:
                defpackage.oe.c();
                return;
            default:
                return;
        }
    }
}
