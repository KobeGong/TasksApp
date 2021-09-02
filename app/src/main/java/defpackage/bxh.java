package defpackage;

/* renamed from: bxh reason: default package */
/* compiled from: PG */
public final class bxh extends java.lang.Exception {
    public final int a;

    public bxh(java.lang.Integer num, java.lang.String str) {
        super(java.lang.String.format("HTTP Error Code: %d %s", new java.lang.Object[]{num, str}));
        this.a = num.intValue();
    }
}
