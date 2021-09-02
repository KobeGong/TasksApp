package defpackage;

/* renamed from: cpj reason: default package */
/* compiled from: PG */
public final class cpj implements java.lang.Comparable {
    public java.io.File a;
    public long b;
    public long c;
    public boolean d;

    public cpj(java.io.File file) {
        this.a = file;
        this.b = file.lastModified();
        this.c = file.length();
    }

    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.cpj cpj = (defpackage.cpj) obj;
        if (this.d) {
            if (!cpj.d) {
                return 1;
            }
            if (this.b < cpj.b) {
                return -1;
            }
            if (this.b <= cpj.b) {
                return 0;
            }
            return 1;
        } else if (cpj.d) {
            return -1;
        } else {
            if (cpj.c < this.c) {
                return -1;
            }
            if (cpj.c <= this.c) {
                return 0;
            }
            return 1;
        }
    }
}
