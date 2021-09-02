package defpackage;

/* renamed from: cej reason: default package */
final /* synthetic */ class cej implements java.lang.Runnable {
    private final defpackage.cei a;
    private final defpackage.cel b;

    cej(defpackage.cei cei, defpackage.cel cel) {
        this.a = cei;
        this.b = cel;
    }

    public final void run() {
        defpackage.cei cei = this.a;
        defpackage.cel cel = this.b;
        if (!cel.a()) {
            java.lang.Object obj = cel.a;
            if (obj == null) {
                cel.a(cei.c.a(null));
                return;
            }
            int i = cel.b;
            defpackage.cdf cdf = cei.b;
            java.lang.String b2 = ((defpackage.cdu) obj).b();
            java.lang.String sb = new java.lang.StringBuilder(java.lang.String.valueOf(b2).length() + 12).append(b2).append("|").append(i).toString();
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) defpackage.cei.a.get(sb);
            if (bitmap != null) {
                cel.a(bitmap);
            } else {
                cei.c.a(obj, cel.b, new defpackage.cek(cei, cel, sb, obj));
            }
        }
    }
}
