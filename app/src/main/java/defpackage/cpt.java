package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* renamed from: cpt  reason: default package */
/* compiled from: PG */
final class cpt extends nz {
    private List j;
    private List k;

    cpt(Context context) {
        super(context.getApplicationContext());
    }

    cpt(Context context, List list) {
        this(context);
        this.k = list;
    }

    /* access modifiers changed from: private */
    public final void a(List list) {
        this.j = list;
        super.a((Object) list);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.oc
    public final void e() {
        if (this.j != null) {
            a(this.j);
        } else {
            a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.oc
    public final void f() {
        b();
    }

    @Override // defpackage.nz
    public final /* synthetic */ Object d() {
        ArrayList arrayList;
        TreeSet treeSet = new TreeSet();
        treeSet.addAll(cky.a(cky.a(this.e.getApplicationContext(), "third_party_license_metadata", 0, -1), ""));
        if (this.k != null) {
            for (String str : this.k) {
                String a = cky.a("res/raw/third_party_license_metadata", str, 0, -1);
                if (a != null) {
                    arrayList = cky.a(a, str);
                } else {
                    arrayList = new ArrayList();
                }
                treeSet.addAll(arrayList);
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeSet));
    }

    static {
        cpt.class.getCanonicalName();
    }
}
