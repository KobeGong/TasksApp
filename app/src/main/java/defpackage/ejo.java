package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

/* renamed from: ejo  reason: default package */
/* compiled from: PG */
public final class ejo implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ CronetBidirectionalStream b;

    public ejo(CronetBidirectionalStream cronetBidirectionalStream, boolean z) {
        this.b = cronetBidirectionalStream;
        this.a = z;
    }

    public final void run() {
        synchronized (this.b.c) {
            if (!this.b.d()) {
                this.b.d = this.a;
                this.b.e = bg.aA;
                if (CronetBidirectionalStream.a(this.b.b) || !this.b.d) {
                    this.b.f = bg.aG;
                } else {
                    this.b.f = bg.aI;
                }
                try {
                    this.b.a.a(this.b);
                } catch (Exception e) {
                    this.b.a(e);
                }
            }
        }
    }
}
