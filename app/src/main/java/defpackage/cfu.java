package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;

/* renamed from: cfu  reason: default package */
/* compiled from: PG */
public final class cfu implements cdp {
    private final Context a;
    private final cdp b;
    private final cfl c;
    private Bitmap d;

    public cfu(Context context, cdj cdj) {
        this(context, cdj.d(), new cfl(cdj.e(), cdj.b()));
    }

    private cfu(Context context, cdp cdp, cfl cfl) {
        this.a = ((Context) cky.a((Object) context)).getApplicationContext();
        this.b = (cdp) cky.a(cdp);
        this.c = (cfl) cky.a(cfl);
    }

    @Override // defpackage.cdp
    public final void a(Object obj, int i, cdq cdq) {
        this.b.a(obj, i, new cfv(cdq));
    }

    /* access modifiers changed from: package-private */
    public final Bitmap a(Object obj) {
        if (obj != null) {
            cfl cfl = this.c;
            String a2 = ((cdu) obj).a();
            String b2 = ((cdu) obj).b();
            ArrayList arrayList = new ArrayList();
            if (a2 != null) {
                arrayList.add(a2.toString());
            }
            if (b2 != null) {
                arrayList.add(b2.toString());
            }
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
            cfl.a.a(((cdu) obj).b()).a(new cqp(strArr)).a(createBitmap);
            return createBitmap;
        }
        if (this.d == null) {
            this.d = BitmapFactory.decodeResource(this.a.getResources(), R.drawable.quantum_ic_account_circle_googblue_48);
        }
        return this.d;
    }
}
