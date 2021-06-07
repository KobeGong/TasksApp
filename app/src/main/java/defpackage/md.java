package defpackage;

import java.util.ArrayList;

/* renamed from: md  reason: default package */
/* compiled from: PG */
final class md implements mc {
    private final String a = null;
    private final int b;
    private final int c;
    private final /* synthetic */ lp d;

    md(lp lpVar, int i, int i2) {
        this.d = lpVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.mc
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        lp lpVar;
        if (this.d.g == null || this.b >= 0 || (lpVar = this.d.g.v) == null || !lpVar.d()) {
            return this.d.a(arrayList, arrayList2, (String) null, this.b, this.c);
        }
        return false;
    }
}
