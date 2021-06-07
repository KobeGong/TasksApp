package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

/* renamed from: ejq  reason: default package */
/* compiled from: PG */
public final class ejq implements Runnable {
    private final /* synthetic */ ejh a;
    private final /* synthetic */ CronetBidirectionalStream b;

    public ejq(CronetBidirectionalStream cronetBidirectionalStream, ejh ejh) {
        this.b = cronetBidirectionalStream;
        this.a = ejh;
    }

    public final void run() {
        synchronized (this.b.c) {
            if (!this.b.d()) {
                try {
                    this.b.a.a(this.b, this.b.g, this.a);
                } catch (Exception e) {
                    this.b.a(e);
                }
            }
        }
    }
}
