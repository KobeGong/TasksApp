package defpackage;

import android.content.Intent;

/* renamed from: bhy  reason: default package */
/* compiled from: PG */
final class bhy implements Runnable {
    private /* synthetic */ Intent a;
    private /* synthetic */ Intent b;
    private /* synthetic */ bhx c;

    bhy(bhx bhx, Intent intent, Intent intent2) {
        this.c = bhx;
        this.a = intent;
        this.b = intent2;
    }

    public final void run() {
        this.c.handleIntent(this.a);
        this.c.a(this.b);
    }
}
