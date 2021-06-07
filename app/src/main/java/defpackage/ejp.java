package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

/* renamed from: ejp  reason: default package */
/* compiled from: PG */
public final class ejp implements Runnable {
    private final /* synthetic */ CronetBidirectionalStream a;

    public ejp(CronetBidirectionalStream cronetBidirectionalStream) {
        this.a = cronetBidirectionalStream;
    }

    public final void run() {
        synchronized (this.a.c) {
            if (!this.a.d()) {
                this.a.e = bg.aA;
                try {
                    this.a.a.a(this.a, this.a.g);
                } catch (Exception e) {
                    this.a.a(e);
                }
            }
        }
    }
}
