package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

/* renamed from: ejs  reason: default package */
/* compiled from: PG */
public final class ejs implements Runnable {
    private final /* synthetic */ bkv a;
    private final /* synthetic */ CronetBidirectionalStream b;

    public ejs(CronetBidirectionalStream cronetBidirectionalStream, bkv bkv) {
        this.b = cronetBidirectionalStream;
        this.a = bkv;
    }

    public final void run() {
        this.b.a((CronetBidirectionalStream) this.a);
    }
}
