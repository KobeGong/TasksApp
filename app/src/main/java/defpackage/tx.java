package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: tx  reason: default package */
/* compiled from: PG */
public final class tx {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e = Long.MIN_VALUE;
    public long f = 0;
    public int g = 0;
    public long h = -1;
    public float i;
    public int j;

    tx() {
    }

    /* access modifiers changed from: package-private */
    public final float a(long j2) {
        if (j2 < this.e) {
            return 0.0f;
        }
        if (this.h < 0 || j2 < this.h) {
            return tw.a(((float) (j2 - this.e)) / ((float) this.a), 0.0f, 1.0f) * 0.5f;
        }
        return (tw.a(((float) (j2 - this.h)) / ((float) this.j), 0.0f, 1.0f) * this.i) + (1.0f - this.i);
    }
}
