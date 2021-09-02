package defpackage;

/* renamed from: crd reason: default package */
/* compiled from: PG */
public abstract class crd implements java.io.Serializable {
    public static final long serialVersionUID = 808575179767517313L;

    public abstract java.util.Map b();

    public void a(java.net.URI uri, java.util.concurrent.Executor executor, defpackage.crf crf) {
        executor.execute(new defpackage.cre(this, uri, crf));
    }
}
