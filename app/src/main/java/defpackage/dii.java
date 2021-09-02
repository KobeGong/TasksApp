package defpackage;

/* renamed from: dii reason: default package */
/* compiled from: PG */
public final class dii extends defpackage.dgp {
    public defpackage.dih a;
    public boolean b;
    private final defpackage.dih c;

    private dii(defpackage.dih dih) {
        this.c = dih;
        this.a = (defpackage.dih) dih.a(defpackage.bg.an);
        this.b = false;
    }

    public final void b() {
        if (this.b) {
            defpackage.dih dih = (defpackage.dih) this.a.a(defpackage.bg.an);
            a(dih, this.a);
            this.a = dih;
            this.b = false;
        }
    }

    public final boolean e() {
        return defpackage.dih.a(this.a, false);
    }

    public final defpackage.dii a(defpackage.dih dih) {
        b();
        a(this.a, dih);
        return this;
    }

    private static void a(defpackage.dih dih, defpackage.dih dih2) {
        defpackage.djz.a.a((java.lang.Object) dih).b(dih, dih2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.dii a(byte[] bArr, int i) {
        b();
        try {
            defpackage.djz.a.a((java.lang.Object) this.a).a(this.a, bArr, 0, i, new defpackage.dgw());
            return this;
        } catch (defpackage.dir e) {
            throw e;
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw defpackage.dir.a();
        } catch (java.io.IOException e3) {
            throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.dii a(defpackage.dhj dhj, defpackage.dhw dhw) {
        b();
        try {
            defpackage.djz.a.a((java.lang.Object) this.a).a(this.a, defpackage.dhm.a(dhj), dhw);
            return this;
        } catch (java.lang.RuntimeException e) {
            if (e.getCause() instanceof java.io.IOException) {
                throw ((java.io.IOException) e.getCause());
            }
            throw e;
        }
    }

    public final /* synthetic */ defpackage.dgp a() {
        return (defpackage.dii) clone();
    }

    public final /* synthetic */ defpackage.djo c() {
        if (this.b) {
            return this.a;
        }
        defpackage.dih dih = this.a;
        defpackage.djz.a.a((java.lang.Object) dih).c(dih);
        this.b = true;
        return this.a;
    }

    public final /* synthetic */ defpackage.djo d() {
        defpackage.dih dih;
        boolean d;
        if (this.b) {
            dih = this.a;
        } else {
            defpackage.dih dih2 = this.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            this.b = true;
            dih = this.a;
        }
        defpackage.dih dih3 = dih;
        boolean booleanValue = java.lang.Boolean.TRUE.booleanValue();
        byte byteValue = ((java.lang.Byte) dih3.a(defpackage.bg.ak)).byteValue();
        if (byteValue == 1) {
            d = true;
        } else if (byteValue == 0) {
            d = false;
        } else {
            d = defpackage.djz.a.a((java.lang.Object) dih3).d(dih3);
            if (booleanValue) {
                dih3.a(defpackage.bg.al);
            }
        }
        if (d) {
            return dih3;
        }
        throw new defpackage.dkw();
    }

    public final /* synthetic */ defpackage.djo i() {
        return this.c;
    }

    public final /* synthetic */ java.lang.Object clone() {
        defpackage.dih dih;
        defpackage.dii dii = (defpackage.dii) this.c.a(defpackage.bg.ao);
        if (this.b) {
            dih = this.a;
        } else {
            defpackage.dih dih2 = this.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            this.b = true;
            dih = this.a;
        }
        dii.a(dih);
        return dii;
    }

    public dii() {
        this((defpackage.dih) defpackage.cbr.b);
    }

    public dii(byte b2) {
        this((defpackage.dih) defpackage.crb.e);
    }

    public dii(char c2) {
        this((defpackage.dih) defpackage.cwp.g);
    }

    public dii(short s) {
        this((defpackage.dih) defpackage.cwv.d);
    }

    public dii(int i) {
        this((defpackage.dih) defpackage.cww.c);
    }

    public dii(boolean z) {
        this((defpackage.dih) defpackage.cwx.c);
    }

    public dii(float f) {
        this((defpackage.dih) defpackage.czm.c);
    }

    public dii(byte[] bArr) {
        this((defpackage.dih) defpackage.czp.b);
    }

    public dii(char[] cArr) {
        this((defpackage.dih) defpackage.czs.a);
    }

    public dii(short[] sArr) {
        this((defpackage.dih) defpackage.czt.a);
    }

    public dii(int[] iArr) {
        this((defpackage.dih) defpackage.czu.f);
    }

    public dii(boolean[] zArr) {
        this((defpackage.dih) defpackage.czv.c);
    }

    public dii(float[] fArr) {
        this((defpackage.dih) defpackage.czw.c);
    }

    public dii(byte[][] bArr) {
        this((defpackage.dih) defpackage.czx.a);
    }

    public dii(char[][] cArr) {
        this((defpackage.dih) defpackage.czy.f);
    }

    public dii(short[][] sArr) {
        this((defpackage.dih) defpackage.dab.b);
    }

    public dii(int[][] iArr) {
        this((defpackage.dih) defpackage.dac.b);
    }

    public dii(boolean[][] zArr) {
        this((defpackage.dih) defpackage.dad.b);
    }

    public dii(float[][] fArr) {
        this((defpackage.dih) defpackage.dae.c);
    }

    public dii(byte[][][] bArr) {
        this((defpackage.dih) defpackage.daf.b);
    }

    public dii(char[][][] cArr) {
        this((defpackage.dih) defpackage.dag.b);
    }

    public dii(short[][][] sArr) {
        this((defpackage.dih) defpackage.dah.a);
    }

    public dii(int[][][] iArr) {
        this((defpackage.dih) defpackage.dai.b);
    }

    public dii(boolean[][][] zArr) {
        this((defpackage.dih) defpackage.daj.b);
    }

    public dii(float[][][] fArr) {
        this((defpackage.dih) defpackage.dak.a);
    }

    public dii(byte[][][][] bArr) {
        this((defpackage.dih) defpackage.dal.b);
    }

    public dii(char[][][][] cArr) {
        this((defpackage.dih) defpackage.dam.a);
    }

    public dii(short[][][][] sArr) {
        this((defpackage.dih) defpackage.dan.f);
    }

    public final defpackage.dii a(defpackage.dii dii) {
        b();
        defpackage.dan.a((defpackage.dan) this.a, dii);
        return this;
    }

    public dii(int[][][][] iArr) {
        this((defpackage.dih) defpackage.dao.c);
    }

    public final defpackage.dii a(String str) {
        b();
        defpackage.dao dao = (defpackage.dao) this.a;
        if (str == null) {
            throw new java.lang.NullPointerException();
        }
        dao.a = str;
        return this;
    }

    public final defpackage.dii b(String str) {
        b();
        defpackage.dao dao = (defpackage.dao) this.a;
        if (str == null) {
            throw new java.lang.NullPointerException();
        }
        dao.b = str;
        return this;
    }

    public dii(boolean[][][][] zArr) {
        this((defpackage.dih) defpackage.dap.b);
    }

    public dii(float[][][][] fArr) {
        this((defpackage.dih) defpackage.das.b);
    }

    public dii(byte[][][][][] bArr) {
        this((defpackage.dih) defpackage.dat.b);
    }

    public dii(char[][][][][] cArr) {
        this((defpackage.dih) defpackage.dau.d);
    }

    public dii(short[][][][][] sArr) {
        this((defpackage.dih) defpackage.dav.c);
    }

    public dii(int[][][][][] iArr) {
        this((defpackage.dih) defpackage.daw.h);
    }

    public final defpackage.dii c(String str) {
        b();
        defpackage.daw daw = (defpackage.daw) this.a;
        if (str == null) {
            throw new java.lang.NullPointerException();
        }
        daw.b = str;
        return this;
    }

    public final defpackage.dii a(int i) {
        b();
        ((defpackage.daw) this.a).e = i;
        return this;
    }

    public dii(boolean[][][][][] zArr) {
        this((defpackage.dih) defpackage.day.c);
    }

    public dii(float[][][][][] fArr) {
        this((defpackage.dih) defpackage.daz.b);
    }

    public dii(byte[][][][][][] bArr) {
        this((defpackage.dih) defpackage.dba.d);
    }

    public dii(char[][][][][][] cArr) {
        this((defpackage.dih) defpackage.dbb.e);
    }

    public final defpackage.dii a(defpackage.crb crb) {
        b();
        defpackage.dbb dbb = (defpackage.dbb) this.a;
        if (crb == null) {
            throw new java.lang.NullPointerException();
        }
        dbb.b = crb;
        return this;
    }

    public final defpackage.dii b(defpackage.dii dii) {
        b();
        defpackage.dbb.a((defpackage.dbb) this.a, dii);
        return this;
    }

    public dii(short[][][][][][] sArr) {
        this((defpackage.dih) defpackage.dbd.e);
    }

    public final defpackage.dii b(defpackage.crb crb) {
        b();
        defpackage.dbd dbd = (defpackage.dbd) this.a;
        if (crb == null) {
            throw new java.lang.NullPointerException();
        }
        dbd.b = crb;
        return this;
    }

    public final defpackage.dii c(defpackage.dii dii) {
        b();
        defpackage.dbd.a((defpackage.dbd) this.a, dii);
        return this;
    }

    public dii(int[][][][][][] iArr) {
        this((defpackage.dih) defpackage.dbf.b);
    }

    public dii(boolean[][][][][][] zArr) {
        this((defpackage.dih) defpackage.dbg.d);
    }

    public dii(float[][][][][][] fArr) {
        this((defpackage.dih) defpackage.dbh.b);
    }

    public dii(byte[][][][][][][] bArr) {
        this((defpackage.dih) defpackage.dbj.b);
    }

    public dii(char[][][][][][][] cArr) {
        this((defpackage.dih) defpackage.dbk.b);
    }

    public dii(short[][][][][][][] sArr) {
        this((defpackage.dih) defpackage.dbl.a);
    }

    public dii(int[][][][][][][] iArr) {
        this((defpackage.dih) defpackage.dbm.b);
    }

    public dii(boolean[][][][][][][] zArr) {
        this((defpackage.dih) defpackage.dbn.a);
    }

    public dii(float[][][][][][][] fArr) {
        this((defpackage.dih) defpackage.dbo.d);
    }

    public final defpackage.dii d(String str) {
        b();
        defpackage.dbo dbo = (defpackage.dbo) this.a;
        if (str == null) {
            throw new java.lang.NullPointerException();
        }
        dbo.c = str;
        return this;
    }

    public final defpackage.dii d(defpackage.dii dii) {
        b();
        defpackage.dbo.a((defpackage.dbo) this.a, dii);
        return this;
    }

    public final defpackage.dii e(defpackage.dii dii) {
        b();
        defpackage.dbo.d((defpackage.dbo) this.a, dii);
        return this;
    }

    public final defpackage.dii f(defpackage.dii dii) {
        b();
        defpackage.dbo.e((defpackage.dbo) this.a, dii);
        return this;
    }

    public dii(byte[][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.dbp.c);
    }

    public dii(char[][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.dbq.b);
    }

    public dii(short[][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.dbr.c);
    }

    public dii(int[][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.dbs.b);
    }

    public dii(boolean[][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.dbt.b);
    }

    public dii(float[][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.dbu.c);
    }

    public dii(byte[][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.dbv.b);
    }

    public dii(char[][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.dbw.c);
    }

    public dii(short[][][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.dbx.a);
    }

    public dii(int[][][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.dby.g);
    }

    public final defpackage.dii e(String str) {
        b();
        defpackage.dby dby = (defpackage.dby) this.a;
        if (str == null) {
            throw new java.lang.NullPointerException();
        }
        dby.d = str;
        return this;
    }

    public final defpackage.dca f() {
        defpackage.dby dby = (defpackage.dby) this.a;
        if (dby.e == null) {
            return defpackage.dca.g;
        }
        return dby.e;
    }

    public final defpackage.dii g(defpackage.dii dii) {
        b();
        defpackage.dby.a((defpackage.dby) this.a, dii);
        return this;
    }

    public dii(boolean[][][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.dca.g);
    }

    public final defpackage.dii a(boolean z) {
        b();
        ((defpackage.dca) this.a).a = z;
        return this;
    }

    public final defpackage.dii setTitle(String str) {
        b();
        defpackage.dca dca = (defpackage.dca) this.a;
        if (str == null) {
            throw new java.lang.NullPointerException();
        }
        dca.b = str;
        return this;
    }

    public final defpackage.dii setDetail(String str) {
        b();
        defpackage.dca dca = (defpackage.dca) this.a;
        if (str == null) {
            throw new java.lang.NullPointerException();
        }
        dca.c = str;
        return this;
    }

    public final defpackage.dii a(defpackage.dmk dmk) {
        b();
        defpackage.dca dca = (defpackage.dca) this.a;
        if (dmk == null) {
            throw new java.lang.NullPointerException();
        }
        dca.d = dmk;
        return this;
    }

    public final defpackage.dii g() {
        b();
        ((defpackage.dca) this.a).d = null;
        return this;
    }

    public final defpackage.dii h(defpackage.dii dii) {
        b();
        defpackage.dca.a((defpackage.dca) this.a, dii);
        return this;
    }

    public dii(float[][][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.dcb.g);
    }

    public final defpackage.dii i(defpackage.dii dii) {
        b();
        defpackage.dcb.a((defpackage.dcb) this.a, dii);
        return this;
    }

    public dii(byte[][][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.dcd.c);
    }

    public final defpackage.dii h(String str) {
        b();
        defpackage.dcd dcd = (defpackage.dcd) this.a;
        if (str == null) {
            throw new java.lang.NullPointerException();
        }
        dcd.a = str;
        return this;
    }

    public dii(char[][][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.dce.b);
    }

    public final java.util.List h() {
        return java.util.Collections.unmodifiableList(((defpackage.dce) this.a).a);
    }

    public final defpackage.dcf b(int i) {
        return (defpackage.dcf) ((defpackage.dce) this.a).a.get(i);
    }

    public final defpackage.dii a(int i, defpackage.dii dii) {
        b();
        defpackage.dce.a((defpackage.dce) this.a, i, dii);
        return this;
    }

    public final defpackage.dii b(int i, defpackage.dii dii) {
        b();
        defpackage.dce.b((defpackage.dce) this.a, i, dii);
        return this;
    }

    public final defpackage.dii c(int i) {
        b();
        defpackage.dce dce = (defpackage.dce) this.a;
        if (!dce.a.a()) {
            defpackage.diq diq = dce.a;
            int size = diq.size();
            dce.a = diq.a(size == 0 ? 10 : size << 1);
        }
        dce.a.remove(i);
        return this;
    }

    public dii(short[][][][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.dcf.d);
    }

    public final defpackage.dii i(String str) {
        b();
        defpackage.dcf dcf = (defpackage.dcf) this.a;
        if (str == null) {
            throw new java.lang.NullPointerException();
        }
        dcf.b = str;
        return this;
    }

    public final defpackage.dii d(int i) {
        b();
        defpackage.dcf dcf = (defpackage.dcf) this.a;
        if (!dcf.c.a()) {
            defpackage.diq diq = dcf.c;
            int size = diq.size();
            dcf.c = diq.a(size == 0 ? 10 : size << 1);
        }
        dcf.c.remove(i);
        return this;
    }

    public dii(int[][][][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.dch.b);
    }

    public dii(boolean[][][][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.dci.b);
    }

    public dii(float[][][][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.dcp.a);
    }

    public dii(byte[][][][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.dcq.a);
    }

    public dii(char[][][][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.dct.a);
    }

    public dii(short[][][][][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.dcu.g);
    }

    public dii(int[][][][][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.dcv.d);
    }

    public dii(boolean[][][][][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.dcw.e);
    }

    public dii(float[][][][][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.dcx.d);
    }

    public dii(byte[][][][][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.dda.a);
    }

    public dii(char[][][][][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.ddb.d);
    }

    public dii(short[][][][][][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.ddc.a);
    }

    public dii(int[][][][][][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.ddd.f);
    }

    public dii(boolean[][][][][][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.dde.a);
    }

    public dii(float[][][][][][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.ddf.a);
    }

    public dii(byte[][][][][][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.ddg.a);
    }

    public dii(char[][][][][][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.ddh.c);
    }

    public dii(short[][][][][][][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.ddk.f);
    }

    public dii(int[][][][][][][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.ddl.l);
    }

    public dii(boolean[][][][][][][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.ddm.c);
    }

    public dii(float[][][][][][][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.ddn.a);
    }

    public dii(byte[][][][][][][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.ddo.d);
    }

    public dii(char[][][][][][][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.ddp.f);
    }

    public dii(short[][][][][][][][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.ddq.c);
    }

    public dii(int[][][][][][][][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.ddt.a);
    }

    public dii(boolean[][][][][][][][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.ddu.d);
    }

    public dii(float[][][][][][][][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.ddv.a);
    }

    public dii(byte[][][][][][][][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.ddy.a);
    }

    public dii(char[][][][][][][][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.ddz.d);
    }

    public dii(short[][][][][][][][][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.deb.d);
    }

    public dii(int[][][][][][][][][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.dec.f);
    }

    public dii(boolean[][][][][][][][][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.ded.a);
    }

    public dii(float[][][][][][][][][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.dee.a);
    }

    public dii(byte[][][][][][][][][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.def.e);
    }

    public dii(char[][][][][][][][][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.deg.a);
    }

    public dii(short[][][][][][][][][][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.deh.e);
    }

    public dii(int[][][][][][][][][][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.dei.a);
    }

    public dii(boolean[][][][][][][][][][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.dej.f);
    }

    public dii(float[][][][][][][][][][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.dek.e);
    }

    public dii(byte[][][][][][][][][][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.del.h);
    }

    public dii(char[][][][][][][][][][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.den.d);
    }

    public dii(short[][][][][][][][][][][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.deo.e);
    }

    public dii(int[][][][][][][][][][][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.dep.a);
    }

    public dii(boolean[][][][][][][][][][][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.deq.e);
    }

    public dii(float[][][][][][][][][][][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.der.a);
    }

    public dii(byte[][][][][][][][][][][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.des.g);
    }

    public dii(char[][][][][][][][][][][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.det.a);
    }

    public dii(short[][][][][][][][][][][][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.deu.d);
    }

    public dii(int[][][][][][][][][][][][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.dev.a);
    }

    public dii(boolean[][][][][][][][][][][][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.dew.f);
    }

    public final defpackage.dii j(defpackage.dii dii) {
        b();
        defpackage.dew.a((defpackage.dew) this.a, dii);
        return this;
    }

    public dii(float[][][][][][][][][][][][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.dex.a);
    }

    public dii(byte[][][][][][][][][][][][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.dez.d);
    }

    public dii(char[][][][][][][][][][][][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.dfa.d);
    }

    public final defpackage.dii a(defpackage.dfb dfb) {
        b();
        defpackage.dfa dfa = (defpackage.dfa) this.a;
        if (dfb == null) {
            throw new java.lang.NullPointerException();
        }
        dfa.b = dfb;
        dfa.a |= 1;
        return this;
    }

    public final defpackage.dii a(defpackage.dfc dfc) {
        b();
        defpackage.dfa dfa = (defpackage.dfa) this.a;
        if (dfc == null) {
            throw new java.lang.NullPointerException();
        }
        dfa.c = dfc;
        dfa.a |= 2;
        return this;
    }

    public dii(short[][][][][][][][][][][][][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.dfb.d);
    }

    public final defpackage.dii a(long j) {
        b();
        defpackage.dfb dfb = (defpackage.dfb) this.a;
        dfb.a |= 1;
        dfb.b = j;
        return this;
    }

    public final defpackage.dii j(String str) {
        b();
        defpackage.dfb dfb = (defpackage.dfb) this.a;
        if (str == null) {
            throw new java.lang.NullPointerException();
        }
        dfb.a |= 2;
        dfb.c = str;
        return this;
    }

    public dii(int[][][][][][][][][][][][][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.dfc.b);
    }

    public final defpackage.dii a(java.lang.Iterable iterable) {
        b();
        defpackage.dfc dfc = (defpackage.dfc) this.a;
        if (!dfc.a.a()) {
            defpackage.diq diq = dfc.a;
            int size = diq.size();
            dfc.a = diq.a(size == 0 ? 10 : size << 1);
        }
        defpackage.diq diq2 = dfc.a;
        defpackage.dim.a((java.lang.Object) iterable);
        if (iterable instanceof defpackage.diz) {
            java.util.List d = ((defpackage.diz) iterable).d();
            defpackage.diz diz = (defpackage.diz) diq2;
            int size2 = diq2.size();
            for (java.lang.Object next : d) {
                if (next == null) {
                    String str = "Element at index " + (diz.size() - size2) + " is null.";
                    for (int size3 = diz.size() - 1; size3 >= size2; size3--) {
                        diz.remove(size3);
                    }
                    throw new java.lang.NullPointerException(str);
                } else if (next instanceof defpackage.dha) {
                    diz.a((defpackage.dha) next);
                } else {
                    diz.add((String) next);
                }
            }
        } else if (iterable instanceof defpackage.djy) {
            diq2.addAll((java.util.Collection) iterable);
        } else {
            if ((diq2 instanceof java.util.ArrayList) && (iterable instanceof java.util.Collection)) {
                ((java.util.ArrayList) diq2).ensureCapacity(((java.util.Collection) iterable).size() + diq2.size());
            }
            int size4 = diq2.size();
            for (java.lang.Object next2 : iterable) {
                if (next2 == null) {
                    String str2 = "Element at index " + (diq2.size() - size4) + " is null.";
                    for (int size5 = diq2.size() - 1; size5 >= size4; size5--) {
                        diq2.remove(size5);
                    }
                    throw new java.lang.NullPointerException(str2);
                }
                diq2.add(next2);
            }
        }
        return this;
    }

    public dii(boolean[][][][][][][][][][][][][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.dfd.f);
    }

    public dii(float[][][][][][][][][][][][][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.dfe.m);
    }

    public dii(byte[][][][][][][][][][][][][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.dff.c);
    }

    public dii(char[][][][][][][][][][][][][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.dfh.d);
    }

    public dii(short[][][][][][][][][][][][][][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.dfi.f);
    }

    public dii(int[][][][][][][][][][][][][][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.dfj.d);
    }

    public dii(boolean[][][][][][][][][][][][][][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.dfk.a);
    }

    public dii(float[][][][][][][][][][][][][][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.dfl.g);
    }

    public dii(byte[][][][][][][][][][][][][][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.dfm.e);
    }

    public dii(char[][][][][][][][][][][][][][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.dfn.q);
    }

    public dii(short[][][][][][][][][][][][][][][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.dfq.c);
    }

    public dii(int[][][][][][][][][][][][][][][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.dfr.f);
    }

    public dii(boolean[][][][][][][][][][][][][][][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.dfs.d);
    }

    public dii(float[][][][][][][][][][][][][][][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.dft.e);
    }

    public dii(byte[][][][][][][][][][][][][][][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.dfy.m);
    }

    public dii(char[][][][][][][][][][][][][][][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.dfz.a);
    }

    public dii(short[][][][][][][][][][][][][][][][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.dga.d);
    }

    public dii(int[][][][][][][][][][][][][][][][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.dgb.a);
    }

    public dii(boolean[][][][][][][][][][][][][][][][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.dgc.a);
    }

    public dii(float[][][][][][][][][][][][][][][][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.dgd.a);
    }

    public dii(byte[][][][][][][][][][][][][][][][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.dgg.d);
    }

    public dii(char[][][][][][][][][][][][][][][][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.dgl.f);
    }

    public dii(short[][][][][][][][][][][][][][][][][][][][][][][] sArr) {
        this((defpackage.dih) defpackage.dgm.f);
    }

    public dii(int[][][][][][][][][][][][][][][][][][][][][][][] iArr) {
        this((defpackage.dih) defpackage.dgn.a);
    }

    dii(boolean[][][][][][][][][][][][][][][][][][][][][][][] zArr) {
        this((defpackage.dih) defpackage.dgu.b);
    }

    public dii(float[][][][][][][][][][][][][][][][][][][][][][][] fArr) {
        this((defpackage.dih) defpackage.dmi.b);
    }

    public dii(byte[][][][][][][][][][][][][][][][][][][][][][][][] bArr) {
        this((defpackage.dih) defpackage.dmk.d);
    }

    public final defpackage.dii e(int i) {
        b();
        ((defpackage.dmk) this.a).a = i;
        return this;
    }

    public final defpackage.dii f(int i) {
        b();
        ((defpackage.dmk) this.a).b = i;
        return this;
    }

    public final defpackage.dii g(int i) {
        b();
        ((defpackage.dmk) this.a).c = i;
        return this;
    }

    public dii(char[][][][][][][][][][][][][][][][][][][][][][][][] cArr) {
        this((defpackage.dih) defpackage.eda.a);
    }
}
