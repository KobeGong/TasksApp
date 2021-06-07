package defpackage;

import android.content.Intent;

/* renamed from: bvl  reason: default package */
final /* synthetic */ class bvl implements Runnable {
    private final bvn a;
    private final Intent b;

    bvl(bvn bvn, Intent intent) {
        this.a = bvn;
        this.b = intent;
    }

    public final void run() {
        this.a.a(this.b, bvo.c());
    }
}
