package defpackage;

import android.view.LayoutInflater;

import com.google.android.apps.tasks.R;

/* renamed from: ceo reason: default package */
/* compiled from: PG */
public final class ceo extends RecyclerViewAdapter {
    public final defpackage.cdl a;
    public final defpackage.cer b;
    public int c;
    public final defpackage.cdm f;
    private final android.content.Context g;
    private final defpackage.cei h;
    private final defpackage.cdf i;
    private final android.util.SparseArray j;

    public ceo(android.content.Context context, defpackage.cei cei, defpackage.cdj cdj, java.util.List list, defpackage.cer cer) {
        this(context, cei, cdj.b(), cdj.a(), list, cer);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<ces>, for r9v0, types: [java.util.List, java.util.List<ces>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ceo(android.content.Context r5, defpackage.cei r6, defpackage.cdf r7, defpackage.cdl r8, java.util.List<defpackage.ces> r9, defpackage.cer r10) {
        /*
            r4 = this;
            r4.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r4.j = r0
            r0 = -1
            r4.c = r0
            ceq r0 = new ceq
            r0.<init>(r4)
            r4.f = r0
            java.lang.Object r0 = defpackage.cky.a(r5)
            android.content.Context r0 = (android.content.Context) r0
            r4.g = r0
            java.lang.Object r0 = defpackage.cky.a(r6)
            cei r0 = (defpackage.cei) r0
            r4.h = r0
            java.lang.Object r0 = defpackage.cky.a(r7)
            cdf r0 = (defpackage.cdf) r0
            r4.i = r0
            r4.b = r10
            java.lang.Object r0 = defpackage.cky.a(r8)
            cdl r0 = (defpackage.cdl) r0
            r4.a = r0
            r4.b()
            java.util.Iterator r1 = r9.iterator()
        L_0x003d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r1.next()
            ces r0 = (defpackage.ces) r0
            android.util.SparseArray r2 = r4.j
            int r3 = r0.a
            r2.put(r3, r0)
            goto L_0x003d
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceo.<init>(android.content.Context, cei, cdf, cdl, java.util.List, cer):void");
    }

    private final int d() {
        if (this.a.b()) {
            return this.a.getSize() - 1;
        }
        return this.a.getSize();
    }

    public final int getItemViewType(int i2) {
        int d = d();
        if (i2 < d) {
            return 2131755050;
        }
        return this.j.keyAt(i2 - d);
    }

    public final RecyclerViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i2) {
        defpackage.ces ces = (defpackage.ces) this.j.get(i2);
        if (ces != null) {
            return new RecyclerViewHolder(this.g, viewGroup, ces);
        }
        return new defpackage.cew(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.account_list_item, viewGroup, false), this.i, this.h);
    }

    public final void onBindViewHolder(RecyclerViewHolder afv, int i2) {
        java.lang.Object obj;
        if (i2 < d()) {
            defpackage.cew cew = (defpackage.cew) afv;
            if (!this.a.b() || i2 < this.c) {
                obj = this.a.a(i2);
            } else {
                obj = this.a.a(i2 + 1);
            }
            cew.q.a(obj);
            cew.itemView.setContentDescription(cew.itemView.getContext().getString(R.string.og_use_account_a11y, cdm.a(obj, cew.p)));
            cew.itemView.setOnClickListener(new defpackage.cep(this, obj));
        }
    }

    public final int getItemCount() {
        return d() + this.j.size();
    }

    public final void b() {
        defpackage.cdl cdl = this.a;
        this.c = cdl.b() ? cdl.availableAccounts.indexOf(cdl.c()) : -1;
    }
}
