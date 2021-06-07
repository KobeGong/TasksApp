package defpackage;

import java.io.IOException;

/* renamed from: dly  reason: default package */
/* compiled from: PG */
public final class dly extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    dly(int i, int i2) {
        super(new StringBuilder(108).append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ").append(i).append(" limit ").append(i2).append(").").toString());
    }
}
