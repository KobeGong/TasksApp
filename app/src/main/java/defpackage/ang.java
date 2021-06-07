package defpackage;

import java.util.concurrent.ExecutionException;

/* access modifiers changed from: package-private */
/* renamed from: ang  reason: default package */
public final /* synthetic */ class ang implements Runnable {
    private final anc a;
    private final cyi b;
    private final anu c;
    private final cyu d;

    ang(anc anc, cyi cyi, anu anu, cyu cyu) {
        this.a = anc;
        this.b = cyi;
        this.c = anu;
        this.d = cyu;
    }

    public final void run() {
        anc anc = this.a;
        cyi cyi = this.b;
        anu anu = this.c;
        cyu cyu = this.d;
        synchronized (anc) {
            try {
                anw anw = (anw) cyi.get();
                if (anc.a != anu) {
                    cyu.a((Object) null);
                    return;
                }
                if (anw == anw.LOCAL_CHANGES) {
                    anc.a(anu, cyu);
                } else {
                    cyu.a((Object) null);
                    if (anw == anw.SERVER_CHANGES) {
                        alq.a().a(anu.a.a);
                    }
                }
            } catch (InterruptedException | ExecutionException e) {
                cyu.a(e);
            }
        }
    }
}
