package defpackage;

/* renamed from: ejs reason: default package */
/* compiled from: PG */
public final class ejs implements java.lang.Runnable {
    private final /* synthetic */ defpackage.bkv a;
    private final /* synthetic */ org.chromium.net.impl.CronetBidirectionalStream b;

    public ejs(org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream, defpackage.bkv bkv) {
        this.b = cronetBidirectionalStream;
        this.a = bkv;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
