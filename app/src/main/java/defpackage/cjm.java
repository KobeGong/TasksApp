package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* access modifiers changed from: package-private */
/* renamed from: cjm  reason: default package */
/* compiled from: PG */
public final class cjm implements cgx, cls {
    public final clt a;
    public final ArrayList b = new ArrayList();
    public boolean c;
    private final cha d;

    cjm(cha cha, clt clt) {
        this.d = cha;
        this.a = clt;
        cha.a(this);
    }

    @Override // defpackage.cls
    public final void a() {
        this.d.b(this);
    }

    @Override // defpackage.cgx
    public final void b(Activity activity) {
        synchronized (this.b) {
            if (!this.c) {
                this.c = true;
                this.d.b(this);
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ScheduledExecutorService) this.a.a()).submit((Runnable) arrayList.get(i));
                }
                this.b.clear();
            }
        }
    }
}
