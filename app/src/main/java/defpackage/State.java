package defpackage;

/* renamed from: w reason: default package */
/* compiled from: PG */
public enum State {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(State wVar) {
        return compareTo(wVar) >= 0;
    }
}
