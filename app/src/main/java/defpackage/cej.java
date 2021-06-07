package defpackage;

import android.graphics.Bitmap;

/* renamed from: cej  reason: default package */
final /* synthetic */ class cej implements Runnable {
    private final cei a;
    private final cel b;

    cej(cei cei, cel cel) {
        this.a = cei;
        this.b = cel;
    }

    public final void run() {
        cei cei = this.a;
        cel cel = this.b;
        if (!cel.a()) {
            Object obj = cel.a;
            if (obj == null) {
                cel.a(cei.c.a(null));
                return;
            }
            int i = cel.b;
            cdf cdf = cei.b;
            String b2 = ((cdu) obj).b();
            String sb = new StringBuilder(String.valueOf(b2).length() + 12).append(b2).append("|").append(i).toString();
            Bitmap bitmap = (Bitmap) cei.a.get(sb);
            if (bitmap != null) {
                cel.a(bitmap);
            } else {
                cei.c.a(obj, cel.b, new cek(cei, cel, sb, obj));
            }
        }
    }
}
