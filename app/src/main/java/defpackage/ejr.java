package defpackage;

/* renamed from: ejr reason: default package */
/* compiled from: PG */
public final class ejr implements java.lang.Runnable {
    private final /* synthetic */ org.chromium.net.impl.CronetBidirectionalStream a;

    public ejr(org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream) {
        this.a = cronetBidirectionalStream;
    }

    public final void run() {
        try {
            this.a.a.c(this.a, this.a.g);
        } catch (java.lang.Exception e) {
            defpackage.dpt.c(org.chromium.net.impl.CronetUrlRequestContext.a, "Exception in onCanceled method", e);
        }
    }
}
