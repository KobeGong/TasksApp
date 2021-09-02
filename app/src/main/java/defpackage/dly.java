package defpackage;

/* renamed from: dly reason: default package */
/* compiled from: PG */
public final class dly extends java.io.IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    dly(int i, int i2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
    }
}
