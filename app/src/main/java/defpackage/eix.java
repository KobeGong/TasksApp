package defpackage;

import android.content.Intent;

/* renamed from: eix  reason: default package */
/* compiled from: PG */
final class eix implements Runnable {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ eiw b;

    eix(eiw eiw, Intent intent) {
        this.b = eiw;
        this.a = intent;
    }

    public final void run() {
        this.b.a.a(this.b, eiw.a(this.a));
    }
}
