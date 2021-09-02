package defpackage;

/* renamed from: cvt reason: default package */
/* compiled from: PG */
public abstract class cvt {
    public final int a;
    public final defpackage.cuf b;

    public cvt(defpackage.cuf cuf, int i) {
        if (cuf == null) {
            throw new java.lang.IllegalArgumentException("format options cannot be null");
        } else if (i < 0) {
            throw new java.lang.IllegalArgumentException("invalid index: " + i);
        } else {
            this.a = i;
            this.b = cuf;
        }
    }

    public abstract void a(defpackage.cvu cvu, java.lang.Object obj);
}
