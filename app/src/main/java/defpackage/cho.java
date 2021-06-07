package defpackage;

/* renamed from: cho  reason: default package */
/* compiled from: PG */
final class cho implements Runnable {
    private final /* synthetic */ chq a;

    cho(chq chq) {
        this.a = chq;
    }

    public final void run() {
        chn chn = this.a.a;
        if (chn.i.getAndSet(false)) {
            chn.a(2, chn.j);
            chn.a(3, (edw) null);
        }
    }
}
