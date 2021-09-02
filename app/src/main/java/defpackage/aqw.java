package defpackage;

/* renamed from: aqw reason: default package */
public final /* synthetic */ class aqw implements java.lang.Runnable {
    private final defpackage.aoc a;

    public aqw(defpackage.aoc aoc) {
        this.a = aoc;
    }

    public final void run() {
        defpackage.aoc aoc = this.a;
        if (!aoc.a.r() && aoc.a.s != null) {
            aoc.a.s.a(3);
        }
    }
}
