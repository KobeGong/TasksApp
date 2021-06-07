package defpackage;

import java.io.InputStream;

/* renamed from: dub  reason: default package */
/* compiled from: PG */
final class dub implements Runnable {
    private final /* synthetic */ InputStream a;
    private final /* synthetic */ dtt b;

    dub(dtt dtt, InputStream inputStream) {
        this.b = dtt;
        this.a = inputStream;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
