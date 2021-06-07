package defpackage;

/* renamed from: cvt  reason: default package */
/* compiled from: PG */
public abstract class cvt {
    public final int a;
    public final cuf b;

    public cvt(cuf cuf, int i) {
        if (cuf == null) {
            throw new IllegalArgumentException("format options cannot be null");
        } else if (i < 0) {
            throw new IllegalArgumentException(new StringBuilder(26).append("invalid index: ").append(i).toString());
        } else {
            this.a = i;
            this.b = cuf;
        }
    }

    public abstract void a(cvu cvu, Object obj);
}
