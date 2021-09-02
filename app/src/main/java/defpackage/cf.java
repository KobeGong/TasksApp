package defpackage;

/* renamed from: cf reason: default package */
/* compiled from: PG */
public final class cf {
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public float d;
    public float[] e = new float[6];
    public int f;
    public defpackage.ca[] g = new defpackage.ca[8];
    public int h = 0;

    public cf(int i) {
        this.f = i;
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.ca caVar) {
        for (int i = 0; i < this.h; i++) {
            if (this.g[i] == caVar) {
                for (int i2 = 0; i2 < (this.h - i) - 1; i2++) {
                    this.g[i + i2] = this.g[i + i2 + 1];
                }
                this.h--;
                return;
            }
        }
    }

    public final void a() {
        this.f = defpackage.bg.i;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.h = 0;
    }

    public final java.lang.String toString() {
        return "" + null;
    }
}
