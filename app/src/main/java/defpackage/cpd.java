package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewParent;
import java.util.List;

/* renamed from: cpd  reason: default package */
/* compiled from: PG */
public final class cpd {
    private final cor a;

    public final void a(int i, View view) {
        cpe cpe;
        cot cot;
        cpc a2;
        if (cky.b(view)) {
            coo coo = (coo) this.a.a();
            Context context = view.getContext();
            cpe cpe2 = new cpe();
            cpe2.a(view);
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof View) {
                    cpe2.a((View) parent);
                }
            }
            Context context2 = view.getContext();
            cqd a3 = cqd.a(context2);
            List b = a3.b(cpf.class);
            for (int i2 = 0; i2 < b.size(); i2++) {
                cpc a4 = ((cpf) b.get(i2)).a();
                if (a4 != null) {
                    cpe2.b.add(a4);
                }
            }
            if (!((!cpe2.b.isEmpty() && ((cpc) cpe2.b.get(cpe2.b.size() - 1)).a.b) || (cot = (cot) a3.a(cot.class)) == null || (a2 = cot.a()) == null)) {
                cpe2.b.add(a2);
            }
            Intent a5 = cpe.a(context2);
            if (!(a5 == null || (cpe = (cpe) a5.getSerializableExtra(cpe.a)) == null)) {
                cpe2.b.addAll(cpe.b);
            }
            coo.a(context, new cou(i, cpe2));
        }
    }

    public cpd(cor cor) {
        this.a = cor;
    }
}
