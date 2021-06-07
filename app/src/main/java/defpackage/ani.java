package defpackage;

import java.util.concurrent.ExecutionException;

/* access modifiers changed from: package-private */
/* renamed from: ani  reason: default package */
public final /* synthetic */ class ani implements Runnable {
    private final anc a;
    private final cyi b;
    private final anu c;
    private final cyu d;
    private final String e;

    ani(anc anc, cyi cyi, anu anu, cyu cyu, String str) {
        this.a = anc;
        this.b = cyi;
        this.c = anu;
        this.d = cyu;
        this.e = str;
    }

    public final void run() {
        anc anc = this.a;
        cyi cyi = this.b;
        anu anu = this.c;
        cyu cyu = this.d;
        String str = this.e;
        synchronized (anc) {
            try {
                anw anw = (anw) cyi.get();
                if (anc.a != anu) {
                    cyu.a((Object) null);
                    return;
                }
                if (anw == anw.LOCAL_CHANGES) {
                    anc.a(str, anu, cyu);
                } else {
                    cyu.a((Object) null);
                    if (anw == anw.SERVER_CHANGES) {
                        alq.a().a(anu.a.a, str);
                    }
                }
            } catch (InterruptedException | ExecutionException e2) {
                cyu.a(e2);
            }
        }
    }
}
