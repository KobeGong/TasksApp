package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: dii  reason: default package */
/* compiled from: PG */
public final class dii extends dgp {
    public dih a;
    public boolean b;
    private final dih c;

    private dii(dih dih) {
        this.c = dih;
        this.a = (dih) dih.a(bg.an);
        this.b = false;
    }

    public final void b() {
        if (this.b) {
            dih dih = (dih) this.a.a(bg.an);
            a(dih, this.a);
            this.a = dih;
            this.b = false;
        }
    }

    @Override // defpackage.djq
    public final boolean e() {
        return dih.a(this.a, false);
    }

    public final dii a(dih dih) {
        b();
        a(this.a, dih);
        return this;
    }

    private static void a(dih dih, dih dih2) {
        djz.a.a(dih).b(dih, dih2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dii a(byte[] bArr, int i) {
        b();
        try {
            djz.a.a(this.a).a(this.a, bArr, 0, i, new dgw());
            return this;
        } catch (dir e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw dir.a();
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dii a(dhj dhj, dhw dhw) {
        b();
        try {
            djz.a.a(this.a).a(this.a, dhm.a(dhj), dhw);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    @Override // defpackage.dgp
    public final /* synthetic */ dgp a() {
        return (dii) clone();
    }

    @Override // defpackage.djp
    public final /* synthetic */ djo c() {
        if (this.b) {
            return this.a;
        }
        dih dih = this.a;
        djz.a.a(dih).c(dih);
        this.b = true;
        return this.a;
    }

    @Override // defpackage.djp
    public final /* synthetic */ djo d() {
        dih dih;
        boolean d;
        if (this.b) {
            dih = this.a;
        } else {
            dih dih2 = this.a;
            djz.a.a(dih2).c(dih2);
            this.b = true;
            dih = this.a;
        }
        dih dih3 = dih;
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) dih3.a(bg.ak)).byteValue();
        if (byteValue == 1) {
            d = true;
        } else if (byteValue == 0) {
            d = false;
        } else {
            d = djz.a.a(dih3).d(dih3);
            if (booleanValue) {
                dih3.a(bg.al);
            }
        }
        if (d) {
            return dih3;
        }
        throw new dkw();
    }

    @Override // defpackage.djq
    public final /* synthetic */ djo i() {
        return this.c;
    }

    @Override // java.lang.Object, defpackage.dgp
    public final /* synthetic */ Object clone() {
        dih dih;
        dii dii = (dii) this.c.a(bg.ao);
        if (this.b) {
            dih = this.a;
        } else {
            dih dih2 = this.a;
            djz.a.a(dih2).c(dih2);
            this.b = true;
            dih = this.a;
        }
        dii.a(dih);
        return dii;
    }

    public dii() {
        this(cbr.b);
    }

    public dii(byte b2) {
        this(crb.e);
    }

    public dii(char c2) {
        this(cwp.g);
    }

    public dii(short s) {
        this(cwv.d);
    }

    public dii(int i) {
        this(cww.c);
    }

    public dii(boolean z) {
        this(cwx.c);
    }

    public dii(float f) {
        this(czm.c);
    }

    public dii(byte[] bArr) {
        this(czp.b);
    }

    public dii(char[] cArr) {
        this(czs.a);
    }

    public dii(short[] sArr) {
        this(czt.a);
    }

    public dii(int[] iArr) {
        this(czu.f);
    }

    public dii(boolean[] zArr) {
        this(czv.c);
    }

    public dii(float[] fArr) {
        this(czw.c);
    }

    public dii(byte[][] bArr) {
        this(czx.a);
    }

    public dii(char[][] cArr) {
        this(czy.f);
    }

    public dii(short[][] sArr) {
        this(dab.b);
    }

    public dii(int[][] iArr) {
        this(dac.b);
    }

    public dii(boolean[][] zArr) {
        this(dad.b);
    }

    public dii(float[][] fArr) {
        this(dae.c);
    }

    public dii(byte[][][] bArr) {
        this(daf.b);
    }

    public dii(char[][][] cArr) {
        this(dag.b);
    }

    public dii(short[][][] sArr) {
        this(dah.a);
    }

    public dii(int[][][] iArr) {
        this(dai.b);
    }

    public dii(boolean[][][] zArr) {
        this(daj.b);
    }

    public dii(float[][][] fArr) {
        this(dak.a);
    }

    public dii(byte[][][][] bArr) {
        this(dal.b);
    }

    public dii(char[][][][] cArr) {
        this(dam.a);
    }

    public dii(short[][][][] sArr) {
        this(dan.f);
    }

    public final dii a(dii dii) {
        b();
        dan.a((dan) this.a, dii);
        return this;
    }

    public dii(int[][][][] iArr) {
        this(dao.c);
    }

    public final dii a(String str) {
        b();
        dao dao = (dao) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        dao.a = str;
        return this;
    }

    public final dii b(String str) {
        b();
        dao dao = (dao) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        dao.b = str;
        return this;
    }

    public dii(boolean[][][][] zArr) {
        this(dap.b);
    }

    public dii(float[][][][] fArr) {
        this(das.b);
    }

    public dii(byte[][][][][] bArr) {
        this(dat.b);
    }

    public dii(char[][][][][] cArr) {
        this(dau.d);
    }

    public dii(short[][][][][] sArr) {
        this(dav.c);
    }

    public dii(int[][][][][] iArr) {
        this(daw.h);
    }

    public final dii c(String str) {
        b();
        daw daw = (daw) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        daw.b = str;
        return this;
    }

    public final dii a(int i) {
        b();
        ((daw) this.a).e = i;
        return this;
    }

    public dii(boolean[][][][][] zArr) {
        this(day.c);
    }

    public dii(float[][][][][] fArr) {
        this(daz.b);
    }

    public dii(byte[][][][][][] bArr) {
        this(dba.d);
    }

    public dii(char[][][][][][] cArr) {
        this(dbb.e);
    }

    public final dii a(crb crb) {
        b();
        dbb dbb = (dbb) this.a;
        if (crb == null) {
            throw new NullPointerException();
        }
        dbb.b = crb;
        return this;
    }

    public final dii b(dii dii) {
        b();
        dbb.a((dbb) this.a, dii);
        return this;
    }

    public dii(short[][][][][][] sArr) {
        this(dbd.e);
    }

    public final dii b(crb crb) {
        b();
        dbd dbd = (dbd) this.a;
        if (crb == null) {
            throw new NullPointerException();
        }
        dbd.b = crb;
        return this;
    }

    public final dii c(dii dii) {
        b();
        dbd.a((dbd) this.a, dii);
        return this;
    }

    public dii(int[][][][][][] iArr) {
        this(dbf.b);
    }

    public dii(boolean[][][][][][] zArr) {
        this(dbg.d);
    }

    public dii(float[][][][][][] fArr) {
        this(dbh.b);
    }

    public dii(byte[][][][][][][] bArr) {
        this(dbj.b);
    }

    public dii(char[][][][][][][] cArr) {
        this(dbk.b);
    }

    public dii(short[][][][][][][] sArr) {
        this(dbl.a);
    }

    public dii(int[][][][][][][] iArr) {
        this(dbm.b);
    }

    public dii(boolean[][][][][][][] zArr) {
        this(dbn.a);
    }

    public dii(float[][][][][][][] fArr) {
        this(dbo.d);
    }

    public final dii d(String str) {
        b();
        dbo dbo = (dbo) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        dbo.c = str;
        return this;
    }

    public final dii d(dii dii) {
        b();
        dbo.a((dbo) this.a, dii);
        return this;
    }

    public final dii e(dii dii) {
        b();
        dbo.d((dbo) this.a, dii);
        return this;
    }

    public final dii f(dii dii) {
        b();
        dbo.e((dbo) this.a, dii);
        return this;
    }

    public dii(byte[][][][][][][][] bArr) {
        this(dbp.c);
    }

    public dii(char[][][][][][][][] cArr) {
        this(dbq.b);
    }

    public dii(short[][][][][][][][] sArr) {
        this(dbr.c);
    }

    public dii(int[][][][][][][][] iArr) {
        this(dbs.b);
    }

    public dii(boolean[][][][][][][][] zArr) {
        this(dbt.b);
    }

    public dii(float[][][][][][][][] fArr) {
        this(dbu.c);
    }

    public dii(byte[][][][][][][][][] bArr) {
        this(dbv.b);
    }

    public dii(char[][][][][][][][][] cArr) {
        this(dbw.c);
    }

    public dii(short[][][][][][][][][] sArr) {
        this(dbx.a);
    }

    public dii(int[][][][][][][][][] iArr) {
        this(dby.g);
    }

    public final dii e(String str) {
        b();
        dby dby = (dby) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        dby.d = str;
        return this;
    }

    public final dca f() {
        dby dby = (dby) this.a;
        if (dby.e == null) {
            return dca.g;
        }
        return dby.e;
    }

    public final dii g(dii dii) {
        b();
        dby.a((dby) this.a, dii);
        return this;
    }

    public dii(boolean[][][][][][][][][] zArr) {
        this(dca.g);
    }

    public final dii a(boolean z) {
        b();
        ((dca) this.a).a = z;
        return this;
    }

    public final dii f(String str) {
        b();
        dca dca = (dca) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        dca.b = str;
        return this;
    }

    public final dii g(String str) {
        b();
        dca dca = (dca) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        dca.c = str;
        return this;
    }

    public final dii a(dmk dmk) {
        b();
        dca dca = (dca) this.a;
        if (dmk == null) {
            throw new NullPointerException();
        }
        dca.d = dmk;
        return this;
    }

    public final dii g() {
        b();
        ((dca) this.a).d = null;
        return this;
    }

    public final dii h(dii dii) {
        b();
        dca.a((dca) this.a, dii);
        return this;
    }

    public dii(float[][][][][][][][][] fArr) {
        this(dcb.g);
    }

    public final dii i(dii dii) {
        b();
        dcb.a((dcb) this.a, dii);
        return this;
    }

    public dii(byte[][][][][][][][][][] bArr) {
        this(dcd.c);
    }

    public final dii h(String str) {
        b();
        dcd dcd = (dcd) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        dcd.a = str;
        return this;
    }

    public dii(char[][][][][][][][][][] cArr) {
        this(dce.b);
    }

    public final List h() {
        return Collections.unmodifiableList(((dce) this.a).a);
    }

    public final dcf b(int i) {
        return (dcf) ((dce) this.a).a.get(i);
    }

    public final dii a(int i, dii dii) {
        b();
        dce.a((dce) this.a, i, dii);
        return this;
    }

    public final dii b(int i, dii dii) {
        b();
        dce.b((dce) this.a, i, dii);
        return this;
    }

    public final dii c(int i) {
        b();
        dce dce = (dce) this.a;
        if (!dce.a.a()) {
            diq diq = dce.a;
            int size = diq.size();
            dce.a = diq.a(size == 0 ? 10 : size << 1);
        }
        dce.a.remove(i);
        return this;
    }

    public dii(short[][][][][][][][][][] sArr) {
        this(dcf.d);
    }

    public final dii i(String str) {
        b();
        dcf dcf = (dcf) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        dcf.b = str;
        return this;
    }

    public final dii d(int i) {
        b();
        dcf dcf = (dcf) this.a;
        if (!dcf.c.a()) {
            diq diq = dcf.c;
            int size = diq.size();
            dcf.c = diq.a(size == 0 ? 10 : size << 1);
        }
        dcf.c.remove(i);
        return this;
    }

    public dii(int[][][][][][][][][][] iArr) {
        this(dch.b);
    }

    public dii(boolean[][][][][][][][][][] zArr) {
        this(dci.b);
    }

    public dii(float[][][][][][][][][][] fArr) {
        this(dcp.a);
    }

    public dii(byte[][][][][][][][][][][] bArr) {
        this(dcq.a);
    }

    public dii(char[][][][][][][][][][][] cArr) {
        this(dct.a);
    }

    public dii(short[][][][][][][][][][][] sArr) {
        this(dcu.g);
    }

    public dii(int[][][][][][][][][][][] iArr) {
        this(dcv.d);
    }

    public dii(boolean[][][][][][][][][][][] zArr) {
        this(dcw.e);
    }

    public dii(float[][][][][][][][][][][] fArr) {
        this(dcx.d);
    }

    public dii(byte[][][][][][][][][][][][] bArr) {
        this(dda.a);
    }

    public dii(char[][][][][][][][][][][][] cArr) {
        this(ddb.d);
    }

    public dii(short[][][][][][][][][][][][] sArr) {
        this(ddc.a);
    }

    public dii(int[][][][][][][][][][][][] iArr) {
        this(ddd.f);
    }

    public dii(boolean[][][][][][][][][][][][] zArr) {
        this(dde.a);
    }

    public dii(float[][][][][][][][][][][][] fArr) {
        this(ddf.a);
    }

    public dii(byte[][][][][][][][][][][][][] bArr) {
        this(ddg.a);
    }

    public dii(char[][][][][][][][][][][][][] cArr) {
        this(ddh.c);
    }

    public dii(short[][][][][][][][][][][][][] sArr) {
        this(ddk.f);
    }

    public dii(int[][][][][][][][][][][][][] iArr) {
        this(ddl.l);
    }

    public dii(boolean[][][][][][][][][][][][][] zArr) {
        this(ddm.c);
    }

    public dii(float[][][][][][][][][][][][][] fArr) {
        this(ddn.a);
    }

    public dii(byte[][][][][][][][][][][][][][] bArr) {
        this(ddo.d);
    }

    public dii(char[][][][][][][][][][][][][][] cArr) {
        this(ddp.f);
    }

    public dii(short[][][][][][][][][][][][][][] sArr) {
        this(ddq.c);
    }

    public dii(int[][][][][][][][][][][][][][] iArr) {
        this(ddt.a);
    }

    public dii(boolean[][][][][][][][][][][][][][] zArr) {
        this(ddu.d);
    }

    public dii(float[][][][][][][][][][][][][][] fArr) {
        this(ddv.a);
    }

    public dii(byte[][][][][][][][][][][][][][][] bArr) {
        this(ddy.a);
    }

    public dii(char[][][][][][][][][][][][][][][] cArr) {
        this(ddz.d);
    }

    public dii(short[][][][][][][][][][][][][][][] sArr) {
        this(deb.d);
    }

    public dii(int[][][][][][][][][][][][][][][] iArr) {
        this(dec.f);
    }

    public dii(boolean[][][][][][][][][][][][][][][] zArr) {
        this(ded.a);
    }

    public dii(float[][][][][][][][][][][][][][][] fArr) {
        this(dee.a);
    }

    public dii(byte[][][][][][][][][][][][][][][][] bArr) {
        this(def.e);
    }

    public dii(char[][][][][][][][][][][][][][][][] cArr) {
        this(deg.a);
    }

    public dii(short[][][][][][][][][][][][][][][][] sArr) {
        this(deh.e);
    }

    public dii(int[][][][][][][][][][][][][][][][] iArr) {
        this(dei.a);
    }

    public dii(boolean[][][][][][][][][][][][][][][][] zArr) {
        this(dej.f);
    }

    public dii(float[][][][][][][][][][][][][][][][] fArr) {
        this(dek.e);
    }

    public dii(byte[][][][][][][][][][][][][][][][][] bArr) {
        this(del.h);
    }

    public dii(char[][][][][][][][][][][][][][][][][] cArr) {
        this(den.d);
    }

    public dii(short[][][][][][][][][][][][][][][][][] sArr) {
        this(deo.e);
    }

    public dii(int[][][][][][][][][][][][][][][][][] iArr) {
        this(dep.a);
    }

    public dii(boolean[][][][][][][][][][][][][][][][][] zArr) {
        this(deq.e);
    }

    public dii(float[][][][][][][][][][][][][][][][][] fArr) {
        this(der.a);
    }

    public dii(byte[][][][][][][][][][][][][][][][][][] bArr) {
        this(des.g);
    }

    public dii(char[][][][][][][][][][][][][][][][][][] cArr) {
        this(det.a);
    }

    public dii(short[][][][][][][][][][][][][][][][][][] sArr) {
        this(deu.d);
    }

    public dii(int[][][][][][][][][][][][][][][][][][] iArr) {
        this(dev.a);
    }

    public dii(boolean[][][][][][][][][][][][][][][][][][] zArr) {
        this(dew.f);
    }

    public final dii j(dii dii) {
        b();
        dew.a((dew) this.a, dii);
        return this;
    }

    public dii(float[][][][][][][][][][][][][][][][][][] fArr) {
        this(dex.a);
    }

    public dii(byte[][][][][][][][][][][][][][][][][][][] bArr) {
        this(dez.d);
    }

    public dii(char[][][][][][][][][][][][][][][][][][][] cArr) {
        this(dfa.d);
    }

    public final dii a(dfb dfb) {
        b();
        dfa dfa = (dfa) this.a;
        if (dfb == null) {
            throw new NullPointerException();
        }
        dfa.b = dfb;
        dfa.a |= 1;
        return this;
    }

    public final dii a(dfc dfc) {
        b();
        dfa dfa = (dfa) this.a;
        if (dfc == null) {
            throw new NullPointerException();
        }
        dfa.c = dfc;
        dfa.a |= 2;
        return this;
    }

    public dii(short[][][][][][][][][][][][][][][][][][][] sArr) {
        this(dfb.d);
    }

    public final dii a(long j) {
        b();
        dfb dfb = (dfb) this.a;
        dfb.a |= 1;
        dfb.b = j;
        return this;
    }

    public final dii j(String str) {
        b();
        dfb dfb = (dfb) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        dfb.a |= 2;
        dfb.c = str;
        return this;
    }

    public dii(int[][][][][][][][][][][][][][][][][][][] iArr) {
        this(dfc.b);
    }

    public final dii a(Iterable iterable) {
        b();
        dfc dfc = (dfc) this.a;
        if (!dfc.a.a()) {
            diq diq = dfc.a;
            int size = diq.size();
            dfc.a = diq.a(size == 0 ? 10 : size << 1);
        }
        diq diq2 = dfc.a;
        dim.a(iterable);
        if (iterable instanceof diz) {
            List d = ((diz) iterable).d();
            diz diz = (diz) diq2;
            int size2 = diq2.size();
            for (Object obj : d) {
                if (obj == null) {
                    String sb = new StringBuilder(37).append("Element at index ").append(diz.size() - size2).append(" is null.").toString();
                    for (int size3 = diz.size() - 1; size3 >= size2; size3--) {
                        diz.remove(size3);
                    }
                    throw new NullPointerException(sb);
                } else if (obj instanceof dha) {
                    diz.a((dha) obj);
                } else {
                    diz.add((String) obj);
                }
            }
        } else if (iterable instanceof djy) {
            diq2.addAll((Collection) iterable);
        } else {
            if ((diq2 instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) diq2).ensureCapacity(((Collection) iterable).size() + diq2.size());
            }
            int size4 = diq2.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String sb2 = new StringBuilder(37).append("Element at index ").append(diq2.size() - size4).append(" is null.").toString();
                    for (int size5 = diq2.size() - 1; size5 >= size4; size5--) {
                        diq2.remove(size5);
                    }
                    throw new NullPointerException(sb2);
                }
                diq2.add(obj2);
            }
        }
        return this;
    }

    public dii(boolean[][][][][][][][][][][][][][][][][][][] zArr) {
        this(dfd.f);
    }

    public dii(float[][][][][][][][][][][][][][][][][][][] fArr) {
        this(dfe.m);
    }

    public dii(byte[][][][][][][][][][][][][][][][][][][][] bArr) {
        this(dff.c);
    }

    public dii(char[][][][][][][][][][][][][][][][][][][][] cArr) {
        this(dfh.d);
    }

    public dii(short[][][][][][][][][][][][][][][][][][][][] sArr) {
        this(dfi.f);
    }

    public dii(int[][][][][][][][][][][][][][][][][][][][] iArr) {
        this(dfj.d);
    }

    public dii(boolean[][][][][][][][][][][][][][][][][][][][] zArr) {
        this(dfk.a);
    }

    public dii(float[][][][][][][][][][][][][][][][][][][][] fArr) {
        this(dfl.g);
    }

    public dii(byte[][][][][][][][][][][][][][][][][][][][][] bArr) {
        this(dfm.e);
    }

    public dii(char[][][][][][][][][][][][][][][][][][][][][] cArr) {
        this(dfn.q);
    }

    public dii(short[][][][][][][][][][][][][][][][][][][][][] sArr) {
        this(dfq.c);
    }

    public dii(int[][][][][][][][][][][][][][][][][][][][][] iArr) {
        this(dfr.f);
    }

    public dii(boolean[][][][][][][][][][][][][][][][][][][][][] zArr) {
        this(dfs.d);
    }

    public dii(float[][][][][][][][][][][][][][][][][][][][][] fArr) {
        this(dft.e);
    }

    public dii(byte[][][][][][][][][][][][][][][][][][][][][][] bArr) {
        this(dfy.m);
    }

    public dii(char[][][][][][][][][][][][][][][][][][][][][][] cArr) {
        this(dfz.a);
    }

    public dii(short[][][][][][][][][][][][][][][][][][][][][][] sArr) {
        this(dga.d);
    }

    public dii(int[][][][][][][][][][][][][][][][][][][][][][] iArr) {
        this(dgb.a);
    }

    public dii(boolean[][][][][][][][][][][][][][][][][][][][][][] zArr) {
        this(dgc.a);
    }

    public dii(float[][][][][][][][][][][][][][][][][][][][][][] fArr) {
        this(dgd.a);
    }

    public dii(byte[][][][][][][][][][][][][][][][][][][][][][][] bArr) {
        this(dgg.d);
    }

    public dii(char[][][][][][][][][][][][][][][][][][][][][][][] cArr) {
        this(dgl.f);
    }

    public dii(short[][][][][][][][][][][][][][][][][][][][][][][] sArr) {
        this(dgm.f);
    }

    public dii(int[][][][][][][][][][][][][][][][][][][][][][][] iArr) {
        this(dgn.a);
    }

    dii(boolean[][][][][][][][][][][][][][][][][][][][][][][] zArr) {
        this(dgu.b);
    }

    public dii(float[][][][][][][][][][][][][][][][][][][][][][][] fArr) {
        this(dmi.b);
    }

    public dii(byte[][][][][][][][][][][][][][][][][][][][][][][][] bArr) {
        this(dmk.d);
    }

    public final dii e(int i) {
        b();
        ((dmk) this.a).a = i;
        return this;
    }

    public final dii f(int i) {
        b();
        ((dmk) this.a).b = i;
        return this;
    }

    public final dii g(int i) {
        b();
        ((dmk) this.a).c = i;
        return this;
    }

    public dii(char[][][][][][][][][][][][][][][][][][][][][][][][] cArr) {
        this(eda.a);
    }
}
