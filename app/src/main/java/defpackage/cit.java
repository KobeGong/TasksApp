package defpackage;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: cit  reason: default package */
/* compiled from: PG */
public final class cit extends cgj {
    public final Object d = new Object();
    public final int e;
    public final boolean f;
    public final List g;
    public final cis h;

    cit(coe coe, Application application, clt clt, int i, int i2, boolean z, cly cly) {
        super(coe, application, clt, i, Integer.MAX_VALUE);
        this.e = i2;
        this.f = z;
        this.g = new ArrayList(i2);
        this.h = new cis(cly);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cgj
    public final void d() {
        synchronized (this.d) {
            this.g.clear();
        }
    }
}
