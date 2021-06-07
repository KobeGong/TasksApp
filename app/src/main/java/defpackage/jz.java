package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* access modifiers changed from: package-private */
/* renamed from: jz  reason: default package */
/* compiled from: PG */
public class jz implements ju {
    public ka a;

    jz(Context context, ViewGroup viewGroup, View view) {
        this.a = new ka(context, viewGroup, view, this);
    }

    jz(Context context, ViewGroup viewGroup, View view, byte b) {
        this(context, viewGroup, view);
    }

    @Override // defpackage.ju
    public void a(View view) {
        this.a.a(view);
    }

    @Override // defpackage.ju
    public void b(View view) {
        this.a.b(view);
    }
}
