package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ayq  reason: default package */
/* compiled from: PG */
public final class ayq {
    public baw a;
    public int b = -1;
    public ays c;
    public Looper d;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    private final Set g = new HashSet();
    private final Set h = new HashSet();
    private String i;
    private String j;
    private final Map k = new qr();
    private final Context l;
    private final Map m = new qr();
    private axt n = axt.a;
    private ayf o = bpp.a;

    public ayq(Context context) {
        this.l = context;
        this.d = context.getMainLooper();
        this.i = context.getPackageName();
        this.j = context.getClass().getName();
    }

    public final ayq a(ayd ayd) {
        azb.b(ayd, "Api must not be null");
        this.m.put(ayd, null);
        List a2 = ayd.a.a(null);
        this.h.addAll(a2);
        this.g.addAll(a2);
        return this;
    }

    public final ayq a(ayd ayd, aye aye) {
        azb.b(ayd, "Api must not be null");
        azb.b(aye, "Null options are not permitted for this Api");
        this.m.put(ayd, aye);
        List a2 = ayd.a.a(aye);
        this.h.addAll(a2);
        this.g.addAll(a2);
        return this;
    }

    public final ayp a() {
        bax a2;
        bbv bbv;
        azb.b(!this.m.isEmpty(), "must call addApi() to add at least one API");
        bpn bpn = bpn.a;
        if (this.m.containsKey(bpp.b)) {
            bpn = (bpn) this.m.get(bpp.b);
        }
        bdj bdj = new bdj(null, this.g, this.k, this.i, this.j, bpn);
        ayd ayd = null;
        Map map = bdj.d;
        qr qrVar = new qr();
        qr qrVar2 = new qr();
        ArrayList arrayList = new ArrayList();
        for (ayd ayd2 : this.m.keySet()) {
            Object obj = this.m.get(ayd2);
            boolean z = map.get(ayd2) != null;
            qrVar.put(ayd2, Boolean.valueOf(z));
            bch bch = new bch(ayd2, z);
            arrayList.add(bch);
            ayj a3 = ayd2.a().a(this.l, this.d, bdj, obj, bch, bch);
            qrVar2.put(ayd2.b(), a3);
            if (!a3.c()) {
                ayd2 = ayd;
            } else if (ayd != null) {
                String str = ayd2.b;
                String str2 = ayd.b;
                throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length()).append(str).append(" cannot be used with ").append(str2).toString());
            }
            ayd = ayd2;
        }
        if (ayd != null) {
            azb.a(true, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", ayd.b);
            azb.a(this.g.equals(this.h), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", ayd.b);
        }
        azx azx = new azx(this.l, new ReentrantLock(), this.d, bdj, this.n, this.o, qrVar, this.e, this.f, qrVar2, this.b, azx.a((Iterable) qrVar2.values(), true), arrayList);
        synchronized (ayp.a) {
            ayp.a.add(azx);
        }
        if (this.b >= 0) {
            baw baw = this.a;
            if (baw.a instanceof FragmentActivity) {
                a2 = bbo.a((FragmentActivity) baw.a);
            } else if (baw.a instanceof Activity) {
                a2 = bay.a((Activity) baw.a);
            } else {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            bbv bbv2 = (bbv) a2.a("AutoManageHelper", bbv.class);
            if (bbv2 != null) {
                bbv = bbv2;
            } else {
                bbv = new bbv(a2);
            }
            int i2 = this.b;
            ays ays = this.c;
            azb.b(azx, "GoogleApiClient instance cannot be null");
            azb.a(bbv.b.indexOfKey(i2) < 0, new StringBuilder(54).append("Already managing a GoogleApiClient with id ").append(i2).toString());
            bcd bcd = (bcd) bbv.d.get();
            boolean z2 = bbv.c;
            String valueOf = String.valueOf(bcd);
            new StringBuilder(String.valueOf(valueOf).length() + 49).append("starting AutoManage for client ").append(i2).append(" ").append(z2).append(" ").append(valueOf);
            bbv.b.put(i2, new bbw(bbv, i2, azx, ays));
            if (bbv.c && bcd == null) {
                String valueOf2 = String.valueOf(azx);
                new StringBuilder(String.valueOf(valueOf2).length() + 11).append("connecting ").append(valueOf2);
                azx.e();
            }
        }
        return azx;
    }
}
