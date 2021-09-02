package defpackage;

/* renamed from: u reason: default package */
/* compiled from: PG */
public abstract class Lifecycle {
    public abstract State getCurrentState();

    public abstract void addObserver(LifecycleObserver xVar);

    public abstract void removeObserver(LifecycleObserver xVar);
}
