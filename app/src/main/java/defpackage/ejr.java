package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;
import org.chromium.net.impl.CronetUrlRequestContext;

/* renamed from: ejr  reason: default package */
/* compiled from: PG */
public final class ejr implements Runnable {
    private final /* synthetic */ CronetBidirectionalStream a;

    public ejr(CronetBidirectionalStream cronetBidirectionalStream) {
        this.a = cronetBidirectionalStream;
    }

    public final void run() {
        try {
            this.a.a.c(this.a, this.a.g);
        } catch (Exception e) {
            dpt.c(CronetUrlRequestContext.a, "Exception in onCanceled method", e);
        }
    }
}
