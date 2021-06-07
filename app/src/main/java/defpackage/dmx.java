package defpackage;

/* renamed from: dmx  reason: default package */
/* compiled from: PG */
public final class dmx {
    private final String a;

    private dmx(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }

    public static dmx a(String str) {
        return new dmx(str);
    }
}
