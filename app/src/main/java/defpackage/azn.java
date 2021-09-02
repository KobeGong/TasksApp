package defpackage;

/* renamed from: azn reason: default package */
/* compiled from: PG */
final class azn extends defpackage.azu {
    public final /* synthetic */ defpackage.azk a;
    private final java.util.Map b;

    public azn(defpackage.azk azk, java.util.Map map) {
        this.a = azk;
        super(azk);
        this.b = map;
    }

    public final void a() {
        boolean z;
        int i;
        java.util.Iterator it = this.b.keySet().iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = z2;
                break;
            }
            defpackage.ayj ayj = (defpackage.ayj) it.next();
            ayj.i();
            z = true;
            if (!((defpackage.azm) this.b.get(ayj)).a) {
                break;
            }
            z2 = true;
        }
        if (z) {
            i = defpackage.axv.a(this.a.c);
        } else {
            i = 0;
        }
        if (i != 0) {
            this.a.a.a((defpackage.bag) new defpackage.azo(this, this.a, new defpackage.axq(i, null)));
            return;
        }
        if (this.a.e) {
            this.a.d.r();
        }
        for (defpackage.ayj ayj2 : this.b.keySet()) {
            defpackage.bda bda = (defpackage.bda) this.b.get(ayj2);
            ayj2.i();
            if (i != 0) {
                this.a.a.a((defpackage.bag) new defpackage.azp(this.a, bda));
            } else {
                ayj2.a(bda);
            }
        }
    }
}
