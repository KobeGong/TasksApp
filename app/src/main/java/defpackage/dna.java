package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: dna  reason: default package */
/* compiled from: PG */
public final class dna {
    public static final dna a = new dna();
    public dny b;
    public Executor c;
    public String d;
    public dmy e;
    public String f;
    public Object[][] g = ((Object[][]) Array.newInstance(Object.class, 0, 2));
    public List h = Collections.emptyList();
    public boolean i;
    public Integer j;
    public Integer k;

    public final dna a(dnm dnm) {
        dna dna = new dna(this);
        ArrayList arrayList = new ArrayList(this.h.size() + 1);
        arrayList.addAll(this.h);
        arrayList.add(dnm);
        dna.h = Collections.unmodifiableList(arrayList);
        return dna;
    }

    public final Object a(dnb dnb) {
        cld.a(dnb, "key");
        for (int i2 = 0; i2 < this.g.length; i2++) {
            if (dnb.equals(this.g[i2][0])) {
                return this.g[i2][1];
            }
        }
        return null;
    }

    private dna() {
    }

    public dna(dna dna) {
        this.b = dna.b;
        this.d = dna.d;
        this.e = dna.e;
        this.c = dna.c;
        this.f = dna.f;
        this.g = dna.g;
        this.i = dna.i;
        this.j = dna.j;
        this.k = dna.k;
        this.h = dna.h;
    }

    public final String toString() {
        return cky.b(this).a("deadline", this.b).a("authority", this.d).a("callCredentials", this.e).a("executor", this.c != null ? this.c.getClass() : null).a("compressorName", this.f).a("customOptions", Arrays.deepToString(this.g)).a("waitForReady", this.i).a("maxInboundMessageSize", this.j).a("maxOutboundMessageSize", this.k).a("streamTracerFactories", this.h).toString();
    }
}
