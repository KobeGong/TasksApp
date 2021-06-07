package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.logging.Level;

/* renamed from: dql  reason: default package */
/* compiled from: PG */
public final class dql extends ehr {
    private List a;
    private final /* synthetic */ dqk b;

    public dql(dqk dqk) {
        this.b = dqk;
    }

    @Override // defpackage.ehr
    public final void a(ehp ehp) {
        boolean z = true;
        synchronized (this.b.m.a) {
            dqn dqn = this.b.m;
            cld.b(dqn.m != null);
            synchronized (dqn.j) {
                if (dqn.l) {
                    z = false;
                }
                cld.b(z, "Already allocated");
                dqn.l = true;
            }
            dqn.a();
            this.b.m.c = true;
            dqn dqn2 = this.b.m;
            for (dqm dqm : dqn2.b) {
                dqk dqk = dqn2.h;
                ByteBuffer byteBuffer = dqm.a;
                boolean z2 = dqm.b;
                boolean z3 = dqm.c;
                dqk.i.a(byteBuffer, z2);
                if (z3) {
                    dqk.i.b();
                }
            }
            dqn2.b.clear();
        }
    }

    @Override // defpackage.ehr
    public final void a(ehp ehp, ejg ejg) {
        a(ejg.b(), false);
        ehp.a(ByteBuffer.allocateDirect(4096));
    }

    @Override // defpackage.ehr
    public final void a(ehp ehp, ejg ejg, ByteBuffer byteBuffer, boolean z) {
        String str;
        boolean z2 = true;
        byteBuffer.flip();
        synchronized (this.b.m.a) {
            this.b.m.g = z;
            if (byteBuffer.remaining() != 0) {
                dqn dqn = this.b.m;
                dqn.e += byteBuffer.remaining();
                dxv a2 = dxw.a(byteBuffer);
                if (dqn.s != null) {
                    dpw dpw = dqn.s;
                    String valueOf = String.valueOf(dxw.a(a2, dqn.u));
                    if (valueOf.length() != 0) {
                        str = "DATA-----------------------------\n".concat(valueOf);
                    } else {
                        str = new String("DATA-----------------------------\n");
                    }
                    dqn.s = dpw.b(str);
                    a2.close();
                    if (dqn.s.m.length() > 1000) {
                        dqn.a(dqn.s, false, dqn.t);
                    }
                } else if (!dqn.v) {
                    dqn.a(dpw.h.a("headers not received before payload"), false, new dor());
                } else {
                    cld.a(a2, "frame");
                    try {
                        if (dqn.q) {
                            dqr.o.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                            a2.close();
                        } else {
                            try {
                                dqn.i.a(a2);
                            } catch (Throwable th) {
                                th = th;
                                z2 = false;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (z2) {
                            a2.close();
                        }
                        throw th;
                    }
                }
            }
        }
        if (z && this.a != null) {
            a(this.a, true);
        }
    }

    @Override // defpackage.ehr
    public final void b(ehp ehp, ejg ejg, ByteBuffer byteBuffer, boolean z) {
        boolean z2;
        boolean z3 = true;
        synchronized (this.b.m.a) {
            dqn dqn = this.b.m;
            int position = byteBuffer.position();
            synchronized (dqn.j) {
                cld.b(dqn.l, "onStreamAllocated was not called, but it seems the stream is active");
                boolean z4 = dqn.k < 32768;
                dqn.k -= position;
                if (dqn.k < 32768) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z4 || !z2) {
                    z3 = false;
                }
            }
            if (z3) {
                dqn.a();
            }
        }
    }

    @Override // defpackage.ehr
    public final void a(ehp ehp, ejg ejg, ejh ejh) {
        boolean z;
        List list = ejh.a;
        this.a = list;
        synchronized (this.b.m.a) {
            z = this.b.m.g;
        }
        if (z) {
            a(list, true);
        }
    }

    @Override // defpackage.ehr
    public final void b(ehp ehp, ejg ejg) {
        if (!a()) {
            if (this.a != null) {
                a(this.a, true);
            } else if (ejg != null) {
                a(ejg.b(), true);
            } else {
                throw new AssertionError("No response header or trailer");
            }
        }
        this.b.a(dvc.a(ejg.a()));
    }

    @Override // defpackage.ehr
    public final void a(ehp ehp, ejg ejg, bkv bkv) {
        this.b.a(dpw.i.b(bkv));
    }

    @Override // defpackage.ehr
    public final void c(ehp ehp, ejg ejg) {
        dpw a2;
        synchronized (this.b.m.a) {
            if (this.b.m.f != null) {
                a2 = this.b.m.f;
            } else if (ejg != null) {
                a2 = dvc.a(ejg.a());
            } else {
                a2 = dpw.c.a("stream cancelled without reason");
            }
        }
        this.b.a(a2);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.List r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 890
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dql.a(java.util.List, boolean):void");
    }

    private final boolean a() {
        boolean z;
        synchronized (this.b.m.a) {
            z = this.a != null && this.b.m.g;
        }
        return z;
    }
}
