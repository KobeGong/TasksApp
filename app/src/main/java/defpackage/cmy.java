package defpackage;

import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cmy  reason: default package */
/* compiled from: PG */
public final class cmy {
    private static final Map n;
    public final cnc a;
    public final ByteBuffer b;
    public final cne c = new cne();
    public final cne d = new cne();
    public final cng e = new cng();
    public final cng f = new cng();
    public final Map g = new qr();
    public final cne h = new cne();
    public int i;
    public String j = "";
    public final cng k = new cng();
    public final cng l = new cng();
    public final cni m = new cni();

    public cmy(cnc cnc, Iterable iterable, Iterable iterable2, Iterable iterable3) {
        this.a = cnc;
        this.b = cnc.a;
        this.m.a(Reference.class.getName(), cmz.CLASSIFY_REF);
        this.m.a(Object.class.getName(), cmz.IDENTIFY_OBJECT_CLASS);
        if (iterable2 != null) {
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                this.m.a(str, cmz.EXCLUDE_INSTANCE);
                if (n.containsKey(str)) {
                    this.l.a(((Integer) n.get(str)).intValue(), cmz.EXCLUDE_INSTANCE);
                }
            }
        }
        if (iterable3 != null) {
            Iterator it2 = iterable3.iterator();
            while (it2.hasNext()) {
                this.m.a((String) it2.next(), cmz.FIND_INSTANCE);
            }
        }
        if (iterable != null) {
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                this.h.a(((Integer) it3.next()).intValue(), 0);
            }
        }
    }

    static {
        qr qrVar = new qr();
        n = qrVar;
        qrVar.put("boolean[]", 4);
        n.put("char[]", 5);
        n.put("float[]", 6);
        n.put("double[]", 7);
        n.put("byte[]", 8);
        n.put("short[]", 9);
        n.put("int[]", 10);
        n.put("long[]", 11);
    }
}
