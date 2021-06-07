package defpackage;

import android.graphics.Bitmap;

/* renamed from: cek  reason: default package */
final /* synthetic */ class cek implements cdq {
    private final cei a;
    private final cel b;
    private final String c;
    private final Object d;

    cek(cei cei, cel cel, String str, Object obj) {
        this.a = cei;
        this.b = cel;
        this.c = str;
        this.d = obj;
    }

    @Override // defpackage.cdq
    public final void a(Bitmap bitmap) {
        cei cei = this.a;
        cel cel = this.b;
        String str = this.c;
        Object obj = this.d;
        if (!cel.a()) {
            if (bitmap != null) {
                cei.a.put(str, bitmap);
            }
            if (bitmap == null) {
                bitmap = cei.c.a(obj);
            }
            cel.a(bitmap);
        }
    }
}
