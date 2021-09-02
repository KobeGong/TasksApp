package defpackage;

/* renamed from: adi reason: default package */
/* compiled from: PG */
final class adi implements java.lang.Runnable {
    private final /* synthetic */ defpackage.adh a;

    adi(defpackage.adh adh) {
        this.a = adh;
    }

    public final void run() {
        defpackage.adh adh = this.a;
        switch (adh.o) {
            case 1:
                adh.n.cancel();
                break;
            case 2:
                break;
            default:
                return;
        }
        adh.o = 3;
        adh.n.setFloatValues(new float[]{((java.lang.Float) adh.n.getAnimatedValue()).floatValue(), 0.0f});
        adh.n.setDuration(500);
        adh.n.start();
    }
}
