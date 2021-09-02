package defpackage;

/* renamed from: jt reason: default package */
/* compiled from: PG */
final class jt implements defpackage.ju {
    private final android.view.ViewGroupOverlay a;

    jt(android.view.ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    public final void a(android.view.View view) {
        this.a.add(view);
    }

    public final void b(android.view.View view) {
        this.a.remove(view);
    }
}
