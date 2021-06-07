package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.util.TimeZone;

/* renamed from: awu  reason: default package */
/* compiled from: PG */
public final class awu {
    public String a;
    public /* synthetic */ awt b;
    private int c;
    private String d;
    private String e;
    private int f;
    private final aww g;
    private boolean h;
    private final blh i;
    private boolean j;

    public awu(awt awt, byte[] bArr) {
        this(awt, bArr, null);
    }

    public awu(awt awt, aww aww) {
        this(awt, null, aww);
    }

    private awu(awt awt, byte[] bArr, aww aww) {
        this.b = awt;
        this.c = this.b.g;
        this.d = this.b.f;
        this.a = this.b.h;
        this.e = awt.d(this.b);
        this.f = awt.a();
        this.h = true;
        this.i = new blh();
        this.j = false;
        this.a = awt.h;
        this.e = awt.d(awt);
        this.i.c = awt.k.a();
        this.i.d = awt.k.b();
        blh blh = this.i;
        awx unused = awt.l;
        blh.f = (long) (TimeZone.getDefault().getOffset(this.i.c) / 1000);
        if (bArr != null) {
            this.i.e = bArr;
        }
        this.g = aww;
    }

    @Deprecated
    public final ayt a() {
        if (this.j) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.j = true;
        axa axa = new axa(new axb(this.b.d, this.b.e, this.c, this.d, this.a, this.e, awt.b(), this.f), this.i, this.g, awt.c(), awt.c(), this.h);
        axb axb = axa.a;
        if (this.b.m.a(axb.b, axb.a)) {
            return this.b.j.a(axa);
        }
        Status status = Status.a;
        azb.b(status, "Result must not be null");
        bbn bbn = new bbn(Looper.getMainLooper());
        bbn.a((ayw) status);
        return bbn;
    }
}
