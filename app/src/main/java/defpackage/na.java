package defpackage;

import android.support.v4.app.LoaderManagerImpl;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: na  reason: default package */
/* compiled from: PG */
public abstract class na {
    public abstract oc a(int i, nb nbVar);

    public abstract void a();

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void b();

    public static na a(y yVar) {
        return new LoaderManagerImpl(yVar, ((ak) yVar).b());
    }
}
