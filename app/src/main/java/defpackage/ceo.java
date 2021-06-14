package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.tasks.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: ceo  reason: default package */
/* compiled from: PG */
public final class ceo extends Adapter {
    public final cdl a;
    public final cer b;
    public int c;
    public final cdm f;
    private final Context g;
    private final cei h;
    private final cdf i;
    private final SparseArray j;

    public ceo(Context context, cei cei, cdj cdj, List list, cer cer) {
        this(context, cei, cdj.b(), cdj.a(), list, cer);
    }

    private ceo(Context context, cei cei, cdf cdf, cdl cdl, List list, cer cer) {
        this.j = new SparseArray();
        this.c = -1;
        this.f = new ceq(this);
        this.g = (Context) cky.a((Object) context);
        this.h = (cei) cky.a(cei);
        this.i = (cdf) cky.a(cdf);
        this.b = cer;
        this.a = (cdl) cky.a(cdl);
        b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ces ces = (ces) it.next();
            this.j.put(ces.a, ces);
        }
    }

    private final int d() {
        if (this.a.b()) {
            return this.a.a() - 1;
        }
        return this.a.a();
    }

    @Override // defpackage.aet
    public final int getItemViewType(int i2) {
        int d = d();
        return i2 < d ? R.id.view_type_account : this.j.keyAt(i2 - d);
    }

    @Override // defpackage.aet
    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        ces ces = (ces) this.j.get(i2);
        if (ces != null) {
            return new ViewHolder(this.g, viewGroup, ces);
        }
        return new cew(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.account_list_item, viewGroup, false), this.i, this.h);
    }

    @Override // defpackage.aet
    public final void onBindViewHolder(ViewHolder afv, int i2) {
        Object obj;
        if (i2 < d()) {
            cew cew = (cew) afv;
            if (!this.a.b() || i2 < this.c) {
                obj = this.a.a(i2);
            } else {
                obj = this.a.a(i2 + 1);
            }
            cew.q.a(obj);
            cew.a.setContentDescription(cew.a.getContext().getString(R.string.og_use_account_a11y, cdm.a(obj, cew.p)));
            cew.a.setOnClickListener(new cep(this, obj));
        }
    }

    @Override // defpackage.aet
    public final int getCount() {
        return d() + this.j.size();
    }

    public final void b() {
        cdl cdl = this.a;
        this.c = cdl.b() ? cdl.c.indexOf(cdl.c()) : -1;
    }
}
