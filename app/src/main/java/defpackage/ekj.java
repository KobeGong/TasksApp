package defpackage;

/* renamed from: ekj reason: default package */
/* compiled from: PG */
final class ekj implements java.util.concurrent.ThreadFactory {
    public final /* synthetic */ int a;

    ekj(int i) {
        this.a = i;
    }

    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return java.util.concurrent.Executors.defaultThreadFactory().newThread(new defpackage.ekk(this, runnable));
    }
}
