package defpackage;

import java.io.IOException;

/* renamed from: bkv  reason: default package */
/* compiled from: PG */
public class bkv extends IOException {
    public static final long serialVersionUID = 1;

    bkv(int i, int i2) {
        super(new StringBuilder(108).append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ").append(i).append(" limit ").append(i2).append(").").toString());
    }

    public bkv(String str) {
        super(str);
    }

    public bkv(String str, Throwable th) {
        super(str, th);
    }

    public bkv(String str, byte b) {
        this(str, (Throwable) null);
    }
}
