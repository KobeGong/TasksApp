package defpackage;

import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: cfd  reason: default package */
/* compiled from: PG */
public final class cfd extends cdm {
    public final /* synthetic */ cfc a;

    cfd(cfc cfc) {
        this.a = cfc;
    }

    @Override // defpackage.cdm
    public final void a(List list, List list2) {
        cfc.O();
    }

    @Override // defpackage.cdm
    public final void a(Object obj, Object obj2, Object obj3) {
        cfc cfc = this.a;
        cfe cfe = new cfe(this);
        FragmentActivity j = cfc.getActivity();
        if (j != null) {
            j.runOnUiThread(cfe);
        }
    }
}
