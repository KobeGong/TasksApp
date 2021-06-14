package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: ale  reason: default package */
final /* synthetic */ class ale implements Callable {
    private final ala a;

    ale(ala ala, Context context, String str) {
        this.a = ala;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ala ala = this.a;
        List<ajo> list = ala.b;
        if (list == null) {
            list = ala.N();
            ala.b = list;
        }
        ArrayList arrayList = new ArrayList();
        for (ajo ajo : list) {
            dby dby = null;
            dcb c = any.get().c().c(ajo.b());
            if (c != null) {
                dby = any.get().c().a(ajo.b(), ajo.c());
            }
            if (dby != null) {
                arrayList.add(akz.a(c, dby));
            } else {
                azb.b("Result not found in local database: %s, %s, %s", any.get().c().b(), ajo.b(), ajo.c());
            }
        }
        return arrayList;
    }
}
