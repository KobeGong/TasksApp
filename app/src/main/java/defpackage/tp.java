package defpackage;

import android.os.Build;
import android.os.Bundle;

/* renamed from: tp  reason: default package */
/* compiled from: PG */
public class tp {
    public final Object a;

    public tp() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a = new tr(this);
        } else {
            this.a = new tq(this);
        }
    }

    public tp(Object obj) {
        this.a = obj;
    }

    public tl a(int i) {
        return null;
    }

    public boolean a(int i, int i2, Bundle bundle) {
        return false;
    }

    public tl b(int i) {
        return null;
    }
}
