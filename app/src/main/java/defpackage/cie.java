package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: cie  reason: default package */
/* compiled from: PG */
public final class cie {
    public final AtomicBoolean a;
    public final cij b;
    public ScheduledFuture c;
    public ScheduledFuture d;
    public final clt e;
    public final cha f;
    public final cgx g;
    public final cgy h;

    cie(cij cij, Application application, clt clt) {
        this(cij, clt, cha.a(application));
    }

    private cie(cij cij, clt clt, cha cha) {
        this.a = new AtomicBoolean(false);
        this.g = new cif(this);
        this.h = new cih(this);
        this.b = cij;
        this.e = clt;
        this.f = cha;
    }
}
