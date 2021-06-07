package defpackage;

import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: ctn  reason: default package */
/* compiled from: PG */
public abstract class ctn implements cua, cuo {
    private static final String a = new String();
    private final Level b;
    private final long c;
    private ctq d;
    private ctt e;
    private cvf f;
    private Object[] g;

    protected ctn(Level level, boolean z) {
        this(level, z, cut.e());
    }

    /* access modifiers changed from: protected */
    public abstract cvz a();

    /* access modifiers changed from: protected */
    public abstract ctj b();

    /* access modifiers changed from: protected */
    public abstract cua c();

    private ctn(Level level, boolean z, long j) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.b = (Level) cub.a(level, "level");
        this.c = j;
        if (z) {
            a(ctp.e, Boolean.TRUE);
        }
    }

    @Override // defpackage.cuo
    public final Level d() {
        return this.b;
    }

    @Override // defpackage.cuo
    public final long e() {
        return this.c;
    }

    @Override // defpackage.cuo
    public final ctt f() {
        if (this.e != null) {
            return this.e;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.cuo
    public final cvf g() {
        return this.f;
    }

    @Override // defpackage.cuo
    public final Object[] h() {
        if (this.f != null) {
            return this.g;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }

    @Override // defpackage.cuo
    public final Object i() {
        if (this.f == null) {
            return this.g[0];
        }
        throw new IllegalStateException("cannot get literal argument if a template context exists");
    }

    @Override // defpackage.cuo
    public final boolean j() {
        return this.d != null && Boolean.TRUE.equals(this.d.b(ctp.e));
    }

    @Override // defpackage.cuo
    public final cur k() {
        return this.d != null ? this.d : cur.c;
    }

    private final void a(cuc cuc, Object obj) {
        if (this.d == null) {
            this.d = new ctq();
        }
        ctq ctq = this.d;
        int a2 = ctq.a(cuc);
        if (a2 != -1) {
            ctq.a[(a2 * 2) + 1] = cub.a(obj, "metadata value");
            return;
        }
        if ((ctq.b + 1) * 2 > ctq.a.length) {
            ctq.a = Arrays.copyOf(ctq.a, ctq.a.length * 2);
        }
        ctq.a[ctq.b * 2] = cub.a(cuc, "metadata key");
        ctq.a[(ctq.b * 2) + 1] = cub.a(obj, "metadata value");
        ctq.b++;
    }

    @Override // defpackage.cua
    public final cua a(String str, String str2, String str3) {
        this.e = ctt.a(str, str2, str3);
        return c();
    }

    @Override // defpackage.cua
    public final cua a(Throwable th) {
        a(ctp.a, th);
        return c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.cua
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 420
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctn.a(java.lang.String):void");
    }
}
