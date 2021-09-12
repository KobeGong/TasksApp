package defpackage;

/* renamed from: cfu reason: default package */
/* compiled from: PG */
public final class cfu implements defpackage.cdp {
    private final android.content.Context a;
    private final defpackage.cdp b;
    private final defpackage.cfl c;
    private android.graphics.Bitmap d;

    public cfu(android.content.Context context, defpackage.cdj cdj) {
        this(context, cdj.d(), new defpackage.cfl(cdj.e(), cdj.b()));
    }

    private cfu(android.content.Context context, defpackage.cdp cdp, defpackage.cfl cfl) {
        this.a = ((android.content.Context) defpackage.cky.a((java.lang.Object) context)).getApplicationContext();
        this.b = (defpackage.cdp) defpackage.cky.a((java.lang.Object) cdp);
        this.c = (defpackage.cfl) defpackage.cky.a((java.lang.Object) cfl);
    }

    public final void a(java.lang.Object obj, int i, defpackage.cdq cdq) {
        this.b.a(obj, i, new defpackage.cfv(cdq));
    }

    /* access modifiers changed from: 0000 */
    public final android.graphics.Bitmap a(java.lang.Object obj) {
        if (obj != null) {
            defpackage.cfl cfl = this.c;
            java.lang.String a2 = ((AbsDeviceOwner) obj).getDisplayName();
            java.lang.String b2 = ((AbsDeviceOwner) obj).accountName();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (a2 != null) {
                arrayList.add(a2.toString());
            }
            if (b2 != null) {
                arrayList.add(b2.toString());
            }
            java.lang.String[] strArr = new java.lang.String[arrayList.size()];
            arrayList.toArray(strArr);
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(100, 100, android.graphics.Bitmap.Config.ARGB_8888);
            cfl.a.a(((AbsDeviceOwner) obj).accountName()).a(new defpackage.cqp(strArr)).a(createBitmap);
            return createBitmap;
        }
        if (this.d == null) {
            this.d = android.graphics.BitmapFactory.decodeResource(this.a.getResources(), 2130837657);
        }
        return this.d;
    }
}
