package defpackage;

import java.io.File;

/* renamed from: cpj  reason: default package */
/* compiled from: PG */
public final class cpj implements Comparable {
    public File a;
    public long b;
    public long c;
    public boolean d;

    public cpj(File file) {
        this.a = file;
        this.b = file.lastModified();
        this.c = file.length();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        cpj cpj = (cpj) obj;
        if (this.d) {
            if (!cpj.d) {
                return 1;
            }
            if (this.b < cpj.b) {
                return -1;
            }
            return this.b <= cpj.b ? 0 : 1;
        } else if (cpj.d) {
            return -1;
        } else {
            if (cpj.c < this.c) {
                return -1;
            }
            return cpj.c <= this.c ? 0 : 1;
        }
    }
}
