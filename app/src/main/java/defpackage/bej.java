package defpackage;

import android.content.Intent;

/* renamed from: bej  reason: default package */
/* compiled from: PG */
public final class bej extends beh {
    private /* synthetic */ Intent a;
    private /* synthetic */ bax b;
    private /* synthetic */ int c = 2;

    public bej(Intent intent, bax bax) {
        this.a = intent;
        this.b = bax;
    }

    @Override // defpackage.beh
    public final void a() {
        if (this.a != null) {
            this.b.startActivityForResult(this.a, this.c);
        }
    }
}
