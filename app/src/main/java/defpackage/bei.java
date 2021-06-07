package defpackage;

import android.app.Activity;
import android.content.Intent;

/* renamed from: bei  reason: default package */
/* compiled from: PG */
public final class bei extends beh {
    private /* synthetic */ Intent a;
    private /* synthetic */ Activity b;
    private /* synthetic */ int c;

    public bei(Intent intent, Activity activity, int i) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    @Override // defpackage.beh
    public final void a() {
        if (this.a != null) {
            this.b.startActivityForResult(this.a, this.c);
        }
    }
}
