package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: adi  reason: default package */
/* compiled from: PG */
public final class adi implements Runnable {
    private final /* synthetic */ adh a;

    adi(adh adh) {
        this.a = adh;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void run() {
        adh adh = this.a;
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
        adh.n.setFloatValues(((Float) adh.n.getAnimatedValue()).floatValue(), 0.0f);
        adh.n.setDuration(500L);
        adh.n.start();
    }
}
