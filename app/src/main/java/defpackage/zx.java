package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: zx  reason: default package */
/* compiled from: PG */
public final class zx {
    public int a;
    public int b;
    public int c;
    public int d;
    public ViewGroup e;
    public View f;
    public View g;
    public ze h;
    public zb i;
    public Context j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o = false;
    public boolean p;
    public Bundle q;

    public static Menu a(Context context, po poVar) {
        return new zy(context, poVar);
    }

    public static MenuItem a(Context context, pp ppVar) {
        return new zo(context, ppVar);
    }

    public zx(int i2) {
        this.a = i2;
    }

    public final void a(ze zeVar) {
        if (zeVar != this.h) {
            if (this.h != null) {
                this.h.b(this.i);
            }
            this.h = zeVar;
            if (zeVar != null && this.i != null) {
                zeVar.a(this.i);
            }
        }
    }
}
