package defpackage;

/* renamed from: ll reason: default package */
/* compiled from: PG */
public final class ll {
    public final FragmentHostCallback a;

    ll(FragmentHostCallback lmVar) {
        this.a = lmVar;
    }

    public final Fragment a(java.lang.String str) {
        return this.a.mFragmentManager.b(str);
    }

    public final void a() {
        this.a.mFragmentManager.noteStateNotSaved();
    }

    public final boolean b() {
        return this.a.mFragmentManager.j();
    }
}
