package defpackage;

/* renamed from: w  reason: default package */
/* compiled from: PG */
public enum w {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(w wVar) {
        return compareTo(wVar) >= 0;
    }
}
