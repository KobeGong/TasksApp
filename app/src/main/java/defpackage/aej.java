package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: aej  reason: default package */
/* compiled from: PG */
public final class aej implements Runnable {
    private final /* synthetic */ aec a;

    aej(aec aec) {
        this.a = aec;
    }

    public final void run() {
        if (this.a.e != null) {
            if (sn.a.s(this.a.e) && this.a.e.getCount() > this.a.e.getChildCount() && this.a.e.getChildCount() <= this.a.k) {
                this.a.r.setInputMethodMode(2);
                this.a.d();
            }
        }
    }
}
