package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: akx  reason: default package */
public final /* synthetic */ class akx implements View.OnClickListener {
    private final akv a;

    akx(akv akv) {
        this.a = akv;
    }

    public final void onClick(View view) {
        akv akv = this.a;
        if (akv.p != null) {
            aky aky = akv.p;
            int d = akv.d();
            if (aky.a.b != null) {
                akz akz = (akz) aky.a.a.get(d);
                aku aku = aky.a.b;
                String str = akz.a().b;
                String str2 = akz.b().d;
                lg j = aku.a.j();
                if (j instanceof alh) {
                    ((alh) j).a(str, str2);
                }
            }
        }
    }
}
