package defpackage;

import java.util.Locale;

/* renamed from: cou  reason: default package */
/* compiled from: PG */
public final class cou implements con {
    public final int a;
    public final cpe b;
    public String c;

    public cou(int i, cpe cpe) {
        this.a = i;
        this.b = cpe;
    }

    @Override // defpackage.con
    public final void a() {
    }

    @Override // defpackage.con
    public final String a(cop cop) {
        return this.c != null ? this.c : cop.a();
    }

    public final String toString() {
        return String.format(Locale.US, "UserEvent action: %d%s on: %s ", Integer.valueOf(this.a), "", this.b.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cou)) {
            return false;
        }
        cou cou = (cou) obj;
        if (this.a != cou.a || !cky.a((Object) null, (Object) null) || !this.b.equals(cou.b) || !cky.a((Object) this.c, (Object) cou.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a + (cky.a(this.c, cky.a((Object) null, this.b.hashCode())) * 31);
    }
}
