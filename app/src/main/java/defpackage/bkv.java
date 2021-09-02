package defpackage;

/* renamed from: bkv reason: default package */
/* compiled from: PG */
public class bkv extends java.io.IOException {
    public static final long serialVersionUID = 1;

    bkv(int i, int i2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
    }

    public bkv(java.lang.String str) {
        super(str);
    }

    public bkv(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public bkv(java.lang.String str, byte b) {
        this(str, (java.lang.Throwable) null);
    }
}
