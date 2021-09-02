package defpackage;

/* renamed from: dsx reason: default package */
/* compiled from: PG */
final class dsx {
    public final /* synthetic */ defpackage.dwf a;

    public final defpackage.dtb a(defpackage.doo doo) {
        defpackage.doq doq = this.a.u;
        if (this.a.A.get()) {
            return this.a.y;
        }
        if (doq == null) {
            this.a.k.a((java.lang.Runnable) new defpackage.dwl(this)).a();
            return this.a.y;
        }
        defpackage.dtb a2 = defpackage.dvc.a(doq.a(), doo.a().i);
        if (a2 == null) {
            return this.a.y;
        }
        return a2;
    }

    dsx(defpackage.dwf dwf) {
        this.a = dwf;
    }
}
