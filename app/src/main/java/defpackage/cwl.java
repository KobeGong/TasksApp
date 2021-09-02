package defpackage;

/* renamed from: cwl reason: default package */
/* compiled from: PG */
public abstract class cwl implements java.io.Serializable, java.lang.Iterable {
    public abstract int b(int i);

    public boolean a(int i) {
        return b(i) >= 0;
    }

    public final java.util.Iterator iterator() {
        return new defpackage.csh(this);
    }
}
