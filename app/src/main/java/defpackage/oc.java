package defpackage;

/* renamed from: oc reason: default package */
/* compiled from: PG */
public class oc {
    public int c;
    public defpackage.od d;
    public android.content.Context e;
    public boolean f = false;
    public boolean g = false;
    public boolean h = true;
    public boolean i = false;

    public oc(android.content.Context context) {
        this.e = context.getApplicationContext();
    }

    public void a(java.lang.Object obj) {
        if (this.d != null) {
            this.d.b(obj);
        }
    }

    public void e() {
    }

    public boolean b() {
        return false;
    }

    public void a() {
    }

    public void f() {
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        defpackage.jd.a((java.lang.Object) this, sb);
        sb.append(" id=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public void a(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.c);
        printWriter.print(" mListener=");
        printWriter.println(this.d);
        if (this.f || this.i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.i);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (this.g || this.h) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.g);
            printWriter.print(" mReset=");
            printWriter.println(this.h);
        }
    }
}
