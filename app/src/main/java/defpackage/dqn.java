package defpackage;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: dqn  reason: default package */
/* compiled from: PG */
public final class dqn extends dvn {
    public final Object a;
    public Queue b = new LinkedList();
    public boolean c;
    public boolean d = false;
    public int e;
    public dpw f;
    public boolean g;
    public final /* synthetic */ dqk h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dqn(dqk dqk, int i, dzo dzo, Object obj, dzt dzt) {
        super(i, dzo, dzt);
        this.h = dqk;
        this.a = cld.a(obj, "lock");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dvn
    public final void a(dpw dpw, boolean z, dor dor) {
        this.h.i.c();
        b(dpw, z, dor);
    }

    @Override // defpackage.dxe
    public final void a(Throwable th) {
        a(dpw.a(th), true, new dor());
    }

    @Override // defpackage.dri
    public final void a(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    @Override // defpackage.dxe
    public final void a(int i) {
        this.e -= i;
        if (this.e == 0 && !this.g) {
            this.h.i.a(ByteBuffer.allocateDirect(4096));
        }
    }
}
