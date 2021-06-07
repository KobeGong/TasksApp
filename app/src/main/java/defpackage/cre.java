package defpackage;

import java.io.IOException;
import java.net.URI;

/* access modifiers changed from: package-private */
/* renamed from: cre  reason: default package */
/* compiled from: PG */
public final class cre implements Runnable {
    private final /* synthetic */ crf a;
    private final /* synthetic */ crd b;

    cre(crd crd, URI uri, crf crf) {
        this.b = crd;
        this.a = crf;
    }

    public final void run() {
        crd crd = this.b;
        crf crf = this.a;
        try {
            crf.a(crd.b());
        } catch (Throwable th) {
            if (th instanceof IOException) {
                crf.a.a(dpw.i.a("Credentials failed to obtain metadata").b(th));
            } else {
                crf.a.a(dpw.f.a("Failed computing credential metadata").b(th));
            }
        }
    }
}
