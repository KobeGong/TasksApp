package defpackage;

/* renamed from: cek reason: default package */
final /* synthetic */ class cek implements defpackage.cdq {
    private final defpackage.cei a;
    private final defpackage.cel b;
    private final java.lang.String c;
    private final java.lang.Object d;

    cek(defpackage.cei cei, defpackage.cel cel, java.lang.String str, java.lang.Object obj) {
        this.a = cei;
        this.b = cel;
        this.c = str;
        this.d = obj;
    }

    public final void a(android.graphics.Bitmap bitmap) {
        defpackage.cei cei = this.a;
        defpackage.cel cel = this.b;
        java.lang.String str = this.c;
        java.lang.Object obj = this.d;
        if (!cel.a()) {
            if (bitmap != null) {
                defpackage.cei.a.put(str, bitmap);
            }
            if (bitmap == null) {
                bitmap = cei.c.a(obj);
            }
            cel.a(bitmap);
        }
    }
}
