package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aiq  reason: default package */
/* compiled from: PG */
public final class aiq {
    private static aiq a;
    private ajc b;
    private final Map c = new HashMap();
    private String d;

    public static synchronized aiq a() {
        aiq aiq;
        synchronized (aiq.class) {
            if (a == null) {
                a = new aiq();
            }
            aiq = a;
        }
        return aiq;
    }

    aiq() {
    }

    public final synchronized void a(String str) {
        this.d = str;
        air c2 = c();
        if (c2 != null) {
            a(c2, str);
        }
    }

    public final synchronized ais b(String str) {
        ais ais;
        ais = (ais) this.c.get(str);
        if (ais == null) {
            ais = new ais(this, str);
            this.c.put(str, ais);
        }
        return ais;
    }

    public final synchronized void a(ajc ajc) {
        air c2;
        this.b = ajc;
        if (!(this.b == null || (c2 = c()) == null)) {
            this.b.a(c2);
        }
    }

    public final synchronized void b() {
        ais ais;
        if (!TextUtils.isEmpty(this.d) && (ais = (ais) this.c.get(this.d)) != null) {
            ArrayList arrayList = new ArrayList();
            synchronized (ais) {
                if (ais.a != null) {
                    ais.a = null;
                    arrayList.addAll(ais.b);
                    ArrayList arrayList2 = arrayList;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        ((aiy) obj).a.b();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(air air, String str) {
        if (!str.equals(this.d) || this.b == null) {
            return false;
        }
        this.b.a(air);
        return true;
    }

    private final air c() {
        if (this.d == null) {
            return null;
        }
        ais ais = (ais) this.c.get(this.d);
        if (ais == null) {
            return null;
        }
        return ais.a;
    }
}
