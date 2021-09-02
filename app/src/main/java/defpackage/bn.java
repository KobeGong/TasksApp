package defpackage;

/* renamed from: bn reason: default package */
/* compiled from: PG */
public enum bn {
    NONE,
    SIMPLE,
    CHOICE,
    PLURAL,
    SELECT,
    SELECTORDINAL;

    public final boolean a() {
        return this == PLURAL || this == SELECTORDINAL;
    }
}
