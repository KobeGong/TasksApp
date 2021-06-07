package defpackage;

/* renamed from: bxh  reason: default package */
/* compiled from: PG */
public final class bxh extends Exception {
    public final int a;

    public bxh(Integer num, String str) {
        super(String.format("HTTP Error Code: %d %s", num, str));
        this.a = num.intValue();
    }
}
