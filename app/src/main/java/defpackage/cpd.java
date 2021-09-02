package defpackage;

/* renamed from: cpd reason: default package */
/* compiled from: PG */
public final class cpd {
    private final defpackage.cor a;

    public final void a(int i, android.view.View view) {
        if (defpackage.cky.b(view)) {
            defpackage.coo coo = (defpackage.coo) this.a.a();
            android.content.Context context = view.getContext();
            defpackage.cpe cpe = new defpackage.cpe();
            cpe.a(view);
            for (android.view.ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof android.view.View) {
                    cpe.a((android.view.View) parent);
                }
            }
            android.content.Context context2 = view.getContext();
            defpackage.cqd a2 = defpackage.cqd.a(context2);
            java.util.List b = a2.b(defpackage.cpf.class);
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= b.size()) {
                    break;
                }
                defpackage.cpc a3 = ((defpackage.cpf) b.get(i3)).a();
                if (a3 != null) {
                    cpe.b.add(a3);
                }
                i2 = i3 + 1;
            }
            if (cpe.b.isEmpty() || !((defpackage.cpc) cpe.b.get(cpe.b.size() - 1)).a.b) {
                defpackage.cot cot = (defpackage.cot) a2.a(defpackage.cot.class);
                if (cot != null) {
                    defpackage.cpc a4 = cot.a();
                    if (a4 != null) {
                        cpe.b.add(a4);
                    }
                }
            }
            android.content.Intent a5 = defpackage.cpe.a(context2);
            if (a5 != null) {
                defpackage.cpe cpe2 = (defpackage.cpe) a5.getSerializableExtra(defpackage.cpe.a);
                if (cpe2 != null) {
                    cpe.b.addAll(cpe2.b);
                }
            }
            coo.a(context, new defpackage.cou(i, cpe));
        }
    }

    public cpd(defpackage.cor cor) {
        this.a = cor;
    }
}
