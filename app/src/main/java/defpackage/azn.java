package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: azn  reason: default package */
/* compiled from: PG */
final class azn extends azu {
    public final /* synthetic */ azk a;
    private final Map b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azn(azk azk, Map map) {
        super(azk);
        this.a = azk;
        this.b = map;
    }

    @Override // defpackage.azu
    public final void a() {
        boolean z;
        Iterator it = this.b.keySet().iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = z2;
                break;
            }
            ayj ayj = (ayj) it.next();
            ayj.i();
            z = true;
            if (!((azm) this.b.get(ayj)).a) {
                break;
            }
            z2 = true;
        }
        int a2 = z ? axv.a(this.a.c) : 0;
        if (a2 != 0) {
            this.a.a.a(new azo(this, this.a, new axq(a2, null)));
            return;
        }
        if (this.a.e) {
            this.a.d.r();
        }
        for (ayj ayj2 : this.b.keySet()) {
            bda bda = (bda) this.b.get(ayj2);
            ayj2.i();
            if (a2 != 0) {
                this.a.a.a(new azp(this.a, bda));
            } else {
                ayj2.a(bda);
            }
        }
    }
}
